package ex05_wrapper;

/*
 * switch 구문에서 조건값으로 사용 가능 자료형 : char, byte,short, int, String
 *                                               Character, Byte, Short, Integer
 */
public class MainEx03_switch {
	public static void main(String[] args) {
		Integer data = 0;   //Wrapper 클래스가 unBoxing 됨
		switch(data) {
		case 0 :
		default : System.out.println("switch 조건값의 자료형 테스트");
		}
	}
}
/*
 * java.lang 패키지의 클래스
 *    Object : 모든 클래스의 부모클래스
 *    String : 문자열. 정적인문자열. 변경불가문자열
 *    StringBuffer/StringBuilder : 보조문자열. 동적문자열. 변경가능문자열
 *                                 equals 메서드가 오버라이딩 안됨.
 *    Math : 수치 계산 클래스. 객체화불가. 모든 멤버가 static
 *    Wrapper : 8가지 기본자료형에 대응되는 클래스
 *              대응되는 기본자료형과 자동 형변환됨.  
 */
