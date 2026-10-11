package ex05_waitnotify;

/*
 * MainEx03 소스의 스레드를 Runnable 타입으로 변경하기.
 * MotherRunnable, SonRunnable 로 이름 정하기
 */
class MotherRunnable implements Runnable {
	Account account;

	MotherRunnable(Account account) {
		this.account = account; // 공유객체
	}

	public void run() {
		for (int i = 0; i < 20; i++) {
			account.input();
			try {
				Thread.sleep((int) (Math.random() * 3000)); // 0 ~ 3초동안 대기
			} catch (InterruptedException e) {
			}
		}
	}
}

class SonRunnable implements Runnable {
	Account account;

	SonRunnable(Account account) {
		this.account = account; // 공유객체
	}

	public void run() {
		for (int i = 0; i < 20; i++) {
			account.output();
			try {
				Thread.sleep((int) (Math.random() * 1000)); // 0 ~ 1초 동안 대기
			} catch (InterruptedException e) {
			}
		}
	}
}

public class Exam01 {
	public static void main(String[] args) {
		Account acc = new Account();
		Thread m = new Thread(new MotherRunnable(acc), "엄마스레드");
		Thread s = new Thread(new SonRunnable(acc), "아들스레드");
		m.start();s.start();
	}
}