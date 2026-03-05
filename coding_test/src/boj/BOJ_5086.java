package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/5086
public class BOJ_5086 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String numbers = "";
		while ((numbers = br.readLine()) != null) {
			if (numbers.equals("0 0"))
				break;
			StringTokenizer st = new StringTokenizer(numbers);
			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());
			if (num2 > 0 && num2 % num1 == 0) {
				bw.write("factor");
			} else if (num1 > 0 && num1 % num2 == 0) {
				bw.write("multiple");
			} else {
				bw.write("neither");
			}
			bw.newLine();
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
