/*
 * 오버라이딩에서 예외 처리 : 같거나 좁은 범위만 가능함
 *   부모 클래스의 메서드 예외처리보다 자손클래스 메서드의 예외처리는 같거나, 하위 예외 클래스로 선언해야 한다
 */
class Parent {
	public void method() throws ClassNotFoundException {
		System.out.println("Parent 클래스의 method");
	}
}

class Child extends Parent {
	@Override
	public void method() throws ClassNotFoundException {
		System.out.println("Child 클래스의 method");
	}
}

public class MainEx07_Override {
	public static void main(String[] args) throws Exception {
		Child c = new Child();
		c.method();
	}
}