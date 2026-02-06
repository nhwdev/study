package ex01_interface;

/*
 * 인터페이스의 default, static 메서드
 *  - JDK8 이후에 추가된 내용
 *  - 구현부가 존재하는 메서드
 *  - default 메서드 : 인스턴스 멤버.  
 *  - static 메서드  : 클래스 멤버. 인터페이스명.메서드명 호출
 *  - 다중 구현이 가능함
 *    추상메서드가 중복가능=>한개만 구현.
 *    default 메서드 중복 => 오버라이딩 필요
 *    default 메서드가 중복 안된 경우 => 오버라이딩 필요 없음. 
 *    static 메서드 중복 => 상관 없음.
 */
interface MyInterface1 {
	void method();

	default void defaultMethod() {
		System.out.println("MyInterface1의 default 메서드");
	}

	static void staticMethod() {
		System.out.println("MyInterface1의 static 메서드");
	}
}

interface MyInterface2 {
	void method();
}

class Parent {
	public void pmethod() {
		System.out.println("Parent클래스의 pmethod()");
	}
}

class Child extends Parent implements MyInterface1, MyInterface2 {
	@Override
	public void method() {
		System.out.println("Child 클래스에서 오버라이딩 된 method()");
	}
}

public class MainEx05 {
	public static void main(String[] args) {
		Child c = new Child();
		c.method();
		c.pmethod();
		c.defaultMethod();
//		c.staticMethod(); //참조변수로 static 메서드 호출 불가
//		Child.staticMethod(); //클래스명으로 static 메서드 호출 불가
		MyInterface1.staticMethod(); // 인터페이스명.static메서드명 호출 해야함

		MyInterface1 m1 = c;
		m1.method();
		m1.defaultMethod();
//		m1.pmethod();
		MyInterface2 m2 = c;
		m2.method();
//		m2.defaultMethod();
		Parent p = c;
		p.pmethod();
	}
}