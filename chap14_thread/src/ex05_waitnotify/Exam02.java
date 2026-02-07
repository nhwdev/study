package ex05_waitnotify;

/*
 * MainEx03 소스의 스레드를 Runnable 타입으로 변경하기.
 * 람다방식으로 변경하기
 */
public class Exam02 {
	public static void main(String[] args) {
		Account acc = new Account();
		Thread m = new Thread(() -> {
			for (int i = 0; i < 20; i++) {
				acc.input();
				try {
					Thread.sleep((int) (Math.random() * 3000)); // 0 ~ 3초동안 대기
				} catch (InterruptedException e) {
				}
			}
		}, "엄마스레드");
		Thread s = new Thread(() -> {
			for (int i = 0; i < 20; i++) {
				acc.output();
				try {
					Thread.sleep((int) (Math.random() * 1000)); // 0 ~ 1초 동안 대기
				} catch (InterruptedException e) {
				}
			}
		}, "아들스레드");
		m.start();
		s.start();
	}
}