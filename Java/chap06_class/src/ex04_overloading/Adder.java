package ex04_overloading;

/*
 * 메서드 오버로딩 : 메서드의 다형성
 * 오버로딩 조건
 * 1. 같은 클래스 내부에 같은 이름을 가진 메서드가 여러개 존재 가능
 * 2. 매개 변수 목록이 달라야 함(자료형 기준:갯수,순서, 종류 등). 매개변수이름은 상관 없음
 * 3. 그외 접근제한자, 리턴타입을 상관없다.
 */
public class Adder {
	int a = 100;

	int add(int b) {
		System.out.print("1:");
		return a + b;
	}

	double add(double b) {
		System.out.print("2:");
		return a + b;
	}

	String add(String b) {
		System.out.print("3:");
		return a + b;
	}

	float add(float b) {
		System.out.print("4:");
		return a + b;
	}
}