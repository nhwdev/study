import java.util.Scanner;

/*
 * 3662초가 몇시간 몇분 몇초인지 출력하기
 * [결과]
 * 3662초=1시간 1분 2초
 * => 수정
 * 키보드에서 초를 입력받아 몇시간,몇분,몇초인지 출력하기
 */
public class Exam01 {
	public static void main(String[] args) {
		System.out.println("초를 입력하세요");
		Scanner scan = new Scanner(System.in);
		// 1. 변수값(second)에 3662 저장
		int second = scan.nextInt();
		// 2. 시 계산 : second / 3600 의 몫
		int h = second / 3600;
		// 3. 분 계산 : (second % 3600) / 60 의 몫
		int m = (second % 3600) / 60;
		// 4. 초 계산 : second % 60 나머지
		int s = second % 60;
		// 5. 시,분,초 화면 출력
		System.out.println(second + "초=" + h + "시간 " + m + "분 " + s + "초");
	}
}