package test1223;

import java.util.Scanner;

/*
 * 화면에서 점수를 입력받아서 
 * 90점 이상이면 A학점,80점 이상이면 B학점
 * 70점 이상이면 C학점,60점 이상이면 D학점
 * 60 점 미만이면 F학점을 출력하기
 */
public class Test03 {
	public static void main(String[] args) {
		System.out.print("점수 입력: ");
		Scanner scan = new Scanner(System.in);
		
		int score = scan.nextInt();
		
		System.out.println(score>100||score<0?"오류":score>89?"A":score>79?"B":score>69?"C":score>59?"D":"F");
	}
}
