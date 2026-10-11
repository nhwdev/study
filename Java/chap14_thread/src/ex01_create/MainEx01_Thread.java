package ex01_create;

/*
 * Thread 생성
 * 1. Thread 클래스 상속  <= 현재 소스
 * 2. Runnable 인터페이스를 구현방식 
 */
class MyThread extends Thread { // MyThread is a Thread

	MyThread(String name) { // 생성자
		super(name); // Thread 이름 설정
	}

	// Thread 가 실행해야되는 기능
	public void run() { // 3. Running 상태. 현재 run() 메서드를 실행 중인 상태
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + "=" + getName());
			try {
				// 4. 대기.
				sleep(1000); // 1000밀리초동안 대기. Thread 의 클래스 메서드
			} catch (InterruptedException e) {
			}
		}
	} // 5. Dead 상태. 스레드 종료
}

public class MainEx01_Thread {
	public static void main(String[] args) {
		System.out.println("main 스레드 시작");
		Thread t1 = new MyThread("First"); // 1. 생성상태
		Thread t2 = new MyThread("Second");// 1. 생성상태
		t1.start(); // 2. t1.Runnable 상태 => 스레드 시작
		t2.start(); // 2. t2.Runnable 상태 => 스레드 시작
		
		/* 
		 * start() : 스레드의 시작 
		 * 		   1. 스택영역을 병렬화 
		 * 		   2. 병렬화된 스택영역에 run() 메서드 호출
		 */
//		t1.run();
//		t2.run();
		System.out.println("main 스레드 종료");
	}
}