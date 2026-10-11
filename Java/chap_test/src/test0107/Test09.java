package test0107;
/*
 * 화면에서 정수형 숫자를 입력받아서 정수형 숫자인 경우 숫자만큼 *를 출력하고
 * 정수형 숫자가 아닌 경우 숫자만 입력하세요 메세지 출력하기. 숫자가 입력될때 까지 입력받기.
 * 
 * Scanner scan = new Scanner(System.in);
 * int num = scan.nextInt(); <= 정수 입력이 아닌 경우 InputMismatchException 예외 발생함
 * 
 * InputMismatchException 예외 처리시 scan.next(); 문장을 넣을 것
  
 [결과]
숫자를 입력하세요
a1
숫자만 입력하세요
b
숫자만 입력하세요
c
숫자만 입력하세요
10
**********

 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (true) {
			try {
				int n = s.nextInt();
				for (int i = 0; i < n; i++) {
					System.out.print("*");

				}
				break;
			} catch (InputMismatchException e) {
				String str = s.next();
				System.out.println("숫자만 입력하세요.\n" + str);
			}
		}
	}

}
