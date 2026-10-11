import java.util.Scanner;

/*
 * 시스템에 1,2,3중 한개의 값을 저장
 * 사용자는 1,2,3중 한개의 값을 입력받기
 * 
 * 시스템   사용자
 * 가위     가위    비김  
 * 가위     바위    사용자승리  
 * 가위     보자기   시스템승리  
 */
public class Exam03_if_switch {
	public static void main(String[] args) {
		// 1. 시스템 저장 숫자
		int crp = (int) (Math.random() * 3) + 1;
		// 2. 사용자 입력
		System.out.println("1(가위),2(바위),3(보자기) 중 한개의 숫자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int userin = scan.nextInt();
		System.out.println("시스템\t사용자");
		switch (crp) {
		case 1:
			System.out.print("가위");
			break;
		case 2:
			System.out.print("바위");
			break;
		case 3:
			System.out.print("보자기");
			break;
		}
		System.out.print("\t");
		switch (userin) {
		case 1:
			System.out.print("가위");
			break;
		case 2:
			System.out.print("바위");
			break;
		case 3:
			System.out.print("보자기");
			break;
		}
		System.out.print("\t");
		// 승패 출력하기
		if (crp == userin)
			System.out.println("비김");
		switch (crp) {
		case 1:
			if (userin == 2)
				System.out.println("사용자승리");
			if (userin == 3)
				System.out.println("시스템승리");
			break;
		case 2:
			if (userin == 1)
				System.out.println("시스템승리");
			if (userin == 3)
				System.out.println("사용자승리");
			break;
		case 3:
			if (userin == 1)
				System.out.println("사용자승리");
			if (userin == 2)
				System.out.println("시스템승리");
			break;
		}
	}
}