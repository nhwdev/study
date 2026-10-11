package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// https://www.acmicpc.net/problem/1417
public class BOJ_1417 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int candidates = Integer.parseInt(br.readLine());
		int[] votes = new int[candidates];
		for (int i = 0; i < candidates; i++) {
			votes[i] = Integer.parseInt(br.readLine());
		}
		// 1. 최다 득표 후보 찾기
		// 2. 최다 득표 후보가 기호 1번이라면 종료 아니라면
		// 3. 최다 득표 후보 -1 기호1번후보 +1, 1명의 사람 매수 +1
		// 4. 반복
		int bribeCount = 0;
		if (votes.length > 1) {
			while (true) {
				int most = votes[1];
				int number = 1;
				for (int i = 1; i < votes.length; i++) {
					if (most < votes[i]) {
						number = i;
						most = votes[i];
					}
				}
				if (votes[0] > most) {
					break;
				} else {
					bribeCount++;
					votes[number]--;
					votes[0]++;
				}
			}
		}
		bw.write(String.valueOf(bribeCount));
		bw.flush();
		bw.close();
		br.close();
	}
}