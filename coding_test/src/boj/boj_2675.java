package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// https://www.acmicpc.net/problem/2675
public class boj_2675 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String line;
		while ((line = br.readLine()) != null) {
			String[] str = line.split(" ", 2);
			String text = str.length > 1 ? str[1] : "";
			for (int i = 0; i < text.length(); i++) {
				for (int j = 0; j < Integer.parseInt(str[0]); j++) {
					bw.write(text.charAt(i));
				}
			}
			if (!text.equals(""))
				bw.newLine();
		}
		bw.flush();
		bw.close();
		br.close();
	}
}