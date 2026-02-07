package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// https://www.acmicpc.net/problem/10809
// 예제 입력 1 
// baekjoon
// 예제 출력 1 
// 1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1
public class boj_10809 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		int[] chs = new int[26];
		for (int i = 0; i < chs.length; i++) {
			chs[i] = -1;
		} // Arrays.fill(chs, -1);
		for (int i = 0; i < str.length(); i++) {
			if (chs[str.charAt(i) - 'a'] == -1) {
				chs[str.charAt(i) - 'a'] = i;
			}
		}
		for (int i : chs) {
			bw.write(i + " ");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
