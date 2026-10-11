package test0121;

/*
   1. CountDownThread라는 이름의 스레드 클래스를 만드세요. 
   2. 이 스레드는 10부터 1까지 1초 간격으로 숫자를 출력합니다. 
   3. 메인(Main) 스레드에서는 카운트다운 스레드를 실행시킨 뒤, 
       "메인 스레드 시작!"을 출력하고 5초 뒤에 "메인 스레드 종료!"를 출력하세요.

   다음 결과가 나오도록 CountDownThread 클래스 구현하기
[결과]
>>> 메인 스레드 시작!
[카운트다운] 10
[카운트다운] 9
[카운트다운] 8
[카운트다운] 7
[카운트다운] 6
>>> 메인 스레드 종료! (5초 경과)
[카운트다운] 5
[카운트다운] 4
[카운트다운] 3
[카운트다운] 2
[카운트다운] 1
[카운트다운] 종료!
 */
class CountDownThread extends Thread {
	public void run() {
		for (int i = 10; i > 0; i--) {
			if (i < 10) {
				try {
					sleep(1000);
				} catch (InterruptedException e) {
				}
			}
			System.out.println("[카운트다운] " + i);
		}
		System.out.println("[카운트다운] 종료!");
	}
}

public class Test01 {
	public static void main(String[] args) {
		CountDownThread countThread = new CountDownThread();
		countThread.start();
		System.out.println(">>> 메인 스레드 시작!");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(">>> 메인 스레드 종료! (5초 경과)");

	}
}
