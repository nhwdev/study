package test0120;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
 * 화면에서 파일명을 입력받고, 출력을 시작할 시작라인,출력 라인수를 입력받아서
 * 시작라인부터 라인수까지의 내용을 화면에 출력하기
 [결과]
 파일명을 입력하세요
 src/test0120/Test01.java
 시작라인 
 1
 라인수
 3
 
1:package ex01_input;
2:
3:import java.io.IOException;
 */
public class Test01 {
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new FileReader("src/test0120/" + input.readLine()));
		System.out.println("시작라인");
		int s = Integer.parseInt(input.readLine());
		System.out.println("라인수");
		int e = Integer.parseInt(input.readLine());

		String str;
		int cnt = 1;

		while ((str = br.readLine()) != null) {
			if (s <= cnt && (s + e) > cnt) {
				output.write(cnt + ":" + str);
				output.newLine();
			}
//				System.out.println(csnt + ":" + str);
			cnt++;
		}
		output.flush();
		output.close();
		input.close();
		br.close();
	}
}
