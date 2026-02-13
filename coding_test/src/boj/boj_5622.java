package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// https://www.acmicpc.net/problem/5622
public class boj_5622 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		int second = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) < 'D') {
				second += 3;
			} else if (str.charAt(i) < 'G') {
				second += 4;
			} else if (str.charAt(i) < 'J') {
				second += 5;
			} else if (str.charAt(i) < 'M') {
				second += 6;
			} else if (str.charAt(i) < 'P') {
				second += 7;
			} else if (str.charAt(i) < 'T') {
				second += 8;
			} else if (str.charAt(i) < 'W') {
				second += 9;
			} else if (str.charAt(i) <= 'Z') {
				second += 10;
			}
		}
		bw.write(String.valueOf(second));
		bw.flush();
		bw.close();
		br.close();
	}
}
