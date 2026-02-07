package ex02_daemon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * WordGame을 Runnable 방식으로 변경하기
 * 람다방식으로 코딩
 */
public class Exam01_WordGame2 {
	public static void main(String[] args) {
		List<String> words = new ArrayList<>();
		String[] data = { "뷔", "슈가", "제이홉", "알앰", "정국", "지민", "진" };
		int interval = 3 * 1000;
		Scanner scan = new Scanner(System.in);
		words.add(data[0]); // 뷔
		Thread t1 = new Thread(() -> {
			// 메서드의 지역변수는 상수화 필요.
			// interval = 3000;
			while (true) {
				words.add(data[(int) (Math.random() * data.length)]);
				try {
					Thread.sleep(interval);
				} catch (InterruptedException e) {
				}
			}
		});
		t1.setDaemon(true); // daemon 스레드로 설정
		t1.start();
		while (true) {
			System.out.println(words); // Thread 가 추가한 데이터 출력
			System.out.print(">>");
			String input = scan.next().trim();
			words.remove(input); // input 에 해당되는 데이터를 words 에서 제거
			if (words.size() == 0)
				break;
		}
		System.out.println("프로그램 종료"); // main 종료. DataAddThread 스레드 종료
	}
}
