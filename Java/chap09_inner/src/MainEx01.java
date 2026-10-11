/*
 * 내부 클래스 : 클래스 내부에 존재하는 클래스
 *   static 내부클래스
 *   인스턴스 내부클래스
 *   지역 내부클래스
 *   
 * 내부클래스 특징
 * 1. 참조자료형으로 사용됨.
 * 2. 객체화 가능. Object 클래스의 하위 클래스
 * 3. 멤버를 소유. 생성자 구현 가능
 * 4. 외부 클래스의 멤버임. 외부클래스의 private 멤버에 접근 가능
 * 5. 인스턴스 내부클래스 : 외부클래스의 인스턴스 멤버임
 *    static 내부클래스 : 외부클래스의 클래스 멤버임  
 */
class Outer1 { // 외부클래스
	class InstanceInner { // 인스턴스 내부 클래스
		int iv = 100;
		static int cv = 10;
		final static int MAX = 200;
	}

	static class StaticInner { // static 내부클래스
		int iv = 300;
		static int cv = 400;
		final static int MAX = 500;
	}

	void method() {
		class LocalInner { // 지역 내부 클래스 : 선언된 메서드 내에서만 사용 가능
			int iv = 600;
			static int cv = 700;
			final static int MAX = 800;
		}
		LocalInner lc = new LocalInner(); // 객체화
		System.out.println(lc.iv);
		System.out.println(lc.cv);
		System.out.println(LocalInner.cv);
		Object o = lc; // Object 클래스의 하위 클래스
	}
}

public class MainEx01 {
	public static void main(String[] args) {
		Outer1 o = new Outer1();
		o.method();
		// InstanceInner 클래스 객체화
//		Outer1.InstanceInner ii= new Outer1.InstanceInner(); //오류
//		Outer1.InstanceInner ii= new Outer1().new InstanceInner(); //외부클래스의 객체화 필요
		Outer1.InstanceInner ii = o.new InstanceInner();
		System.out.println("InstanceInner 멤버 출력하기");
		System.out.println("ii.iv=" + ii.iv);
		System.out.println("InstanceInner.cv=" + Outer1.InstanceInner.cv);
		System.out.println("InstanceInner.MAX=" + Outer1.InstanceInner.MAX);
		// StaticInner 클래스 객체화
		Outer1.StaticInner si = new Outer1.StaticInner();
		System.out.println("StaticInner 멤버 출력하기");
		System.out.println("si.iv=" + si.iv);
		System.out.println("StaticInner.cv=" + Outer1.StaticInner.cv);
		System.out.println("StaticInner.MAX=" + Outer1.StaticInner.MAX);
	}
}