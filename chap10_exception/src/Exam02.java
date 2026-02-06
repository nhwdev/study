import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 화면에서 1 ~ 10사이의 정수를 입력받아 입력받은 수만큼 * 출력하기
 * 1. 입력값이 정수가 아닌 경우 정수만 입력하세요 출력. 숫자를 입력받기
 * 2. 1 ~ 10사이의 정수가 아닌 경우 NumberInputException 클래스로 예외 강제 발생하고. 
 *    1 에서 10사이의 숫자만 입력하세요 메세지 출력. 숫자를 입력받기
 */
class NumberInputException extends Exception {
	NumberInputException(String msg) {
		super(msg);
	}
}

public class Exam02 {
	public static void main(String[] args) {
		System.out.println("1~10사이의 정수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		while (true) {
			try {
				int num = scan.nextInt();
				if (num < 1 || num > 10)
					throw new NumberInputException("1~10사이의 정수만 입력하세요");
				for (int i = 1; i <= num; i++)
					System.out.print("*");
				System.out.println();
				break;
			} catch (InputMismatchException e) {
				System.out.println("정수만 입력하세요");
				scan.next();
			} catch (NumberInputException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}