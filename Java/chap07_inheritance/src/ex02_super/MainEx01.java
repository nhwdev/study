package ex02_super;

/*
 * super 생성자 
 *   - 부모클래스의 생성자 호출
 *   - 부모클래스의 생성자 중 매개변수가 없는 생성자가 존재하면 super() 생략 가능
 *   - 부모클래스의 생성자 중 매개변수가 없는 생성자가 없으면 super(부모클래스의 매개변수타입) 호출해야함.
 *     => super(값들...) 생략 불가. 
 * super 참조변수
 *   - 부모클래스의 객체를 참조하는 참조변수    
 *   - 인스턴스 멤버에서만 사용이 가능.
 */
class Parent {
	int x = 10;

	Parent(int x) {
		this.x = x;
	}
//	Parent() {}
}

class Child extends Parent {
	int x = 20;

	public Child() {
		super(10); // 부모클래스의 생성자 호출
	}

	void method() {
		int x = 30;
		System.out.println("x=" + x); // x : 지역변수
		System.out.println("this.x=" + this.x);// this.x : 멤버변수
		System.out.println("super.x=" + super.x); // super.x : 부모객체의 멤버변수
	}
}

public class MainEx01 {
	void method() {
		System.out.println(super.toString());
	}

	public static void main(String[] args) {
		Child c = new Child();
		c.method();
		new MainEx01().method();
		// System.out.println(super.toString()); // super, this는 인스턴스메서드에서만 호출이 가능함
	}
}