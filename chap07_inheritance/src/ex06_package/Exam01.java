package ex06_package;

import ex06_package.test.Pack2;

/*
 * ex06_package.test.Pack2 클래스의 method 호출하기
 */
public class Exam01 {
	public static void main(String[] args) {
//		ex06_package.test.Pack2 p = new ex06_package.test.Pack2();
//		p.method();
		Pack2 p = new Pack2(); // import 로 선언됨. 패키지명 생략가능
		p.method();

	}
}