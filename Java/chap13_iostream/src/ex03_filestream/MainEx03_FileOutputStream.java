package ex03_filestream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/*
 * FileOutputStream을 이용하여 파일 생성하기
 * 주요메서드
 *   void write(int data) : 1byte를 출력
 *   void write(byte[] buf) : buf의 내용을 출력
 *   void write(byte[] buf, int offset,int len) : buf 의 offset 인덱스 부터 len 크기만큼 출력
 * 
 * 파일생성되는 기본폴더 : 프로젝트 폴더임. chap13_iostream 폴더에 생성됨. 프로젝트 선택 후 F5 키 클릭  
 * 
 * fos = new FileOutputStream("out.txt") 
 *   out.txt 파일이 없으면 out.txt 파일을 생성하고, 데이터 출력함
 *   out.txt 파일이 있으면 out.txt 파일에 데이터 출력함
 *   
 * FileOutputStream 생성자는 FileNotFoundException 예외처리 필요함  
 *    => 파일 생성의 권한이 없는 경우 예외 발생함.
 */
public class MainEx03_FileOutputStream {
	public static void main(String[] args) throws IOException {
		System.out.println("out.txt파일에 내용이 저장됩니다.");
		OutputStream fos = new FileOutputStream("out.txt");
		fos.write('1');fos.write('2');fos.write('3');
		fos.write('a');fos.write('b');fos.write('c');
		fos.write('가');fos.write('나');fos.write('다'); // 한글 부분 깨짐
		// write(byte[]) 메서드로 출력하기
		// String.getBytes() : 문자열의 내용을 byte[]로 리턴
		byte[] buf = "\nFileOutputStream 예제 입니다.\n".getBytes();
		fos.write(buf); // buf의 내용을 File 출력
		// write(byte[],int,int) 메서드로 출력하기
		fos.write(buf, 5, 6); // buf 의 내용 중 5번인덱스 부터 6바이트 출력
		fos.flush();
		fos.close();
	}
}