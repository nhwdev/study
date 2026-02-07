package test1226;
/*
 *  농장에 강아지,병아리가 있음.
 *  강아지 병아리 전체 마리수 입력받고
 *  강아지 다리수와 병아리 다리수 전체를 입력받는다.
 *  [결과]
 *  강아지 병아리 마리수를 입력하세요
 *  20
 *  강아지 병아리 전체 다리수를 입력하세요
 *  40
 *  
 *  강아지 : xx마리
 *  병아리 : yy마리
 *  
 *  x+y = 전체마리수
 *  4x + 2y = 전체다리수
 *  
 *  [결과]
 *  강아지 병아리 마리수를 입력하세요
 *  10
 *  강아지 병아리 전체 다리수를 입력하세요
 *  10
 *   
 *  계산안됨 
 */

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("강아지 병아리 마리수를 입력하세요.");
		int total = scan.nextInt();
		System.out.println("강아지 병아리 전체 다리수를 입력하세요.");
		int leg = scan.nextInt();
		int dog=0, chick=0;

//		x+y = 전체마리수
//		4x + 2y = 전체다리수
		// z-x=c/2-2x x=c/2-z
		// dog*4 + chick*2 =leg
		// dog = total -chick -> 4dog= leg-2chick -> dog = leg/4 -chick/2= total -chcik -> chick=total*2-leg/2
		chick = (total*4-leg)/2;
		dog = leg/2-total;
		
		if(dog>=0&&chick>=0&&leg%2==0) {
		System.out.println("강아지 : " + dog);
		System.out.println("병아리 : " + chick);
		} else System.out.println("계산 안됨");
	}

}
