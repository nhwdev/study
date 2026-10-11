package test1224;
/*
 * 숫자를 입력 받아서
 * 1. 양수,음수,영 출력
 * 2. 짝수,홀수 출력하기
 * if 조건문으로 구현하기
 */

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		System.out.print("숫자 입력: ");
		Scanner scan= new Scanner(System.in);
		int num = scan.nextInt();
		if(num>0) {
			System.out.println("양수");
		} else if(num<0) {
			System.out.println("음수");
		} else if(num==0) {
			System.out.println("영");
		}
		if(num%2==0)System.out.println("짝수");
		else System.out.println("홀수");
	}
}
