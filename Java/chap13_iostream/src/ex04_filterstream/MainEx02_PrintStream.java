package ex04_filterstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/*
 * PrintStream
 *  - OutputStream의 하위 클래스 => 바이트형 출력스트림임.
 *  - 보조스트림
 *    출력기능을 다양하게 확장시킴. => print, println, printf
 *    => 모든 자료형 출력가능.
 *    => 예외처리 생략 가능
 *  - 표준출력(System.out),표준오류(System.err) 객체의 자료형  
 *    
 */
public class MainEx02_PrintStream {
	public static void main(String[] args) throws FileNotFoundException {
		FileOutputStream fos = new FileOutputStream("print.txt");
		PrintStream ps = new PrintStream(fos); //
		ps.println("홍길동"); // print.txt 파일에 홍길동 출력
		ps.println(1234); // int
		ps.println(true); // boolean
		ps.println(65); // int
		ps.write(65); // A
		ps.write(97); // a
		ps.flush();
		ps.close();
	}
}