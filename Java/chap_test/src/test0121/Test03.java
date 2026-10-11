package test0121;

/*
 SumRunnable 클래스 구현하기 
1부터 1000까지의 합을 5개의 스레드가 나누어 합을 구하기 : Runnable 인터페이스를 구현하는 방식으로 구현하기
t1 : 1 ~ 200까지 합
t2 : 201 ~400까지 합
t3 : 401 ~ 600까지 합
t4 : 601 ~ 800까지 합
t5 : 801 ~ 1000까지 합
main 스레드 : 모든 스레드가 종료할때 까지 기다렸다가 
모든 스레드의 합을 더해서 1 ~ 1000까지의 합 출력하는 프로그램
 */
class SumRunnable implements Runnable {
	int f, b;
	int sum;

	SumRunnable(int f, int b) {
		this.f = f;
		this.b = b;
	}

	public void run() {
		for (int i = f; i <= b; i++) {
			sum += i;
		}
	}
}

public class Test03 {
	public static void main(String[] args) throws InterruptedException {
		SumRunnable[] arr = new SumRunnable[5];
		Thread[] t = new Thread[arr.length];
		int sum = 0;
		arr[0] = new SumRunnable(1, 200);
		arr[1] = new SumRunnable(201, 400);
		arr[2] = new SumRunnable(401, 600);
		arr[3] = new SumRunnable(601, 800);
		arr[4] = new SumRunnable(801, 1000);
		for (int i = 0; i < arr.length; i++) {
			t[i] = new Thread(arr[i]);
			t[i].start();
		}
		for (int i = 0; i < arr.length; i++) {
			t[i].join();
			sum += arr[i].sum;
		}
		System.out.println("1 ~ 1000까지의 합:" + sum);
	}
}
