package ex04_polymorphism;

/*
 * 참조변수와 객체와의 관계 예제
 * 
 * 1. 자손타입의 객체를 부모타입의 참조변수로 참조가 가능 => 다형성
 * 2. 부모타입의 멤버와 자손타입의 멤버가 같은 경우
 *     부모타입의 참조변수로 자손타입의 객체 참조하는 경우
 *       멤버변수   : 참조변수의 자료형을 기준으로 호출함
 *    	 멤버메서드 : 객체의 최종 오버라이딩된 메서드를 호출함
 * 3. 모든 클래스의 객체는 Object 형의 참조변수로 참조가 가능.    
 */
class Parent {
	int x = 10;

	void method() {
		System.out.println("Parent 클래스의 method");
	}
}

class Child extends Parent {
	int x = 20;

	@Override
	void method() {
		System.out.println("Child 클래스의 method");
		System.out.println("x=" + x); // 20
		System.out.println("this.x=" + this.x); // 20
		System.out.println("super.x=" + super.x); // 10
	}
}

public class MainEx01 {
	public static void main(String[] args) {
		Parent p = new Child(); // Child 객체를 Parent 타입의 참조변수로 참조
		System.out.println(p.x);// p.x:Parent 객체의 x값이 호출
		p.method(); 			// 객체에 최종 오버라이딩된 메서드 호출. 참조변수 타입과 상관 없음
		Child c = (Child) p;	// p 참조변수를 Child형으로 변환하여 c 참조변수에 저장. 명시적 형변환
		System.out.println(c.x);// c.x : Child 객체의 x값이 호출
		c.method(); 			// 객체에 최종 오버라이딩된 메서드 호출. 참조변수 타입과 상관 없음
		Object o = c; 			// 모든 객체는 Object형의 참조변수로 참조가 가능. 자동형변환

		// 부모클래스 > 자손클래스
		// 자손클래스<- 부모클래스 형변환시 형변환 연산자 생략 불가. 명시적형변환
		// 부모클래스 <- 자손클래스 형변환시 형변환 연산자 생략 가능. 자동형변환
	}
}