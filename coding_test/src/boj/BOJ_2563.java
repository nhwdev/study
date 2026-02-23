package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/2563
public class BOJ_2563 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int squareAmount = Integer.parseInt(br.readLine());
		boolean[][] paper = new boolean[101][101];
		int area = 0;
		for (int i = 0; i < squareAmount; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			for (int j = y; j < y + 10; j++) { // 정사각형 세로 좌표
				for (int k = x; k < x + 10; k++) // 정사각형 가로 좌표
					paper[j][k] = true; // 정사각형의 넓이값 true, 중복제거
			}
		}
		for (int i = 0; i < paper.length; i++) {
			for (int j = 0; j < paper[i].length; j++) {
				if (paper[i][j]) {
					area++; // 브루트포스
				}
			}
		}
		bw.write(String.valueOf(area));
		bw.flush();
		bw.close();
		br.close();
	}
}