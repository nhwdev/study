import java.util.Scanner;

/*
 * 화면에서 정수를 입력받아 수만큼 *를 출력하기
 * 정수가 아닌 경우는 숫자만 입력하세요 메세지 출력하기
 * 
 * 숫자가 아닌경우 InputMismatchException 예외 발생
 */
public class Exam01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		try {
			int num = scan.nextInt();
			for (int i = 1; i <= num; i++)
				System.out.print("*");
			System.out.println();
		} catch (Exception e) {
			String ex = scan.next();
			System.out.println("숫자만 입력하세요." + ex + "는 숫자가 아닙니다.");
		}
	}
}
