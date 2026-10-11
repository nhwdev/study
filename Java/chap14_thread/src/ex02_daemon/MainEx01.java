package ex02_daemon;

/*
 * Daemon 스레드
 * 1. 일반스레드의 보조기능을 담당
 * 2. 일반스레드가 종료되면, 데몬스레드도 자동 종료됨
 * 3. 가비지콜렉터가 대표 데몬스레드
 * 4. 무한반복 형태로 구현됨.
 * 5. setDaemon(true) : 데몬스레드로 설정. -> 생성상태에서 설정해야함
 */
class DaemonThread extends Thread {
	public void run() {
		while (true) { // 무한반복
			System.out.println(this);
			/*
			 * this : DaemonThrea 객체
			 * Thread.toString()
			 *      Thread[#22,Thread-1,5,main]
			 *      #22 : 스레드번호
			 *      Thread-1 : 스레드 이름. 스레드이름을 지정하지 않는 경우 Thread-0 부터 자동으로 부여됨.
			 *      5 : 스레드 우선순위 (1 ~ 10) . 1:우선순위낮음, 10:우선순위높음 5:기본우선순위
			 *      main : 스레드 그룹    
			 */
			try {
				sleep(100);
			} catch (InterruptedException e) {
			}
		}
	}
}

public class MainEx01 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("main 스레드 시작");
		Thread t1 = new DaemonThread();
		Thread t2 = new DaemonThread();
		t1.setDaemon(true);
		t2.setDaemon(true);
		t1.start();
		t2.start();
		Thread.sleep(2000);
		System.out.println("main 스레드 종료");
	}
}