package test1226;

import java.util.Scanner;

/*
 * 대칭수 구하는 프로그램을 작성하기
   대칭수란 숫자를 거꾸로 읽어도 앞으로 읽는 것과  같은 수를 말한다.
   12321 : 대칭수
   12345 : 대칭수 아님
 */
public class Test07 {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		while(true) {
		System.out.print("정수 입력: ");
		String num=scan.next();
		int sub=num.length();
		
		if(Integer.parseInt(num)==0)break;
		
		for(int i =0;i<num.length();i++) {
			sub--;
			if(num.charAt(i)!=num.charAt(sub)) {
				System.out.println(Integer.parseInt(num) +": 대칭수 아님");
				break;
			} else if(i==num.length()-1) {
				System.out.println(Integer.parseInt(num) + ": 대칭수");
				}
			}
		System.out.println();
		}
	}
}