package ex01_interface;

/*
 * 추상 클래스,인터페이스를 이름 없는 내부 객체로 생성하기
 */
abstract class Abs {
	int num = 100;

	abstract void method();
}

interface Action {
	void method();
}

public class MainEx04 {
	public static void main(String[] args) {
		Abs a1 = new Abs() { // 이름 없는 내부 객체
			@Override
			void method() {
				System.out.println("Abs 클래스의 method(). num=" + num);
			}
		};
		a1.method();

		Action a2 = new Action() {
			@Override
			public void method() {
				System.out.println("Action 인터페이스의 method().");
			}
		};
		a2.method();
		// jdk8 이후에 추가된 람다식. 화살표함수. 함수객체
		Action a3 = () -> System.out.println("람다식으로 작성한 Action 인터페이스의 method().");
		a3.method();
	}
}