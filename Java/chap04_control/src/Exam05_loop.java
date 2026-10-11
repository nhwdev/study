import java.util.Scanner;

/*
 * 화면에서 숫자를 입력받아서 입력받은 숫자의 합계와 평균을 출력하기
 * 입력받은 숫자가 0인 경우 입력종료
 */
public class Exam05_loop {
	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요. 종료(0)");
		Scanner scan = new Scanner(System.in);
		int sum=0,cnt=0,num=0;
		do {
			num = scan.nextInt();
			if(num != 0) {
				sum += num;
				cnt++;
			}
		} while(num != 0);
		System.out.println("합계:" + sum);
		System.out.println("평균:" + (double)sum/cnt);
	}
}