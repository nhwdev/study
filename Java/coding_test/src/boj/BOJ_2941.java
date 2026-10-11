package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// https://www.acmicpc.net/problem/2941
//크로아티아 	알파벳	변경
// 		č			c=
//		ć			c-
//		dž			dz=
//		đ			d-
//		lj			lj
//		nj			nj
//		š			s=
//		ž			z=
//예제 입력 1 
//ljes=njak
//예제 출력 1 
//6
public class BOJ_2941 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		String[] croatia = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
		int count = 0;
		for (int i = 0; i < croatia.length; i++) {
			while (str.contains(croatia[i])) {
				str = str.replaceFirst(croatia[i], " ");
				count++;
			}
		}
		bw.write(String.valueOf(str.replace(" ", "").length() + count));
		bw.flush();
		bw.close();
		br.close();
	}
}