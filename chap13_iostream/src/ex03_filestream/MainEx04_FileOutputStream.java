package ex03_filestream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/*
 * out.txt파일이 존재하는 경우 
 * 기존의 내용은 없애고, 새로운 내용으로 출력함.
 * 기존의 내용을 남기고 싶은 경우 
 * 
 * fos = new FileOutputStream("out.txt",true)
 *   out.txt 파일이 없는 경우. 파일 생성후 내용을 출력함
 *   out.txt 파일이 있는 경우. 기존의 내용 이후에 새로운 내용을 추가함.
 */
public class MainEx04_FileOutputStream {
	public static void main(String[] args) throws IOException {
		System.out.println("out.txt파일에 내용이 추가됩니다.");
		OutputStream fos = new FileOutputStream("out.txt", true);
		fos.write('1');fos.write('2');fos.write('3');
		fos.write('a');fos.write('b');fos.write('c');
		fos.write('가');fos.write('나');fos.write('다'); // 한글 부분 깨짐
		// write(byte[]) 메서드로 출력하기
		// String.getBytes() : 문자열의 내용을 byte[]로 리턴
		byte[] buf = "\nFileOutputStream 예제 입니다.\n".getBytes();
		fos.write(buf); // buf의 내용을 File 출력
		// write(byte[],int,int) 메서드로 출력하기
		fos.write(buf, 5, 6); // buf의 내용 중 5번인덱스 부터 6바이트 출력
		fos.write("\n============================\n".getBytes());
		fos.flush();
		fos.close();
	}
}