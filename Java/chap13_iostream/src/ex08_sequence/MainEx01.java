package ex08_sequence;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

/*
 * SequenceInputStream 
 *    - 여러개의 InputStream을 하나의 InputStream 으로 연결하여 처리할 수 있는 스트림
 * 2개의 InputStream 연결 : new SequenceInputStream(InputStream, InputStream)
 * 여러개의 InputStream 연결 
 *    - new SequenceInputStream(Enumeration) : Vector 클래스로 연결하여 사용함
 */
public class MainEx01 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis1 = new FileInputStream("data.bak");
		FileInputStream fis2 = new FileInputStream("buffered.txt");
		SequenceInputStream si = new SequenceInputStream(fis1, fis2);
		byte[] buf = new byte[8096];
		int len = 0;
		while ((len = si.read(buf)) != -1) {
			System.out.println(new String(buf, 0, len));
		}
		si.close();
	}
}