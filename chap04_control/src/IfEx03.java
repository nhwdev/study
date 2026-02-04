import java.util.Scanner;

/*
 * 화면에서 한개의 문자를 입력받아서 대문자,소문자, 숫자, 기타문자인지 출력하기
 * 
 * 대문자 조건 : 'A' <= x <= 'Z' 
 * 소문자 조건 : 'a' <= x <= 'z'
 * 숫자 조건  : '0' <= x <= '9'
 * 그외는 기타문자임
 * 
 *  정수값 입력 : Scanner.nextInt()
 *  float 입력 : Scanner.nextFloat()
 *  double 입력 : Scanner.nextDouble()
 *  String 입력 : Scanner.next()
 *  char 입력 : Scanner.next().charAt(0)
 */
public class IfEx03 {
	public static void main(String[] args) {
		System.out.println("한개의 문자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		char ch = scan.next().charAt(0);
		if (ch >= 'A' && ch <= 'Z') {
			System.out.println(ch + " : 대문자");
		} else if (ch >= 'a' && ch <= 'z') {
			System.out.println(ch + " : 소문자");
		} else if (ch >= '0' && ch <= '9') {
			System.out.println(ch + " : 숫자");
		} else {
			System.out.println(ch + " : 기타문자");
		}
	}
}