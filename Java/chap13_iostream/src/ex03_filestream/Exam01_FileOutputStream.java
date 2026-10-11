package ex03_filestream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*
 * 화면에서 exit 값이 입력될때까지의 내용을 입력받아 data.txt 파일에 저장하기
 * FileOutputStream 이용하기. 한글도 출력하기
 * [결과]
 * data.txt 파일에 저장할 내용을 입력하세요(종료:exit)
 * aaa
 * bbb
 * 가나다
 * exit
 */
public class Exam01_FileOutputStream {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("data.txt 파일에 저장할 내용을 입력하세요(종료:exit)");
		FileOutputStream fos = new FileOutputStream("data.txt");
		while(true) {
			String data = scan.nextLine();
			if(data.equals("exit")) break;
			fos.write((data+"\n").getBytes());
		}
		fos.flush();
		fos.close();
	}
}