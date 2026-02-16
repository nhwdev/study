package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// https://www.acmicpc.net/problem/10988
public class boj_10998 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		int left = 0;
		int right = str.length() - 1;
		boolean isPalindrome = true;
		while (left < right) {
			if (str.charAt(left++) != str.charAt(right--)) {
				isPalindrome = false;
				break;
			} else if (left > right) {
				isPalindrome = true;
			}
		}
		if (isPalindrome)
			bw.write("1");
		else
			bw.write("0");
		bw.flush();
		bw.close();
		br.close();
	}
}
