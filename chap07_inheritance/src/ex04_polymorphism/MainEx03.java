package ex04_polymorphism;

/*
 * 부모타입의 객체를 자손타입의 참조변수로 참조 불가 :ClassCastException 예외 발생.
 * instanceof 연산자 : 객체와 참조변수의 관계를 알려줌
 */
public class MainEx03 {
	public static void main(String[] args) {
//		Child2 c2 = (Child2)new Parent2();
//		c2.method1();

//		Child c1 = (Child)new Parent();
		Child c1 = new Child();
		if (c1 instanceof Child) {
			System.out.println("c1 객체는 Child 형의 객체임"); // c1객체는 Child 형의 참조변수로 참조가 가능함
		}
		if (c1 instanceof Parent) {
			System.out.println("c1 객체는 Parent 형의 객체임");// c1객체는 Parent 형의 참조변수로 참조가 가능함
		}
		if (c1 instanceof Object) {
			System.out.println("c1 객체는 Object 형의 객체임");// c1객체는 Object 형의 참조변수로 참조가 가능함
		}
	}
}