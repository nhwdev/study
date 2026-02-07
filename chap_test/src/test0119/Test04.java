package test0119;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * apple.gif 파일을 읽어서, apple2.gif 파일로 복사하기
 */
public class Test04 {
	public static void main(String[] args) throws IOException {
		//src/test0119/apple.gif		
		FileInputStream fis = new FileInputStream("src/test0119/apple.gif");
		FileOutputStream fos = new FileOutputStream("src/test0119/apple2.gif");
//		FileReader fr = new FileReader("src/test0119/apple.gif");
//		FileWriter fw = new FileWriter("src/test0119/apple2.gif");
		byte[] buf = new byte[fis.available()];
		int data=0;
		while((data=fis.read(buf)) != -1) {
			fos.write(buf,0,data);
		}
		fis.close();
		fos.flush();
		fos.close();
	}
	
}


