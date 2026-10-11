package ex01_input;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/*
 * Reader : 문자형 입력스트림의 최상위 클래스. 추상클래스
 *          read() 에서 2byte단위(1char)로 데이터 읽기
 *          
 *  InputStreamReader : 바이트형입력스트림을 문자형입력스트림으로 변경.        
 *    Reader in = new InputStreamReader(InputStream)
 */
public class MainEx02_reader {
	public static void main(String[] args) throws IOException {
		// System.in : 표준입력. 키보드에서 입력
		// InputStreamReader : InputStream 객체를 Reader 로 변경
		// in 참조변수: 표준입력객체를 Reader 로 읽을 수 있는 객체 참조
		Reader in = new InputStreamReader(System.in);
		int data = 0;
		// data=in.read() : 키보드에서 한개의 문자(2byte)단위로 읽어 data 에 저장
		while ((data = in.read()) != -1) { // -1 : EOF. ctrl + z
			System.out.print((char) data);
		}
	}
}