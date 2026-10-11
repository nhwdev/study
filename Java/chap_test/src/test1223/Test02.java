package test1223;

import java.util.Scanner;

/*
 * 10부터 99사이의 두자리 자연수를 입력받아 입력된 수 보다 크거나 
 * 같은 10의 배수를 구하기
 * 10의 배수에서 입력된 수를 뺀값을 출력하기
 * [결과]
 * 10부터 99사이의 두자리 자연수를 입력하세요
 * 24
 *  6  :  30 - 24
 *  
 * 10부터 99사이의 두자리 자연수를 입력하세요
 * 20
 * 0   :  20 - 20
 */
public class Test02 {
	public static void main(String[] args) {
		int input,total,sub;
		System.out.println("10부터 99사이의 두자리 자연수를 입력하세요.");
		Scanner scan= new Scanner(System.in);
		input= scan.nextInt();
		
		total = input == input/10*10? input:input/10*10+10;
		sub = total-input;
		System.out.println(input>=10 && input < 100?sub + " : " + total +" - " + input:"잘못된 입력입니다.");
		
	}
}
