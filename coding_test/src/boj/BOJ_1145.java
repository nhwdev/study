package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/1145
// 30 42 70 35 90
/*
 * ❌ 초기 접근
 * - 수를 생성해서 중복을 찾으려 함
 * - 정렬 + 리스트 증가 → 시간초과
 *
 * ✅ 깨달은 점
 * - 이 문제는 생성 문제가 아님
 * - 작은 수부터 조건 검사만 하면 됨
 * - 브루트포스가 최적
 */
public class BOJ_1145 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] numbers = new int[st.countTokens()];
		int count = 0;
		int check = 1;
		while (st.hasMoreTokens()) {
			numbers[count++] = Integer.parseInt(st.nextToken());
		}
		count = 0;
		while (true) {
			for (int i = 0; i < numbers.length; i++) {
				if ((check % numbers[i]) == 0) {
					count++;
					if (count > 2) {
						bw.write(String.valueOf(check));
						bw.flush();
						bw.close();
						br.close();
						return;
					}
				}
			}
			count = 0;
			check++;
		}
	}
}
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		ArrayList<Integer> numbers = new ArrayList<>();
//		int order = 0; // 순서
//		int multi = 2; // 곱셈++
//		int[] num = new int[5];
//		int cnt = 0;
//		while (st.hasMoreTokens()) {
//			int number = Integer.parseInt(st.nextToken());
//			numbers.add(number);
//			num[cnt++] = number;
//		}
//		while (true) {
//			Collections.sort(numbers);
//			int count = 1; // 중복 숫자
//			// 중복 검사
//			for (int i = 0; i < numbers.size() - 1; i++) {
//				if (numbers.get(i).equals(numbers.get(i + 1))) {
//					count++;
//					if (count >= 3) {
//						bw.write(String.valueOf(numbers.get(i)));
//						bw.flush();
//						bw.close();
//						br.close();
//						return;
//					}
//				} else
//					count = 1;
//			}
//			// 배열[i] x x2++
//			if (order > 4) {
//				order = 0;
//				multi++;
//			}
//			numbers.add(num[order++] * multi);
//		}