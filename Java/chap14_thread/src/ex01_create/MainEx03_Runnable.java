package ex01_create;

/*
 * Runnable 인터페이스의 추상메서드는 run 메서드 한개임
 * => 람다방식으로 표현이 가능함
 */
public class MainEx03_Runnable {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + " 스레드 시작");
		Runnable r = () -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println(i + ":" + Thread.currentThread().getName());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
			}
		};
		Thread t1 = new Thread(r, "First"); // Runnable 객체, 스레드의 이름
		Thread t2 = new Thread(r, "Second");
		t1.start();
		t2.start();
		System.out.println(Thread.currentThread().getName() + " 스레드 종료");
	}
}