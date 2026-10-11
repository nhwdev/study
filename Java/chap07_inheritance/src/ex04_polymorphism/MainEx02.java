package ex04_polymorphism;

/*
 * 부모클래스의 멤버와 자손클래스의 멤버가 다른경우
 * - 부모타입의 참조변수로 자손타입의 객체를 참조 가능
 *   => 부모타입의 멤버만 호출 가능
 * - 모든 클래스의 객체는 Object 타입의 참조변수로 참조가 가능
 *   => Object 타입의 참조변수로 참조된 객체는 Object 멤버만 호출 가능  
 */
class Parent2 {
	int x = 10;

	void method1() {
		System.out.println("Parent2 클래스의 method1 메서드");
	}
}

class Child2 extends Parent2 {
	int y = 20;

	void method2() {
		System.out.println("Child2 클래스의 method2 메서드");
	}
}

public class MainEx02 {
	public static void main(String[] args) {
		Child2 c = new Child2();
		System.out.println("c.x=" + c.x);
		System.out.println("c.y=" + c.y);
		c.method1();
		c.method2();
		Parent2 p = c;
		System.out.println("p.x=" + p.x);
//		System.out.println("p.y=" + p.y); //Parent 타입의 참조변수로 호출 못함
		p.method1();
//		p.method2(); //Parent 타입의 참조변수로 호출 못함
		Object o = p;
//		System.out.println("o.x=" + o.x); //Object 멤버가 아님
//		System.out.println("o.y=" + o.y);
//		o.method1();
//		o.method2();
	}
}