package test1224;

import java.util.Scanner;

/*
나이를 키보드로 입력 받아 어린이(13세 이하)인지, 청소년(13세 초과 ~ 19세 이하)인지,
성인(19세 초과)인지 출력하세요.
[결과]
나이 : 19
청소년
*/
public class Test11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("나이를 입력: ");
		int age = scan.nextInt();
		if (age>19) {
			System.out.println("나이 : " + age + "\n성인");
		} else if (age>13) {
			System.out.println("나이 : " + age + "\n청소년");
		} else if (age>=0) {
		System.out.println("나이 : " + age + "\n어린이");
		} else System.out.println("태어나지 않음");
	}
}
