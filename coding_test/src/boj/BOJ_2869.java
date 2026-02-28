package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 올림나눗셈 a / b = x + 1  을 구하는 법 : (a + b - 1) / b       
// https://www.acmicpc.net/problem/2869
public class BOJ_2869 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int up = Integer.parseInt(st.nextToken());
		int down = Integer.parseInt(st.nextToken());
		int top = Integer.parseInt(st.nextToken());
		int date = 0;
		date = ((top - up) + (up - down) - 1) / (up - down);
		date++;
		System.out.println(date);
		bw.flush();
		bw.close();
		br.close();
	}
}