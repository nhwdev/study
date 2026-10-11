package ex02_daemon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Thread : 3초에 한번씩 List 에 단어를 추가함. Daemon 스레드로 생성
 * main   : List 에 추가된 단어를 입력받아서 제거함. 
 * => main 이 List 의 모든 단어를 제거하면 main 종료. 
 */
class DataAddThread extends Thread { // DaemonThread로 설정. main이 종료전까지만 실행
	List<String> words;
	String[] data;
	int interval; // 3초

	public DataAddThread(List<String> words, String[] data, int interval) {
		this.words = words;
		this.data = data;
		this.interval = interval;
	}

	public void run() {
		while (true) {
			words.add(data[(int) (Math.random() * data.length)]); // 0 ~ 6사이의 임의의 정수 인덱스설정
			try {
				sleep(interval); // 3초 대기
			} catch (InterruptedException e) {
			}
		}
	}
}

public class MainEx02_WordGame {
	public static void main(String[] args) {
		List<String> words = new ArrayList<>();
		String[] data = { "뷔", "슈가", "제이홉", "알앰", "정국", "지민", "진" };
		int interval = 3 * 1000;
		Scanner scan = new Scanner(System.in);
		words.add(data[0]); // 뷔
		DataAddThread t1 = new DataAddThread(words, data, interval);
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