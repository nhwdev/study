package ex03_method;

public class MainEx04_MemberCall {
	static int cv1 = 10; // 클래스멤버
	static int cv2 = cv1;// 클래스멤버
	int iv1 = 100; // 인스턴스멤버
	int iv2 = iv1; // 인스턴스멤버
	int iv3 = cv1; // 인스턴스멤버 에서 클래스멤버 호출
	// static int cv3 = iv1; //클래스 멤버에서 인스턴스멤버 호출(불가) => 객체화 필요
	static int cv3 = new MainEx04_MemberCall().iv1;

	void method1() { // 인스턴스 멤버
		System.out.println("cv1 + cv2 =" + (cv1 + cv2)); // 클래스 멤버
		System.out.println("iv1 + iv2 =" + (iv1 + iv2)); // 인스턴스 멤버
	}

	static void method2() { // 클래스 멤버
		System.out.println("cv1 + cv2 =" + (cv1 + cv2)); // 클래스 멤버
		// System.out.println("iv1 + iv2 =" + (iv1 + iv2)); //인스턴스 멤버 호출 불가 => 객체화 필요
		MainEx04_MemberCall m = new MainEx04_MemberCall();
		System.out.println("iv1 + iv2 =" + (m.iv1 + m.iv2));
	}

	void method3() { // 인스턴스 멤버
		method1(); // 인스턴스 멤버
		method2(); // 클래스 멤버
	}

	static void method4() { // 클래스 멤버
		// method1(); // 인스턴스 멤버 호출 불가 => 객체화 필요
		new MainEx04_MemberCall().method1();
		method2(); // 클래스 멤버
	}

	public static void main(String[] args) { // 클래스 멤버
		// method1() ~ method4() 함수 호출하기
		MainEx04_MemberCall m = new MainEx04_MemberCall();
		m.method1();
		method2();
		m.method3();
		method4();
	}
}