
package ex07_modifier;

import ex07_modifier.test.Modifier2;

public class MainEx02 {
	public static void main(String[] args) {
		Modifier2 m2 = new Modifier2();
		m2.method();
//		System.out.println("m2.v1=" + m2.v1); //v1변수는 private 이므로 Modifier2클래스내에서만 접근 허용
//		System.out.println("m2.v2=" + m2.v2); //default 접근제한자. ex07_modifier.test 패키지 내에서만 접근 허용
//		System.out.println("m2.v3=" + m2.v3); //protected. 다른 패키지인 경우 상속관계만 접근 허용
		System.out.println("m2.v4=" + m2.v4);
	}
}
