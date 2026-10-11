/*
 * 내부 클래스에서 사용되는 this, super
 * 
 * 1. this 참조변수로는 외부클래스의 멤버에 접근 불가. 내부클래스의 멤버만 접근 가능
 * 2. 외부클래스의 멤버를 this 로 접근 : 외부클래스명.this.멤버명
 * 3. 외부클래스의 상위 멤버를 super 로 접근 : 외부클래스명.super.멤버명
 * 
 * 내부클래스에서 멤버 메서드에서 변수값을 접근 우선순위
 * 1. 지역변수
 * 2. 내부클래스의 멤버변수. this.멤버명으로 접근가능
 * 3. 외부클래스의 멤버변수. 외부클래스명.this.멤버명으로 접근가능
 * 3. 외부클래스의 상위의 멤버변수. 외부클래스명.super.멤버명으로 접근가능
 */
class ParentOuter {
	int iv = 0;
	int piv = 500;
}

class Outer3 extends ParentOuter {
	int iv = 10;
	private int iv2 = 20;

	class InstanceInner {
		int iv = 100;
//		int iv2 = 300;

		void method() {
			int iv = 200;
			System.out.println("iv=" + iv); // 지역변수 우선
			System.out.println("iv2=" + iv2); // 외부클래스의 iv2
			System.out.println("piv=" + piv); // 외부클래스의 부모클래스의 piv
			System.out.println("InstanceInner.iv=" + this.iv); // InstanceInner의 iv
			System.out.println("Outer3.iv=" + Outer3.this.iv); // Outer3의 iv
			System.out.println("ParentOuter.iv=" + Outer3.super.iv); // ParentOuter의 iv

		}
	}
}

public class MainEx03 {
	public static void main(String[] args) {
		new Outer3().new InstanceInner().method();
	}
}