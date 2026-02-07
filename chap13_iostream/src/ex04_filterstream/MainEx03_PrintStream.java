
package ex04_filterstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/*
 * 오류 메세지를 파일에 저장하기
 * 생성자
 *  - PrintStream(OutputStream) 
 *  - PrintStream(String filename) :  filename 파일에 직접 출력기능 
 *  - PrintStream(OutputStream os,boolean autoflush) : filename 파일에 직접 출력기능. 자동 flush 기능 
 *      => PrintStream만으로 파일에 기존 내용에 추가할 수 없음.
 *      
 * 기존내용에 추가필요 : PrintStream(new FileOutputStream(파일이름,true))     
 */
public class MainEx03_PrintStream {
	public static void main(String[] args) throws FileNotFoundException {
		PrintStream ps = new PrintStream(new FileOutputStream("errorlog.txt",true));
		try {
			throw new Exception("예외 강제 발생");
		} catch(Exception e) {
			e.printStackTrace(ps); //ps에 오류 메세지 출력
		}
	}
}
