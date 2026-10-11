package test0121;

/*
1. SumThread 구현하기
1부터 1000까지의 합을 5개의 스레드가 나누어 합을 구하기 : Thread 클래스를 상속받는 방식으로 구현하기
t1 : 1 ~ 200까지 합
t2 : 201 ~400까지 합
t3 : 401 ~ 600까지 합
t4 : 601 ~ 800까지 합
t5 : 801 ~ 1000까지 합

main 스레드 : 
모든 스레드가 종료할때 까지 기다렸다가 
모든 스레드의 합을 더해서 1 ~ 1000까지의 합 출력하는 프로그램 
*/
class SumThread extends Thread {
	int f;
	int d;
	int sum;

	SumThread(int f, int d) {
		this.f = f;
		this.d = d;
	}

	public void run() {
		for (; f <= d; f++) {
			sum += f;
		}
	}
}

public class Test02 {
	public static void main(String[] args) throws InterruptedException {
		SumThread[] arr = new SumThread[5];

		int sum = 0;
		arr[0] = new SumThread(1, 200);
		arr[1] = new SumThread(201, 400);
		arr[2] = new SumThread(401, 600);
		arr[3] = new SumThread(601, 800);
		arr[4] = new SumThread(801, 1000);

		for (SumThread i : arr) {
			i.start();
		}
		for (SumThread i : arr) {
			i.join();
			sum += i.sum;
			System.out.println(i.getName() + ": " + i.sum);
		}
		System.out.println("1 ~ 1000까지의 합:" + sum);
	}
}
