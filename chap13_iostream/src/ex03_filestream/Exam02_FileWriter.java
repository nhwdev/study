package ex03_filestream;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * 화면에서 exit 값이 입력될때까지의 내용을 입력받아 data2.txt 파일에 저장하기
 * FileWriter 이용하기.
 * [결과]
 * data2.txt 파일에 저장할 내용을 입력하세요(종료:exit)
 * aaa
 * bbb
 * 가나다
 * exit
 */
public class Exam02_FileWriter {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("data2.txt 파일에 저장할 내용을 입력하세요(종료:exit)");
		FileWriter fw = new FileWriter("data2.txt");
		while(true) {
			String str = scan.nextLine();
			if(str.equals("exit")) break;
			fw.write(str+"\n");
		}
		fw.flush();
		fw.close();
	}
}