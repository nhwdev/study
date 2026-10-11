package ex03_filestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * src/ex01_input/MainEx01_inputstream.java 파일을 읽어서
 * src/ex01_input/MainEx01_inputstream.bak 파일로 복사하기
 */
public class Exam03_FileInOut {
	public static void main(String[] args) throws IOException {
		String ofile = "src/ex01_input/MainEx01_inputstream.java";
		String bfile = "src/ex01_input/MainEx01_inputstream.bak";
		FileInputStream fis = new FileInputStream(ofile);
		FileOutputStream fos = new FileOutputStream(bfile);
		int data=0;
		byte[] buf = new byte[fis.available()];
		while((data=fis.read(buf)) != -1) {
			fos.write(buf,0,data);
		}
		fis.close();
		fos.flush();
		fos.close();
	}
}