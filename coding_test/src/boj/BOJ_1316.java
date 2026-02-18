package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// https://www.acmicpc.net/problem/1316
public class BOJ_1316 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int count = Integer.parseInt(br.readLine());
		int groupCount = 0;
		for (int i = 0; i < count; i++) {
			String str = br.readLine();
			char prev = 0; // 이전 문자 기억
			boolean isGroup = true; // 그룹함수?
			boolean[] visited = new boolean[26];// 문자 방문 체크
			for (int j = 0; j < str.length(); j++) {
				char current = str.charAt(j); // 현재 문자
				if (current != prev) { // 현재문자와 이전문자와 같지 않다면
					if (visited[current - 'a']) { // 이전에 방문한적 있는 문자?
						isGroup = false; // 그룹단어 아님
						break;
					}
					visited[current - 'a'] = true; // 방문한적 없다면 true
				}
				prev = current; // 이전 문자를 현재문자에 저장
			}
			if (isGroup) {
				groupCount++;
			}
		}
		bw.write(String.valueOf(groupCount));
		bw.flush();
		bw.close();
		br.close();
	}
}
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		int count = Integer.parseInt(br.readLine());
//		int groupCount = 0;
//		boolean isGroup = true;
//		for (int i = 0; i < count; i++) {
//			String str = br.readLine();
//			char[] chs = str.toCharArray();
//			for (int j = 0; j < str.length(); j++) {
//				for (int k = 0; k < str.length(); k++) {
//					if (chs[j] == chs[k] && k - j == 1) {
//						j = k;
//					} else if (chs[j] == chs[k] && k - j > 1) {
//						isGroup = false;
//						break;
//					}
//				}
//				if(!isGroup) break;
//			}
//			if (isGroup) {
//				groupCount++;
//			} else
//				isGroup = true;
//		}
//		bw.write(String.valueOf(groupCount));
//		bw.flush();
//		bw.close();
//		br.close();
//	}
//}
