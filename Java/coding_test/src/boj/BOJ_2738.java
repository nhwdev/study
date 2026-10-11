package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/2738
public class BOJ_2738 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int row = Integer.parseInt(st.nextToken());
		int column = Integer.parseInt(st.nextToken());
		int[][] irr = new int[row][column];
		for (int i = 0; i < row * 2; i++) {
			st = new StringTokenizer(br.readLine());
			int realRow = i % row;
			for (int j = 0; j < column; j++) {
				if (i < row) {
					irr[realRow][j] = Integer.parseInt(st.nextToken());
				} else {
					irr[realRow][j] += Integer.parseInt(st.nextToken());
					bw.write(String.valueOf(irr[realRow][j]) + " ");
					if (j == column - 1) {
						bw.newLine();
					}
				}
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}