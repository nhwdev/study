package ex03_filestream;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/*
 * FileReader 클래스를 이용하여 파일의 내용을 읽어 화면에 출력하기
 * 주요메서드
 *   int read() : 파일에서 1char(2byte)를 읽어 데이터 리턴
 *   int read(char[] buf) : 파일에서 buf의 크기만큼 읽어서 내용은 buf에 저장. 실제 읽은 char 수를 리턴
 *   int read(char[] buf, int offset, int len) : 파일에서 len 만큼 읽어서, buf 의 offset 인덱스 부터 저장
 *                          실제 읽은 char 수를 리턴
 *                          
 * FileInputStream,FileReader의 생성자에서 FileNotFoundException 예외 처리 필요.  
 *                FileNotFoundException은 IOException의 하위 클래스   
 *  read() 함수는 IOException 예외 처리 필요                         
 */
public class MainEx02_Reader {
	public static void main(String[] args) throws IOException {
		String filename = "src/ex01_input/MainEx01_inputstream.java";
		Reader fr = new FileReader(filename);
		int data = 0;
		System.out.println("===== read() 메서드를 이용하여 파일 읽기 =====");
		while ((data = fr.read()) != -1) {
			System.out.print((char) data);
		}
		fr.close();
		System.out.println("===== read(char[]) 메서드를 이용하여 파일 읽기 =====");
		fr = new FileReader(filename);
		char[] buf = new char[8000];
		while ((data = fr.read(buf)) != -1) {
			System.out.println(new String(buf, 0, data));
		}
		fr.close();
		System.out.println("===== read(char[],int,int) 메서드를 이용하여 파일 읽기 =====");
		fr = new FileReader(filename);
		buf = new char[8000];
		buf[0] = 'B';
		buf[1] = ':';
		while ((data = fr.read(buf, 2, buf.length - 2)) != -1) {
			System.out.println(new String(buf, 0, data + 2));
		}
		fr.close();
	}
}