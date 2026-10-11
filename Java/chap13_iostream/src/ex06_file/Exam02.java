package ex06_file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/*
 * data.txt 파일이 없으면 존재하지 않는 파일입니다. 메세지 출력하기 
 * File 클래스를 이용하여 data.txt 파일의 내용을 화면에 출력하고,
 * data.txt 파일을 삭제하기.
 */
public class Exam02 {
	public static void main(String[] args) throws IOException {
		File f = new File("data.txt"); // 기본경로 : 프로젝트폴더
		if (!f.exists()) {
			System.out.println(f.getName() + " 파일은 존재하지 않습니다.");
			return;
		}
		FileInputStream fis = new FileInputStream(f);
		int len = 0;
		byte[] buf = new byte[8096];
		while ((len = fis.read(buf)) != -1) {
			System.out.println(new String(buf, 0, len));
		}
		fis.close();
		System.out.println(f.getName() + " 파일 삭제하기 =>" + f.delete());
	}
}