package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/1546
public class boj_1546 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		int[] scores = new int[num];
		StringTokenizer st = new StringTokenizer(br.readLine());
		int max = 0;
		for (int i = 0; i < num; i++) {
			scores[i] = Integer.parseInt(st.nextToken());
			if (i == 0) {
				max = scores[i];
			} else if (max < scores[i]) {
				max = scores[i];
			}
		}
		double avg = 0;
		for (int i : scores) {
			avg += (((double) i / max) * 100) / num;

		}
		bw.write(avg + "");
		bw.flush();
		bw.close();
	}
}
