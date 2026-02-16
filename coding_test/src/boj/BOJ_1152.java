package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// https://www.acmicpc.net/problem/1152
// 예제 입력 1 
// The Curious Case of Benjamin Button
// 예제 출력 1 
// 6
public class BOJ_1152 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] str = br.readLine().trim().split(" ");
//		int length = str.length;
//		for(int i=0; i< str.length; i++) {
//			if(str[i].equals("")){
//				length--;
//			}
//		}
		bw.write(String.valueOf(str.length));
		bw.flush();
		bw.close();
		br.close();
	}
}
