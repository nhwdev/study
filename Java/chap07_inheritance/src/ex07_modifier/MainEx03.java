package ex07_modifier;

import ex07_modifier.test.Modifier2;

/*
 * protected 접근제한자 허용
 */
class Modifier3 extends Modifier1 { // 같은 패키지에 속한 클래스간의 상속
	public void method1() {
		System.out.println("ex07_modifier.Modifier3 클래스의 method1");
//		System.out.println("v1=" +v1);// 부모클래스의 private 멤버는 자손 멤버에서 접근 불가 
		System.out.println("v2=" + v2);
		System.out.println("v3=" + v3);
		System.out.println("v4=" + v4);
	}
}

class Modifier4 extends Modifier2 { // 다른 패키지에 속한 클래스간의 상속
	public void method1() {
		System.out.println("ex07_modifier.Modifier3 클래스의 method1");
//		System.out.println("v1=" +v1); // 부모클래스의 private 멤버는 자손 멤버에서 접근 불가 
//		System.out.println("v2=" +v2); // default 접근제한자는 같은 패키지에 속한 클래스만 접근 허용
		System.out.println("v3=" + v3); // 다른 패키지의 클래스에서는 상속관계에서는 접근 허용
		System.out.println("v4=" + v4);
	}
}

public class MainEx03 {
	public static void main(String[] args) {
		Modifier3 m3 = new Modifier3();
		m3.method1();
		m3.method();
//		System.out.println("m3.v1=" + m3.v1); // private 멤버 접근 불가
		System.out.println("m3.v2=" + m3.v2);
		System.out.println("m3.v3=" + m3.v3);
		System.out.println("m3.v4=" + m3.v4);

		Modifier4 m4 = new Modifier4();
		m4.method1();
		m4.method();
//		System.out.println("m4.v1=" + m4.v1); // private 멤버 접근 불가
//		System.out.println("m4.v2=" + m4.v2);
//		System.out.println("m4.v3=" + m4.v3);
		System.out.println("m4.v4=" + m4.v4);
	}
}
