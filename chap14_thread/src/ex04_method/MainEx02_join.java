package ex04_method;

/*
 * join 메서드 : 스레드가 종료할 때까지 대기 
 */
class JoinThread extends Thread {
	long sum = 0;

	public void run() {
		for (int i = 1; i <= 100; i++)
			sum += i;
	}
}

public class MainEx02_join {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("스레드에서 1 ~ 100까지의 합 구하기:");
		JoinThread t1 = new JoinThread();
		t1.start();
//		Thread.sleep(100); //0.1초 동안 main이 대기 
		t1.join(); // t1스레드의 상태가 종료가 될때 까지, 현재 메서드(main)가 대기
		System.out.println("1 ~ 100까지의 합:" + t1.sum);
	}
}