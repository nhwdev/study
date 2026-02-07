package test1226;
/*
 * 숫자 맞추기
 * 컴퓨터가 1~100 사이의 임의의 정수를 저장하고,
 * 사용자는 숫자를 입력하여 컴퓨터 저장한 숫자를 맞추기
 * 시스템 : 37 가정
 * [결과]
 * 1~100사이의 숫자를 입력하세요
 * 50
 * 작은수입니다.
 * 25
 * 큰수입니다.
 * 40
 * 작은수입니다.
 * 37
 * 정답입니다. 
 * 프로그램종료합니다.
 */

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		int com = (int)(Math.random()*100);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1~100사이의 숫자를 입력하세요.");
		while(true) {
			int num = scan.nextInt();
			if(com>num) {
				System.out.println("큰 수 입니다.");
			} else if (num>com) {
				System.out.println("작은 수 입니다.");
			} else if (num==com) {
				System.out.println("정답 입니다.\n프로그램 종료합니다.");
				break;
			}
		}
		
	}
}
