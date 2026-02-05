package ex01_object;

/*
 * package 생성 : ex01_object
 * class 생성 : PhoneEx01
 * 
 * 클래스 : 사용자 정의 자료형
 *   속성 : 멤버변수, 필드
 *   기능 : 멤버메서드, 멤버 함수
 */
class Phone {
	String color;
	boolean power;
	String no;

	void power() {
		power = !power;
	}

	void send(String no) {
		System.out.println(no + "로 전화 거는 중");
	}

	void receive(String no) {
		System.out.println(no + "에서 전화 받는 중");
	}
}

//구동클래스 : main메서드를 가지고 있는 public 클래스
public class PhoneEx01 {
	public static void main(String[] args) {
		Phone p1 = new Phone(); // 객체화, 인스턴스화
		/*
		 * new 예약어 기능 
		 * 1. 힙영역에 메모리 할당. 객체 생성 
		 * 2. 멤버필드를 기본값으로 초기화 숫자: 0, boolean:false, 그 외:null 
		 * 3. 생성자 호출
		 */
		// p1.color : p1 참조변수가 참조하고있는 객체의 필드 color에 "검정" 저장
		p1.color = "검정";
		p1.power = true;
		p1.no = "01012345678";
		System.out.println(p1.color + "," + p1.power + "," + p1.no);
		Phone p2 = new Phone(); // 객체화
		p2.color = "파랑";
		p2.power = true;
		p2.no = "01023456789";
		System.out.println(p2.color + "," + p2.power + "," + p2.no);
		p1.send(p2.no);
		p2.receive(p1.no);
	}
}