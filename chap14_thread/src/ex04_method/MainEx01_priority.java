package ex04_method;

/*
 * 스레드의 우선순위 : 스케줄러가 Running 상태로 선택할때 우선순위로 확률을 높일 수 있다.
 *                     우선순위가 아래인 스레드도 Running 상태로 선택 될 수 있다.
 */
class ThreadPriority extends Thread {
	ThreadPriority(String name) {
		this(name, Thread.NORM_PRIORITY);
	}

	ThreadPriority(String name, int p) {
		super(name);
		this.setPriority(p); // 우선순위 설정
	}

	public void run() {
		try {
			sleep(300);
		} catch (InterruptedException e) {
		}
		for (int i = 0; i < 5; i++)
			System.out.println(this);
	}
}

public class MainEx01_priority {
	public static void main(String[] args) {
		System.out.println("Thread.MIN_PRIORITY=" + Thread.MIN_PRIORITY);
		System.out.println("Thread.MAX_PRIORITY=" + Thread.MAX_PRIORITY);
		System.out.println("Thread.NORM_PRIORITY=" + Thread.NORM_PRIORITY);
		Thread t1 = new ThreadPriority("First", Thread.MIN_PRIORITY); // 우선순위 : 1
		Thread t2 = new ThreadPriority("Second");                     // 우선순위 : 5
		Thread t3 = new ThreadPriority("Third", Thread.MAX_PRIORITY); // 우선순위 : 10
		t1.start();
		t2.start();
		t3.start();
	}
}