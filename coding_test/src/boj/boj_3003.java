package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/3003
// 체스는 총 16개의 피스를 사용하며, 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성되어 있다.
// 예제 입력 1 
// 0 1 2 2 2 7
// 예제 출력 1 
// 1 0 0 0 0 1
public class boj_3003 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int count = st.countTokens();
		int[] arr = { 1, 1, 2, 2, 2, 8 };
		for (int i = 0; i < count; i++) {
			bw.write((arr[i] - Integer.parseInt(st.nextToken())) + " ");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}