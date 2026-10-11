package test0119;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/*
 * 화면에서 파일명을 입력받아서 해당 파일의 내용을 화면에 출력하기.
 * 만약 파일이 없는 경우는 '해당 파일 없음' 을 출력하기
 * 한글은 깨지지 않아야 함.
 * FileInputStream 사용하기
 */
public class Test01 {
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		try {
			FileInputStream fis = new FileInputStream(s.next());
			byte[] buf = new byte[fis.available()];
			int data = 0;
			while ((data = fis.read(buf)) != -1) {
				System.out.println(new String(buf, 0, data));
			}
		} catch (FileNotFoundException e) {
			System.out.println("해당 파일 없음");
		}
	}
}
