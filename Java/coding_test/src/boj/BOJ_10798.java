package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// https://www.acmicpc.net/problem/10798
public class BOJ_10798 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		char[][] chs = new char[5][15];
		for (int i = 0; i < chs.length; i++) {
			String str = br.readLine();
			for (int j = 0; j < chs[i].length; j++) {
				if (j < str.length()) {
					chs[i][j] = str.charAt(j);
				} else {
					chs[i][j] = ' ';
				}
			}
		}
		for (int i = 0; i < chs[0].length; i++) {
			for (int j = 0; j < chs.length; j++) {
				if (chs[j][i] != ' ') {
					bw.write(chs[j][i]);
				}
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
