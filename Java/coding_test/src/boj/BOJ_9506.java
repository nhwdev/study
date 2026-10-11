package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// https://www.acmicpc.net/problem/9506
public class BOJ_9506 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String number = "";
		while (!((number = br.readLine()).equals("-1"))) {
			int n = Integer.parseInt(number);
			int sum = 0;
			boolean[] isDivisors = new boolean[((n + 1) / 2) + 1];
			for (int i = 1; i <= (n + 1) / 2; i++) {
				if (n % i == 0) {
					sum += i;
					isDivisors[i] = true;
				}
			}
			if (sum == n) {
				bw.write(n + " =");
				for (int i = 0; i < isDivisors.length; i++) {
					if (isDivisors[i]) {
						bw.write((i == 1 ? " " : " + ") + i);
					}
				}
			} else {
				bw.write(n + " is NOT perfect.");
			}
			bw.newLine();
		}
		bw.flush();
		bw.close();
		br.close();
	}
}