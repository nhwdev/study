package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/2908
// 예제 입력 1 
// 734 893
// 예제 출력 1 
// 437
public class boj_2908 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int compare = 0;
		int count = st.countTokens();
		String str;
		for (int i = 0; i < count; i++) {
			str = st.nextToken();
			String conversion = "";
			char[] strc = new char[str.length()];
			int lengthCount = str.length();
			for (int k = 0; k < lengthCount; k++) {
				strc[k] = str.charAt(k);
			}
			for (int j = 0; j < lengthCount; j++) {
				lengthCount--;
				char idx = strc[j];
				strc[j] = strc[lengthCount];
				strc[lengthCount] = idx;
			}
			for (char a : strc) {
				conversion += a;
			}
			compare = compare > Integer.parseInt(conversion) ? compare : Integer.parseInt(conversion);
		}
		bw.write(String.valueOf(compare));
		bw.flush();
		bw.close();
		br.close();
	}
}
