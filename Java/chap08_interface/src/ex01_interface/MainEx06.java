package ex01_interface;

interface MyInterface3 {
	default void defaultMethod() {
		System.out.println("MyInterface3의 default 메서드");
	}

	static void staticMethod() {
		System.out.println("MyInterface3의 static 메서드");
	}
}

class Child2 extends Parent implements MyInterface1, MyInterface3 {
	@Override
	public void method() {
		System.out.println("Child2클래스에서 오버라이딩한 method()");
	}

	@Override
	public void defaultMethod() {
		MyInterface1.super.defaultMethod(); // MyInterface1의 defaultMethod를 호출방식
		MyInterface3.super.defaultMethod();
	}
}

public class MainEx06 {
	public static void main(String[] args) {
		Child2 c = new Child2();
		c.method();
		c.defaultMethod();
		// staticMethod 호출
		MyInterface1.staticMethod();
		MyInterface3.staticMethod();
		Parent p = c;
		p.pmethod();
		MyInterface1 m1 = (MyInterface1) c; // 자동형변환가능
		m1.method();
		m1.defaultMethod(); // Child2에 최종 오버라이딩된 defaultMethod가 호출됨
		MyInterface3 m3 = c;
		m3.defaultMethod(); // Child2에 최종 오버라이딩된 defaultMethod가 호출됨
	}
}