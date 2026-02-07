package ex05_waitnotify;

/*
 * 생산자 스레드, 소비자 스레드
 * 한개의 스레드는 데이터 생성하여 저장
 * 다른 한개의 스레드는 생성된 데이터를 사용
 * 
 * 엄마 스레드와 아들스레드가 한개의 계좌를 공유함.
 * 계좌에 잔액이 0이면 아들은 wait() 상태
 * 계좌에 잔액이 있는 경우 엄마는 wait() 상태
 * 엄마는 잔액이 0인 경우 10000,20000,30000만원중 임의로 금액을 입금함
 * 입금 후 아들을 깨운다.
 * 아들은 잔액이 있는 경우 잔액을 0으로 만들고, 엄마를 깨운다.
 * 
 * 엄마는 0~ 3000 밀리초동안 임의로 sleep.
 * 아들은 0~ 1000 밀리초동안 임의로 sleep.
 */
class Account { // 공유객체
	int money; // 잔액

	synchronized void output() { // 출금. 아들스레드가 호출 메서드
		while (money == 0) { // 잔액이 0인 경우 아들스레드 wait 상태로 변경
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		// money > 0 경우 실행됨
		notifyAll();
		System.out.println(Thread.currentThread().getName() + ":" + money + "원 출금");
		money = 0;
	}

	synchronized void input() { // 입금. 엄마스레드가 호출 메서드
		while (money > 0) { // 엄마스레드가 wait() 상태
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		// money == 0 인경우
		money = (((int) (Math.random() * 3)) + 1) * 10000; // 10000,20000,30000 중 한개의 금액 선택
		notifyAll();
		System.out.println(Thread.currentThread().getName() + ":" + money + "원 입금");
	}
}

class Mother extends Thread {
	Account account;

	Mother(Account account) {
		super("엄마스레드"); // 스레드 이름
		this.account = account; // 공유객체
	}

	public void run() {
		for (int i = 0; i < 20; i++) {
			account.input();
			try {
				sleep((int) (Math.random() * 3000)); // 0 ~ 3초동안 대기
			} catch (InterruptedException e) {
			}
		}
	}
}

class Son extends Thread {
	Account account;

	Son(Account account) {
		super("아들스레드");
		this.account = account; // 공유객체
	}

	public void run() {
		for (int i = 0; i < 20; i++) {
			account.output();
			try {
				sleep((int) (Math.random() * 1000)); // 0 ~ 1초 동안 대기
			} catch (InterruptedException e) {
			}
		}
	}
}

public class MainEx03 {
	public static void main(String[] args) {
		Account acc = new Account();
		Thread m = new Mother(acc);
		Thread s = new Son(acc);
		m.start();s.start();
	}
}