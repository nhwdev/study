package test0120;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
  D:/20251222/java/workspace/chap13_iostream/src/ : 각자의 chap13 폴더

  D:/20251222/java/workspace/chap13_iostream/src/폴더 하위 폴더의 .java 파일 중
   Exam 관련 모든 소스 내용을  자바IO실습예제.txt  파일 하나에 저장 하기

Exam 관련 모든 소스 : ExamXXX.java

*/
public class Test04 {
	static BufferedWriter bw;

	public static void main(String[] args) throws IOException {
		File dir = new File("C:/Dev/workspace/chap13_iostream/src/");
		bw = new BufferedWriter(new FileWriter("C:/Dev/workspace/test/src/test0120자바IO실습예제.txt"));
		search(dir);
		bw.flush();
		bw.close();
	}

	static void search(File dir) throws IOException {
		File[] list = dir.listFiles();
		for (File f : list) {
			if (f.isDirectory()) {
				search(f);
			} else if (f.isFile() && f.getName().startsWith("Exam")) {
				writeFile(f);
			}
		}
	}

	private static void writeFile(File f) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(f));
		String line;
		while ((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
		}
		br.close();
		bw.newLine();
	}
}