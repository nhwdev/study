package test1224;

import java.util.Scanner;

/*
   사용자로부터 시작 숫자와 등차를 입력 받아
   일정한 값으로 숫자가 커지거나 작아지는 프로그램을 구현하세요.
   단, 출력되는 숫자는 총 10개입니다.
   [결과]
   시작 숫자 : 4
   등차 : 3
   
   4 7 10 13 16 19 22 25 28 31
 */
public class Test05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
	
		System.out.print("시작 숫자 : ");
		int num = scan.nextInt();
		System.out.print("등차 : ");
		int add = scan.nextInt();
		System.out.print("\n"+num);
		
		for(int i=0;i<9;i++) {
			num+=add;
			System.out.print(" "+num);
		}

	}
}
