package ex01_create;

/*
 * Runnable 인터페이스를 이용하여 Thread 생성
 *  - Runnable 인터페이스의 구현 클래스의 객체는 Thread 객체가 아님
 *  - Runnable 인터페이스의 추상메서드는 run() 메서드임.
 *  - Thread 생성 : new Thread(Runnable 객체);
 */
class MyRunnable implements Runnable {
	@Override
	public void run() { // 3. Running 상태.
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + "=" + Thread.currentThread().getName());
			try {
				Thread.sleep(1000); // 4. 대기 상태
			} catch (InterruptedException e) {
			}
		}
	} // 5. Dead 상태. Thread 종료됨
}

public class MainEx02_Runnable {
	public static void main(String[] args) {
		// main 도 스레드임. 이름이 main 인 스레드.
		// Thread.currentThread() : 현재 실행 중인 스레드 리턴
		System.out.println(Thread.currentThread().getName() + "스레드 시작");
		Runnable r = new MyRunnable(); // Thread 아님.
		Thread t1 = new Thread(r, "First"); // 1. Thread 생성
		Thread t2 = new Thread(r, "Second");// 1. Thread 생성
		t1.start();
		t2.start();
		/*
		 * start 메서드의 기능 
		 * 1. 스택영역을 병렬화 함 
		 * 2. r 객체의 run 메서드를 호출함
		 */
//		t1.run();
//		t2.run();
		System.out.println(Thread.currentThread().getName() + "스레드 종료");
	}
}