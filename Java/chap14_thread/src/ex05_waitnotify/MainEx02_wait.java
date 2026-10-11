
package ex05_waitnotify;

/*
 * wait(), notify(), notifyAll()
 * 1. 동기화영역(동기화블럭, 동기화메서드)에서만 사용이 가능한 메서드 : IllegalMonitorStateException 예외 발생
 * 2. Object 클래스의 멤버임 => 모든 객체들은 호출이 가능함.
 * 3. wait() : 실행중인 스레드를 대기상태로 변환. lock 해제함
 *    notify() : wait 중인 스레드 한개를 Runnable 상태로 변환함. 개발자가 wait 상태의 스레드를 선택 불가
 *    notifyAll() : wait 중인 모든 스레드를 Runnable 상태로 변환함.
 */
class ATM2 implements Runnable { // 구현클래스. Thread 클래스 아님
	private int money = 100000;

	public void run() {
		int time = 0;
		try {
			time = (int) (Math.random() * 1000);
			Thread.sleep(time);
		} catch (InterruptedException e) {
		}
		System.out.println(Thread.currentThread().getName() + "========: " + time);
		synchronized (this) { // 철수
			while (true) {
				if (money <= 0) {
					this.notifyAll();
					break;
				}
				withdraw();
				if (money % 20000 == 0) {
					try {
						this.wait(); // 현재 실행 중인 스레드가 대기 상태. lock 해제함
					} catch (InterruptedException e) {
					}
				} else {
					notifyAll();
				}
			}
		}
		System.out.println(Thread.currentThread().getName() + "동기화블럭 탈출: " + time);
	}

	private void withdraw() {
		if (money <= 0)
			return;
		money -= 10000; // 40000
		System.out.println(Thread.currentThread().getName() + "출금, 잔액:" + money);
	}
}

public class MainEx02_wait {
	public static void main(String[] args) {
		ATM2 atm = new ATM2();
		Thread t1 = new Thread(atm, "철수");
		Thread t2 = new Thread(atm, "영희");
		Thread t3 = new Thread(atm, "길동");
		t1.start();t2.start();t3.start();
	}
}