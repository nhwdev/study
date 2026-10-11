package test1223;

import java.util.Scanner;

/*
*  키보드로 정수 두 개를 입력 받아 두 수의 합, 차, 곱, 나누기한 몫을 출력하세요.
* 
* [결과]
* 첫 번째 정수를 입력하세요 : 23
* 두 번째 정수를 입력하세요 : 7
* 더하기 결과 : 30
* 빼기 결과 : 16
* 곱하기 결과 : 161
* 나누기 몫 결과 : 3
*/
public class Test07 {
	public static void main(String[] args) {
		System.out.print("정수 2개 입력: ");
		Scanner scan = new Scanner(System.in);
		int int1=scan.nextInt();
		int int2=scan.nextInt();
		
		System.out.println("첫 번째 정수를 입력하세요: " + int1);
		System.out.println("두 번째 정수를 입력하세요: " + int2);
		System.out.println("더하기 결과: " + (int1+int2));
		System.out.println("빼기 결과: " + (int1-int2));
		System.out.println("곱하기 결과: " + (int1*int2));
		System.out.println("나누기 몫 결과: " + ((double)int1/int2));

	}
}
