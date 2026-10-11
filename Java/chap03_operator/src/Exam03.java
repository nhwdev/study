import java.util.Scanner;

/*
 * 숫자를 입력받아서 양수인 경우는 양수,음수인 경우 음수,0인경우 영 출력하기
 * [결과]
 * 숫자를 입력하세요
 * 0
 * 0 : 영
 */
public class Exam03 {
	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println(num + ":" + ((num > 0) ? "양수" : (num < 0) ? "음수" : "영"));
	}
}