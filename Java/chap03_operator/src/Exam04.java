import java.util.Scanner;

/*
 * 가로,세로값을 입력받아 사각형의 넓이,둘레, 정사각형 여부 출력하기
 * [결과]
 * 가로,세로길이를 입력하세요
 * 10 20
 * 넓이:200 
 * 둘레:60
 * 직사각형
 * 
 * 가로,세로길이를 입력하세요
 * 10 10
 * 넓이:100 
 * 둘레:40
 * 정사각형
 */
public class Exam04 {
	public static void main(String[] args) {
		System.out.println("가로,세로길이를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int w = scan.nextInt();
		int h = scan.nextInt();
		System.out.println("넓이:" + (w * h));
		System.out.println("둘레:" + ((w + h) * 2));
		System.out.println((w == h) ? "정사각형" : "직사각형");
	}
}