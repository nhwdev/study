import java.util.Scanner;

/*
 * 화면에서 영문자,숫자를 한개 문자로 입력받아서
 * 대문자인 경우 : 소문자로 변경 출력
 * 소문자인 경우 : 대문자로 변경 출력
 * 숫자인 경우 : 숫자값에 + 20인 값을 출력하기
 */
public class Exam01_if {
	public static void main(String[] args) {
		System.out.println("한개의 영문자,숫자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		char ch = scan.next().charAt(0);
		if(ch >= 'A' && ch <= 'Z') {
			System.out.println(ch + ":" + (char)(ch+32));
		}else if(ch >= 'a' && ch <= 'z') {
			System.out.println(ch + ":" + (char)(ch-32));
		}else if(ch >= '0' && ch <= '9') {
			System.out.println(ch + ":" + ((ch-'0')+20));
		}
	}
}