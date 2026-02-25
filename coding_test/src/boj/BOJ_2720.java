package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// https://www.acmicpc.net/problem/2720
public class BOJ_2720 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int quarter = 25;
		int dime = 10;
		int nickel = 5;
		int penny = 1;
		int change = Integer.parseInt(br.readLine());
		int cent = 0;
		for (int i = 0; i < change; i++) {
			cent = Integer.parseInt(br.readLine());
			bw.write(cent / quarter + " ");
			bw.write((cent % quarter) / dime + " ");
			bw.write(((cent % quarter) % dime) / nickel + " ");
			bw.write(String.valueOf((((cent % quarter) % dime) % nickel) / penny));
			bw.newLine();
		}
		bw.flush();
		bw.close();
		br.close();
	}
}