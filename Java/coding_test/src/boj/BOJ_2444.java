package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// https://www.acmicpc.net/problem/2444
// 예제 입력 1 
// 5
// 예제 출력 1 
//     *
//    ***
//   *****
//  *******
// *********
//  *******
//   *****
//    ***
//     *
public class BOJ_2444 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		for (int i = 0; i < num; i++) {
			for (int j = i; j < num - 1; j++) {
				bw.write(" ");
			}
			for (int k = 0; k <= i * 2; k++) {
				bw.write("*");
			}
//			for (int l = 0; l < i; l++) {
//				bw.write("*");
//			}
			bw.newLine();
		}
		for (int i = 0; i < num - 1; i++) {
			for (int j = num - i; j <= num; j++) {
				bw.write(" ");
			}
			for (int k = 0; k < (num * 2) - (i * 2) - 3; k++) {
				bw.write("*");
			}
//			for (int l = 0; l < num - i - 2; l++) {
//				bw.write("*");
//			}
			bw.newLine();
		}
		bw.flush();
		bw.close();
		br.close();
	}
}