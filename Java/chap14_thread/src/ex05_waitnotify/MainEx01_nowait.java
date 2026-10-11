package ex05_waitnotify;

class ATM implements Runnable {
	private int money = 100000;

	public void run() {
		try {
			Thread.sleep((int) (Math.random() * 1000)); // 0 ~ 999밀리초
		} catch (InterruptedException e) {
		}
		synchronized (this) { // this 로 lock 객체 사용
			while (true) {
				if (money <= 0)
					break;
				withdraw();
			}
		} // 동기화블럭 종료. lock 해제
	}

	private void withdraw() {
		if (money <= 0)
			return;
		money -= 10000;
		System.out.println(Thread.currentThread().getName() + "출금, 잔액:" + money);
	}
}

public class MainEx01_nowait {
	public static void main(String[] args) {
		ATM atm = new ATM();
		Thread t1 = new Thread(atm, "철수");
		Thread t2 = new Thread(atm, "영희");
		t1.start();t2.start();
	}
}