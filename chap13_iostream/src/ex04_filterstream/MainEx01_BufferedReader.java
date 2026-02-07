package ex04_filterstream;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 보조스트림 
 * 1. 기존의 스트림에 새로운 기능 추가
 * 2. 객체 생성시 다른 스트림을 생성자의 매개변수로 입력받는다 
 * 
 * BufferedReader.readLine() 기능 추가 : 한줄씩 읽기
 * 
 * BufferedReader 스트림이 보조 스트림.
 * new BufferedReader(Reader)
 */
public class MainEx01_BufferedReader {
	public static void main(String[] args) throws IOException {
		// Scanner 를 이용하지 않고, 화면에서 한줄씩 읽기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("저장할 내용을 입력하세요(ctrl+z)");
		FileWriter fw = new FileWriter("buffered.txt");
		String data = null;
		while ((data = br.readLine()) != null) {
			System.out.println(data);
			fw.write(data + "\n");
		}
		br.close();
		fw.flush();
		fw.close();
	}
}