package ex02_string;

/*
 * String 클래스
 * 1. 정적인 문자열 : 변경불가 문자열
 * 2. + 연산자가 가능한 유일한 클래스
 * 3. 대입연산자를 이용하여 객체 생성이 가능한 유일한 클래스
 *     new 클래스명(); 원래 객체생성의 방식
 *     String str = "abc";
 * 4. final 클래스임.    
 */
public class MainEx01 {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc";
		System.out.println("s1 == s2 :" + (s1 == s2));
		System.out.println("s1.equals(s2) :" + (s1.equals(s2)));
		String s3 = new String("abc");
		String s4 = new String("abc");
		System.out.println("s3 == s4 :" + (s3 == s4));
		System.out.println("s3.equals(s4) :" + (s3.equals(s4)));
		System.out.println("identityHashCode(s1) : " + System.identityHashCode(s1));
		System.out.println("identityHashCode(s2) : " + System.identityHashCode(s2));
		System.out.println("identityHashCode(s3) : " + System.identityHashCode(s3));
		System.out.println("identityHashCode(s4) : " + System.identityHashCode(s4));
	}
}