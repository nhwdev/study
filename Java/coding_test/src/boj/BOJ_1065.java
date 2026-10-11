package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// https://www.acmicpc.net/problem/1065
public class BOJ_1065 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		int n = Integer.parseInt(str);
		int count = n;
		if (n >= 100) {
			count = 99;
			for (int i = 100; i <= n; i++) {
				int hundreds = i / 100;
				int tens = (i / 10) % 10;
				int ones = i % 10;
				if (hundreds - tens == tens - ones) {
					count++;
				}
			}
		}
		bw.write(String.valueOf(count));
		bw.flush();
		bw.close();
		br.close();
	}
}
