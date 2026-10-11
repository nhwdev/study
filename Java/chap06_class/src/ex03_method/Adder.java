package ex03_method;

/*
 * 멤버 메서드(함수, function)
 * 
 *  y =f(x) : x * x 인 경우 
 *  9 =f(3)
 *  25=f(5)
 *  
 *  메서드의 구성 요소
 *  [접근제어자][제어자] 리턴타입 메서드명(매개변수목록)  => 선언부
 *  {   .....                                  => 구현부. 기능을 구현
 *      return 값; //메서드 종료           
 *  }
 *  
 *  - 리턴타입 : 메서드 종료 후 전달되는 값의 자료형
 *             void : 메서드 종료 후 전달 값 없음
 *  - 메서드명 : 식별자. 소문자로 시작권장. Camel 방식  
 *  - 매개변수목록 : 메서드 호출 시 전달되는 값의 자료형과 변수명 설정
 *             전달 값이 없는 경우 ()표현함
 *  - return : 메서드 종료
 *       	   리턴타입이 void 인 경우 : 생략 가능
 *             리턴타입이 void 가 아닌 경우 : 생략 불가. return 리턴값;
 *             리턴값의 자료형 리턴타입과 같아야 함
 *             단 리턴타입으로 자동형변환이 되면 가능함            
 */
public class Adder {
	int add1(int a, int b) {
		return a + b;
	}

	long add2(int a, int b) {
		return a + b; // int 형 값은 long 타입으로 자동 형변환됨 리턴가능.
	}

	void add3(int a, int b) {
		System.out.println(a + b); // 50
		return; // 생략가능
	}
}