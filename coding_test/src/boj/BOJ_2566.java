package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ_2566 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int max = -1;
		String index = "";
		for (int i = 1; i <= 9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= 9; j++) {
				int number = Integer.parseInt(st.nextToken());
				if (number > max) {
					max = number;
					index = i + " " + j;
				}
			}
		}
		bw.write(String.valueOf(max));
		bw.newLine();
		bw.write(index);
		bw.flush();
		bw.close();
		br.close();
	}
}
