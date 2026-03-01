package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/1158
public class BOJ_1158 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		boolean[] isPass = new boolean[n];
		for (int i = 0; i < n; i++) {
			arr[i] = i + 1;
		}
		int idx = k - 1;
		bw.write("<");
		for (int i = 0; i < arr.length - 1; i++) {
			bw.write(arr[idx] + ", ");
			isPass[idx] = true;
			int falseCount = 0;
			while (falseCount != k) {
				idx = (idx + 1) % n;
				if (!isPass[idx]) {
					falseCount++;
				}
			}
		}
		bw.write(arr[idx] + ">");
		bw.flush();
		bw.close();
		br.close();
	}
}