package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// https://www.acmicpc.net/problem/2581
public class BOJ_2581 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		boolean isMin = true;
		int sum = 0;
		int minNumber = 0;
		for (int i = m; i <= n; i++) {
			boolean isPrime = true;
			if (i == 1)
				isPrime = false;
			for (int j = 2; j <= (i + 1) / 2; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				sum += i;
				if (isMin) {
					minNumber = i;
					isMin = false;
				}
			}
		}
		if (sum != 0) {
			bw.write(String.valueOf(sum));
			bw.newLine();
			bw.write(String.valueOf(minNumber));
		} else
			bw.write("-1");
		bw.flush();
		bw.close();
		br.close();
	}
}