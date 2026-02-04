

/*
 * 기본자료형의 형변환
 * 1. 기본자료형 중 boolean을 제외한 7가지의 자료형은 형변환 가능
 * 2. 기본자료형과 참조자료형 사이는 형변환 불가 (Wrapper 클래스는 예외)
 * 3. 자동형변환  : 형변환 연산자 생략 가능. 큰자료형 <- 작은자료형 형변환시 
 *    명시적형변환: 형변환 연산자 생략 불가.  작은자료형 <- 큰자료형 형변환시
 *    
 * 4. 자료형 크기 순서
 *     자동형변환 : ---> 
 *     명시적형변환 : <---
 *    byte < short < int < long < float < double
 *           char     
 */
public class VarEx02 {
	public static void main(String[] args) {
		byte b1 = 10;
		short s1 = 20;
		b1 = (byte) s1; // s1변수의 값을 b1 변수에 대입(저장). 명시적형변환. 형변환 연산자 생략 불가
		int i1 = (int) s1; // s1변수의 값을 i1 변수에 대입. 자동형변환. 형변환 연산자 생략가능
		long l1 = 30;
		float f1 = l1; // float가 long보다 큰자료형임. 자동형변환됨
		b1 = 65;
		char c1 = (char) b1; // byte,short와 char 사이의 형변환은 명시적 형변환임.
		System.out.println("c1=" + c1); // A. A문자의 코드값이 65임.

		f1 = (float) 10.0;// 실수형 리터널(값)의 자료형은 double임
		int i2 = c1;
		System.out.println("i2=" + i2); // 65
	}
}