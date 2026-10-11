package ex04_overloading;

/*
 * 오버로딩 메서드의 선택 기준
 * 1. 호출되는 인자값의 자료형과 메서드에 선언된 매개변수의 자료형이 동일한 경우
 * 2. 1의 조건이 없는 경우
 *    최소 갯수로 자동형변환이 가능한 매개변수를 가진 메서드 선택
 *    => 동일한 조건의 메서드가 여러개인 경우 오류 발생
 */
public class MainEx02 {
	public static void main(String[] args) {
		Adder2 a = new Adder2();
		System.out.println("a.add(10,10):" + a.add(10, 10)); // int, int 호출
		System.out.println("a.add(10,10L):" + a.add(10, 10L)); // int, long 호출
		System.out.println("a.add(10L,10):" + a.add(10L, 10)); // long, int 호출
		System.out.println("a.add(10L,10L):" + a.add(10L, 10L)); // long, long 호출
	}
}