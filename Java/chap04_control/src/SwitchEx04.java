/*
 * 중첩 switch 구문
 */
public class SwitchEx04 {
	public static void main(String[] args) {
		int a = 1, b = 1;
		switch (a) {
		case 1:
			switch (b) {
			case 2:
				System.out.println("a=" + a + ",b=" + b);
				break;
			default:
				System.out.println("default 구문 실행 2");
			}
			break;
		default:
			System.out.println("default 구문 실행 1");
		}
	}
}