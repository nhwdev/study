package ex03_stringbuffer;

/*
 * StringBuffer/StringBuilder : 동적문자열
 * - 같은 메서드를 멤버로 가짐.
 * - StringBuffer : 기존클래스. 스레드의 동기화된 메서드를 멤버로 가짐
 * - StringBuilder : 5.0이후 클래스. 스레드의 비동기화된 메서드를 멤버로 가짐
 * - equals 메서드 오버라이딩 하지 않음. 내용 비교 못함
 *   => 내용 비교를 위해서 toString() 문자열로 변경후 비교가능
 * - String 클래스의 보조 클래스로 많이 사용됨  
 */
public class MainEx01 {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		System.out.println("sb1 == sb2 :" + (sb1 == sb2));
		System.out.println("sb1.equals(sb2) :" + (sb1.equals(sb2)));
		System.out.println("sb1.toString().equals(sb2.toString()) :" + 
						  (sb1.toString().equals(sb2.toString())));
		StringBuilder sb3 = new StringBuilder("abc");
		StringBuilder sb4 = new StringBuilder("abc");
		System.out.println("sb3 == sb4 :" + (sb3 == sb4));
		System.out.println("sb3.equals(sb4) :" + (sb3.equals(sb4)));
		System.out.println("sb3.toString().equals(sb4.toString()) :" + 
						  (sb3.toString().equals(sb4.toString())));
	}
}