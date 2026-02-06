package ex01_object;

/*
 * hashCode 
 *   해시코드 : JVM 객체를 구분하기 위한 고유 ID값(참조값)
 *   두객체의 해시코드값이 같은 경우 하나의 객체로 인식.
 *   
 *   물리적으로 같은 객체 : 실제 같은 객체
 *   논리적으로 같은 객체 : 내용 기준으로 같은 객체인지 판단해야 할 경우
 *   
 *   논리적 동일 객체를 판단 기준
 *   1. equals 메서드의 결과가 true
 *   2. hashCode 메서드의 결과가 같은 경우
 *   
 *   권장 : equals 메서드를 오버라이딩시 hashCode 메서드도 오버라이딩을 권장함
 *   
 *   String 클래스 : equals,hashCode 메서드가 오버라이딩되어 있음
 */
public class MainEx02_hashCode {
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		System.out.println("str1 == str2 :" + (str1 == str2));
		System.out.println("str1.equals(str2) : " + str1.equals(str2));
		System.out.println("str1.hashCode() :" + str1.hashCode());
		System.out.println("str2.hashCode() :" + str2.hashCode());
		// 실제 객체의 참조값
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	}
}