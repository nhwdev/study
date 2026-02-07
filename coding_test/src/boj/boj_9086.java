package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// https://www.acmicpc.net/problem/9086
public class boj_9086 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int count = Integer.parseInt(br.readLine());
		for(int i=0; i < count; i++) {
		String str = br.readLine();
		bw.write(String.valueOf(str.charAt(0))+str.charAt(str.length()-1));
		bw.newLine();
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
