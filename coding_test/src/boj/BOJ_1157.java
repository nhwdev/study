package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// https://www.acmicpc.net/problem/1157
public class BOJ_1157 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] irr = new int[26];
		for (int i : br.readLine().toUpperCase().toCharArray()) {
			irr[i - 'A']++;
		}
		int max = irr[0];
		int maxSame = 0;
		for (int i = 1; i < irr.length; i++) {
			if (max < irr[i]) {
				max = irr[i];
				maxSame = 0;
			} else if (max == irr[i]) {
				maxSame++;
			}
		}
		if (maxSame > 0) {
			bw.write("?");
		} else {
			for (int i = 0; i < irr.length; i++) {
				if (irr[i] == max) {
					bw.write((char) (i + 'A'));
				}
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}