package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/1120
public class BOJ_1120 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String a = st.nextToken();
		String b = st.nextToken();
		int min = 0;
		int minMax = 0;
		int minCount = Integer.MIN_VALUE;
		if (a.length() != b.length()) {
			String subStringB = b;
			for (int j = 0; j <= b.length() - a.length(); j++) {
				for (int i = 0; i < a.length(); i++) {
					if (a.charAt(i) == subStringB.charAt(i)) {
						minMax++;
					}
				}
				if (minCount < minMax) {
					minCount = minMax;
				}
				minMax = 0;
				subStringB = b.substring(j + 1);
			}
			min = a.length() - minCount;
		} else {
			for (int i = 0; i < a.length(); i++) {
				if (a.charAt(i) != b.charAt(i)) {
					min++;
				}
			}
		}
		bw.write(String.valueOf(min));
		bw.flush();
		bw.close();
		br.close();
		return;
	}
}