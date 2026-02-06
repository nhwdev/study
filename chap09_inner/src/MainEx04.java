/*
 * 람다 객체에서 this
 */
interface LambdaInterface {
	void method();
}

class Outer {
	public int iv = 10;

	void method() {
		int iv = 40;
//		iv++; // 외부메서드의 지역변수는 상수화 필요
		LambdaInterface f = () -> {
			System.out.println("iv=" + iv); // 40. 지역변수는 상수화 필요
			System.out.println("this.iv=" + this.iv); // 10
			System.out.println("Outer.this.iv=" + Outer.this.iv); // 10
		};
		f.method();
	}
}

public class MainEx04 {
	public static void main(String[] args) {
		new Outer().method();
	}
}