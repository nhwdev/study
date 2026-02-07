package test1223;

import java.util.Scanner;

/*
 *  화면에서 두수를 입력받아서 더큰수를 출력하기 
 */
public class Test04 {
	public static void main(String[] args) {
		System.out.println("두수를 입력:");
		Scanner scan = new Scanner(System.in);
		int int1=scan.nextInt();
		int int2=scan.nextInt();
		System.out.println(int1>int2?int1:int1<int2?int2:"두수가 같음");
	}
}

