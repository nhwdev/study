package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 직사각형에서 탈출
// https://www.acmicpc.net/problem/1085
public class BOJ_1085 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		bw.write(String.valueOf((x < (w - x) ? x : w - x) < (y < (h - y) ? y : h - y) ? (x < (w - x) ? x : w - x) : (y < (h - y) ? y : h - y)));
		bw.flush();
		bw.close();
		br.close();
	}
}