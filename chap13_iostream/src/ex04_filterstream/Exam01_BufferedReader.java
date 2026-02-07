package ex04_filterstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
 * Scanner 를 사용하지 않고, 
 * ex04_filterstream.MainEx01_bufferedreader.java 파일의 10줄만 화면에 출력하기
 */
public class Exam01_BufferedReader {
	public static void main(String[] args) throws IOException {
		String filename = "src/ex04_filterstream/MainEx01_BufferedReader.java";
		BufferedReader br = new BufferedReader(new FileReader(filename));
		int cnt = 0;
		// 1
//		while(true) {
//			String data = br.readLine();
//			cnt++;
//			System.out.println(cnt + ":" + data);
//			if(cnt >= 10) break;
//		}
		// 2
//		for(int i=1;i<=10;i++) {
//			String data = br.readLine();
//			System.out.println(i + ":" + data);
//		}
		// 3 Scanner 사용
		Scanner scan = new Scanner(new FileReader(filename));
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + ":" + scan.nextLine());
		}
		br.close();
	}
}