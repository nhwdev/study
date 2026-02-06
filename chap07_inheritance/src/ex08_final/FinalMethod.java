package ex08_final;
/*
 * final method : 오버라이딩(재정의) 불가. 
 */
public class FinalMethod {
	final void method() { //재정의 불가 메서드
		System.out.println("FinalMethod 클래스의 method");
	}
}
/*
class SubMethod extends FinalMethod {
	@Override
	void method() {
		System.out.println("SubMethod 클래스의 method");
	}
}
*/