package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

// https://www.acmicpc.net/problem/2751
public class BOJ_2751 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int max = 0;
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			int number = Integer.parseInt(br.readLine());
			arr[i] = number;
			if (max < number) {
				max = number;
			}
		}
		Arrays.sort(arr);
		for (int i : arr) {
			bw.write(String.valueOf(i));
			bw.newLine();
		}
		bw.flush();
		bw.close();
		br.close();
	}
}