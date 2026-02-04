

import java.util.Scanner;

/*
 * 삼항연산자
 * 조건 연산자 : 조건문으로 변경 가능
 *  (조건문)?참:거짓
 *  
 *  조건문 : 결과가 boolean인 구문
 *  
 *  화면에서 점수를 입력받아 60이상인경우 합격을 출력. 60미만이면 불합격 출력하기
 */
public class OpEx07 {
	public static void main(String[] args) {
		System.out.println("점수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt(); // 55
		System.out.println(score + "점:" + ((score >= 60) ? "합격" : "불합격") + "입니다.");
		// 65점:합격입니다.
		// 55점:불합격입니다.

		// 70점이상은 통과, 60점이상은 재시험, 60점미만은 낙제 출력하기
		String result = (score >= 70) ? "통과" : (score >= 60) ? "재시험" : "낙제";
		System.out.println(score + "점:" + result + "입니다.");
	}
}