package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// https://www.acmicpc.net/problem/2903
public class BOJ_2903 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		long sidePoint = 2;
		long sum = 1;
		long pointCount = 2;
		for (int i = 1; i <= n; i++) {
			pointCount = (long) Math.pow(sidePoint + sum, 2);
			sidePoint += sum;
			sum *= 2;
		}
		bw.write(String.valueOf(pointCount));
		bw.flush();
		bw.close();
		br.close();
	}
}
