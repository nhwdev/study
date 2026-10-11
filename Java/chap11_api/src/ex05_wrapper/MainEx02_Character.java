package ex05_wrapper;

/*
 * Character 클래스
 */
public class MainEx02_Character {
	public static void main(String[] args) {
		char[] arr = { 'A', 'a', '&', '가', '0' };
		for (char c : arr) {
			if (Character.isUpperCase(c)) // 대문자
				System.out.println(c + ":대문자");
			else if (Character.isLowerCase(c)) // 소문자
				System.out.println(c + ":소문자");
			else if (Character.isDigit(c)) // 숫자
				System.out.println(c + ":숫자");
			else
				System.out.println(c + ":기타문자");

			if (Character.isAlphabetic(c))
				System.out.println(c + ":문자");
			else
				System.out.println(c + ":문자아님");
		}
	}
}