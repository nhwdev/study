package ex05_constructor;

/*
 * 생성자
 *  - 객체화시 호출되는 메서드
 *  - 호출되는 생성자없는 객체생성은 불가함
 *  - 생성자의 기능은 인스턴스 변수의 초기화 담당
 *  - 클래스 내부에 생성자를 구현하지 않으면, 기본 생성자가 제공됨
 *  - 생성자 오버 로딩 가능함 : 여러개의 생성자 가능
 *  
 * 기본생성자
 *   public 클래스명() { } => 이런 형식임 
 *  
 */
class Number1 { // 생성자 구현안함. 기본생성자 제공
	int num;
}

class Number2 { // 생성자 구현함. 기본생성자 제공 안됨
	int num;

	Number2(int n) { // 생성자. Number2 객체 생성시 int 값을 넣어서 호출
		num = n;
	}
}

public class MainEx01 {
	public static void main(String[] args) {
		Number1 n1 = new Number1();
		/*
		 * new 예약어 1. 메모리 할당. 힙영역에 메모리 할당. 
		 *   객체생성 2. 멤버 변수들을 기본값을 초기화. 명시적 초기화 된경우 초기화 값으로
		 *     초기화 3. 생성자를 호출
		 */
		Number2 n2 = new Number2(10);
		System.out.println(n1.num); // 0
		System.out.println(n2.num); // 10
	}
}