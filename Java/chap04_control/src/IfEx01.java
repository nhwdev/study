import java.util.Scanner;

/*
 * if 조건문
 * if(조건식) {
 *   조건식의 결과가 참인 경우 실행되는 문장들
 * } else {
 *   조건식의 결과가 거짓인 경우 실행되는 문장들
 * }
 * if else if 구문
 * if(조건식1) {
 *    조건식1이 참인 경우 실행되는 문장
 * } else if(조건식2) {
 *    조건식1이 거짓, 조건식2가 참인 경우 실행되는 문장
 * } else if(조건식3) {
 *    조건식1이 거짓, 조건식2가 거짓인 경우 조건식3인 참인 경우 실행되는 문장
 * } .... 
 * else {
 *    모든 조건식이 거짓인 경우 실행되는 문장
 * }
 * 
 * 조건문 블록({})내부의 실행되는 문장이 한개인 경우 {} 생략가능
 */
public class IfEx01 {
	public static void main(String[] args) {
		System.out.println("점수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		if (score >= 60) {
			System.out.println("합격을 축하합니다.");
			System.out.println("자격증을 찾아가세요");
		} else {
			System.out.println("불합격 입니다.");
		}
		// 조건이 여러개인 경우.
		if (score >= 90) {
			System.out.println("A학점");
		} else if (score >= 80) {
			System.out.println("B학점");
		} else if (score >= 70) {
			System.out.println("C학점");
		} else if (score >= 60) {
			System.out.println("D학점");
		} else {
			System.out.println("F학점");
		}
	}
}