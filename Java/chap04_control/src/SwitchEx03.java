/*
 * switch(조건값) : 조건값으로 사용가능한 자료형
 *   - byte, short, int, char, String
 */
public class SwitchEx03 {
	public static void main(String[] args) {
		String str = "2";
		switch (str) {
		case "1":
			System.out.println(str);
			break;
		default:
			System.out.println("default 구문 실행1");
		}
		char ch = 'A';
		switch (ch) {
		case 'A':
			System.out.println(ch);
			break;
		default:
			System.out.println("default 구문 실행2");
		}
		int num = 1;
		switch (num) {
		case 1:
			System.out.println(num);
			break;
		default:
			System.out.println("default 구문 실행3");
		}
	}
}