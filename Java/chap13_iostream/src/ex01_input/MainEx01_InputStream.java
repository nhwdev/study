package ex01_input;

import java.io.IOException;
import java.io.InputStream;

/*
 * 입출력 스트림 : 데이터의 이동통로. 단방향
 *   입력스트림
 *     바이트 : InputStream
 *       - 1byte 기준으로 데이터 읽기
 *       - 동영상,이미지, 텍스트, 음원 ...
 *     문자   : Reader
 *       - 1char(2byte) 기준으로 데이터 읽기
 *       - 텍스트 데이터 읽기
 *   출력스트림
 *     바이트 : OutputStream
 *       - 1byte 기준으로 데이터 출력 
 *       - 동영상,이미지, 텍스트, 음원 ...
 *     문자   : Writer
 *       - 1char(2byte) 기준으로 데이터 출력
 *       - 텍스트 데이터 출력
 *       
 *  InputStreamReader : 문자형입력스트림 <= 바이트형입력스트림. Reader의 하위 클래스
 *  OutputStreamWriter: 문자형출력스트림 <= 바이트형출력스트림. Writer의 하위 클래스
 *    
 *  바이트형입출력스트림 <= 문자형입출력스트림 변경은 불가함  
 *  
 *  자바에서 제공되는 표준 입출력 스트림 
 *    표준입력스트림 : InputStream System.in => 키보드에서 데이터 입력
 *    표준출력스트림 : PrintStream System.out => 콘솔(화면)로 출력
 *    표준오류스트림 : PrintStream System.err => 콘솔(화면)로 출력. 빨강색
 */
public class MainEx01_InputStream {
	public static void main(String[] args) throws IOException {
		InputStream in = System.in;
		int data = 0;
		// in.read() : 키보드에서 1byte씩 읽어 data에 저장
		while ((data = in.read()) != -1) { // ctrl+z(End Of File)
			System.out.print((char) data); // 한글깨짐현상
		}
	}
}