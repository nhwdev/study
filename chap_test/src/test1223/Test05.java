package test1223;

import java.util.Scanner;

/*
 * 밑변과 높이를 입력받아 삼각형의 넓이를 출력하기. 소숫점을 표시
 * [결과]
 * 밑변의 길이
 * 10
 * 높이의 길이
 * 20
 * 
 * 넓이=15.0
 */
public class Test05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("삼각형의 밑변 입력: ");
		int base = scan.nextInt();
		System.out.print("삼각형의 높이 입력: ");
		int height = scan.nextInt();
		double area = ((double)base*height)/2;
		System.out.println("\n밑변의 길이");
		System.out.println(base);
		System.out.println("높이의 길이");
		System.out.println(height);
		System.out.println();
		System.out.println("넓이="+area);
		
	}
}
