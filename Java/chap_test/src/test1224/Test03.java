package test1224;
/*
 * 화면에서 자연수를 입력받아서 각 자리수의 합을 구하기
 * [결과]
 * 자연수 입력 : 123
 * 자리수합 : 6
 */

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("자연수 입력: ");
		String num = scan.next();
		int sum =0;
		
		for(int i = 0;i<num.length();i++) {
			sum += num.charAt(i)-'0';
		}
		System.out.println("자리수합 : " + sum);
	}
}
