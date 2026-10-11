package ex08_sequence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Vector;

public class MainEx02 {
	public static void main(String[] args) throws IOException {
		File f = new File("src/ex06_file"); // 폴더
		Vector<InputStream> v = new Vector<>(); // 요소의 자료형은 InputStream형
		for (String file : f.list()) {
			File f2 = new File(f, file);
			if (f2.isFile()) { // 파일인 경우. 폴더가 아닌 경우
				// v 객체 : src/ex06_file/의 하위 파일들을 읽기 위한 InputStream 객체
				v.add(new FileInputStream(f2));
			}
		}
		// Enumeration v.elements() : Vector 의 요소들을 반복자
		SequenceInputStream s = new SequenceInputStream(v.elements());
		FileOutputStream fos = new FileOutputStream("File예제.txt");
		int len = 0;
		byte[] buf = new byte[8096];
		while ((len = s.read(buf)) != -1) {
			fos.write(buf, 0, len);
		}
		fos.flush();
		fos.close();
		s.close();
	}
}