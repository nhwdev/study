package ex03_stringbuffer;

import java.util.Scanner;

/*
 * 화면에서 정수를 입력받아서 대칭수인지 출력하기(StringBuffer이용하기)
 * [결과]
 * 123 : 대칭수아님
 * 121 : 대칭수 
 */
public class Exam01 {
	public static void main(String[] args) {
		System.out.println("정수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt(); // 123
		String snum = num + "";
		StringBuffer sb = new StringBuffer(snum);
		sb.reverse();
		if (snum.equals(sb.toString()))
			System.out.println(snum + ": 대칭수");
		else
			System.out.println(snum + ": 대칭수 아님");
	}
}