package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 소인수분해
// https://www.acmicpc.net/problem/11653
public class BOJ_11653 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		while (n > 1) {
			for (int i = 2; i <= n; i++) {
				if (n % i == 0) {
					bw.write(String.valueOf(i));
					bw.newLine();
					n /= i;
					break;
				}
			}
		}
		if (n == 1) {
			bw.write("");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}