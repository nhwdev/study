package ex07_modifier.test;

public class Modifier2 {
	private int v1 = 100;
	int v2 = 200; // default 접근제한자
	protected int v3 = 300;
	public int v4 = 400;

	public void method() {
		System.out.println("ex07_modifier.test.Modifier2 클래스의 method");
		System.out.println("v1=" + v1);
		System.out.println("v2=" + v2);
		System.out.println("v3=" + v3);
		System.out.println("v4=" + v4);
	}
}