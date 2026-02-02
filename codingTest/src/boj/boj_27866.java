package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
// https://www.acmicpc.net/problem/27866

public class boj_27866 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		char[] chars = new char[str.length()];
		StringTokenizer st = new StringTokenizer(br.readLine());
		int index = Integer.parseInt(st.nextToken());
		for(int i =0; i < str.length(); i++) {
			chars[i] = str.charAt(i);
			if((index-1) == i){
				bw.write(chars[i]);
				break;
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
