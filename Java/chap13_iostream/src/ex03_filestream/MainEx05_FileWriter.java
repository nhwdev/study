package ex03_filestream;

import java.io.FileWriter;
import java.io.IOException;

/*
 * FileWriter 예제
 * 주요메서드
 *   void write(int data) : 1char만 출력
 *   void write(char[] buf) : buf 의 내용을 출력
 *   void write(char[] buf,int offset,int len) : buf 의 내용중 offset 인덱스부터 len 크기만큼 출력
 *   void write(String str) : str 문자열의 내용을 출력
 */
public class MainEx05_FileWriter {
	public static void main(String[] args) throws IOException {
		System.out.println("out2.txt 파일에 내용이 저장됩니다.");
		FileWriter fw = new FileWriter("out2.txt");
		fw.write('1');fw.write('2');fw.write('3');
		fw.write('a');fw.write('b');fw.write('c');
		fw.write('가');fw.write('나');fw.write('다');
		char[] buf = "\nFileWriter 예제입니다.\n".toCharArray();
		fw.write(buf);
		fw.write(buf, 5, 6);
		fw.write("\nWriter 클래스는 String 타입을 직접 출력할 수 있습니다.");
		fw.flush();
		fw.close();
	}
}