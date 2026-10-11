/*
 * 1,2,3 중 한개의 임의의 값을 생성하여
 * 1 : 가위
 * 2 : 바위
 * 3 : 보자기 출력하기
 */
public class Exam02_switch {
	public static void main(String[] args) {
		int crp = (int) (Math.random() * 3) + 1; // 1 ~ 3사이의 임의의 수
		switch (crp) {
		case 1:
			System.out.println("1 : 가위");
			break;
		case 2:
			System.out.println("2 : 바위");
			break;
		case 3:
			System.out.println("3 : 보자기");
			break;
		}
	}
}