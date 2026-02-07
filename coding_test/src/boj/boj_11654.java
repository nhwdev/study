package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// https://www.acmicpc.net/problem/11654
public class boj_11654 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(String.valueOf((int) br.readLine().charAt(0))); // (int) br.readLine().char(0) = 아스키코드값
		bw.flush();												 // String.valueOf 아스키코드 값을 -> 문자열
		bw.close();
		br.close();
	}
}
