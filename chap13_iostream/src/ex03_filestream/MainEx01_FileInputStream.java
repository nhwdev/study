package ex03_filestream;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * FileInputStream 클래스를 이용하여
 * 파일을 읽어 내용을 화면에 출력하기
 * 주요메서드
 *   int read() : 1byte씩 읽어 데이터를 리턴
 *   int read(byte[] buf) : buf 의 크기만큼 읽어서 데이터는 buf에 저장. 실제읽은 바이트수 리턴
 *   int read(byte[] buf,int offset, int len)
 *   : len 크기 만큼 읽어서 데이터는 buf의 offset 인덱스부터 저장. 실제 읽은 바이트수 리턴
 *   int available() : 읽기 가능 바이트 수 리턴  
 */
public class MainEx01_FileInputStream {
	public static void main(String[] args) throws IOException {
		// filename : 읽기위한 파일의 이름 설정
		String filename = "src/ex01_input/MainEx01_inputstream.java";
		// fis : filename 파일을 읽기위한 스트림
		FileInputStream fis = new FileInputStream(filename);
		int data = 0;
		System.out.println("===== read() 메서드를 이용하여 파일 읽기 =====");
		while ((data = fis.read()) != -1) { // read() : 1byte씩 읽기
			System.out.print((char) data); // 한글깨져서 보임. data:파일의 내용중 1바이트
		}
		fis.close();
		System.out.println("===== read(byte[]) 메서드를 이용하여 파일 읽기 =====");
		fis = new FileInputStream(filename);
		// fis.available() : 읽기 가능 바이트 수 리턴
		// 읽기 가능 : 100byte.
		// 10 byte 읽은 경우 : 90byte
		// buf 크기 : 파일의 바이트 크기 만큼 설정함
		byte[] buf = new byte[fis.available()]; // fis.available() : 읽기전이므로 파일의 바이트 크기
		while ((data = fis.read(buf)) != -1) { // data : 읽은 바이트 수. buf : 파일의 내용
			// new String(buf,0,data) : buf의 내용을 0번인덱스부터 data 크기까지 문자열로 생성
			System.out.print(new String(buf, 0, data));
		}
		fis.close();
		System.out.println("===== read(byte[],int,int) 메서드를 이용하여 파일 읽기 =====");
		fis = new FileInputStream(filename);
		buf = new byte[fis.available() + 2];
		buf[0] = 'A';
		buf[1] = ':';
		while ((data = fis.read(buf, 2, buf.length - 2)) != -1) {
			System.out.print(new String(buf, 0, data + 2));
		}
		fis.close();
	}
}