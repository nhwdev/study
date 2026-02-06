// 내부 클래스에서 외부클래스의 private 멤버에 접근
class Outer2 {
	private int outeriv = 10;
	private static int outercv = 20;

	class InstanceInner {
		int iiv = outeriv; // private 멤버에 접근 가능
		int iiv2 = outercv;
	}

	static class StaticInner {
//		static int scv = outeriv; // 클래스 멤버에서 인스턴스멤버 직접 호출 불가. 객체화 필요
		static int scv = new Outer2().outeriv; // private 멤버 접근 가능
		static int scv2 = outercv;
//		int siv = outeriv;
		int siv = new Outer2().outeriv; // private 멤버 접근 가능
		int siv2 = outercv;
	}

	/*
	 * pv : 외부클래스의 멤버메서드의 지역변수 pv 값은 상수화 되어야 함.
	 * 
	 * 지역내부클래스의 멤버메서드에서 외부메서드의 지역변수는 상수화 되어야 한다. => 지역변수가 변경되지 않으면 상수로 판단함
	 */
	void method(int pv) { // 외부클래스의 멤버 메서드
		// pv += 20;
		int lv = pv + 20;
		class LocalInner { // 지역내부클래스
			int liv = outeriv;
			int liv2 = outercv;
			int liv3 = pv;

			void method(int num) { // 지역내부클래스의 멤버메서드
				outeriv += 10; // 외부 멤버변수
				outercv += 10; // 외부 멤버변수
				System.out.println("outeriv=" + outeriv);
				System.out.println("outercv=" + outercv);
				System.out.println("liv=" + this.liv);
				System.out.println("liv2=" + liv2);
				System.out.println("liv3=" + liv3);
				num += 10;
				System.out.println("num=" + num);
				System.out.println("pv=" + pv);
				System.out.println("lv=" + lv);
			}
		}
		LocalInner li = new LocalInner();
		li.method(pv);
	}
}

public class MainEx02 {
	public static void main(String[] args) {
		// InstanceInner, StaticInner 클래스의 멤버 출력하기
		// LocalInner 클래스의 멤버 출력하기
		Outer2 o = new Outer2();
		System.out.println("InstanceInner 클래스 멤버 출력");
		Outer2.InstanceInner oi = o.new InstanceInner();
		System.out.println("oi.iiv=" + oi.iiv);
		System.out.println("oi.iiv2=" + oi.iiv2);
		System.out.println("StaticInner 클래스 멤버 출력");
		Outer2.StaticInner os = new Outer2.StaticInner();
		System.out.println("StaticInner.scv=" + Outer2.StaticInner.scv);
		System.out.println("StaticInner.scv2=" + Outer2.StaticInner.scv2);
		System.out.println("os.siv=" + os.siv);
		System.out.println("os.siv2=" + os.siv2);
		System.out.println("method()의 LocalInner 클래스의 멤버 출력");
		o.method(100);
	}
}