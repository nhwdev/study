package ex07_modifier;

/*
 * 제한자(제어자,수정자) : 
 *   - 접근제한자 : private < (default) < protected < public
 *   - 그외제한자 : static, abstract, final
 *   
 * 접근제한자
 *   private   : 동일 클래스내에서만 접근 허용
 *   (default) : 동일 패키지에 속한 클래스에서 접근 허용
 *   protected : 다른패키지의 경우 상속관계인 경우 접근 허용
 *   public    : 모든 접근 허용  
 */
class Modifier1 {
	private int v1 = 100;
	int v2 = 200; // default 접근제한자
	protected int v3 = 300;
	public int v4 = 400;

	public void method() {
		System.out.println("ex07_modifier.Modifier1 클래스의 method");
		System.out.println("v1=" + v1);
		System.out.println("v2=" + v2);
		System.out.println("v3=" + v3);
		System.out.println("v4=" + v4);
	}
}

public class MainEx01 {
	public static void main(String[] args) {
		Modifier1 m1 = new Modifier1();
		m1.method();
//		System.out.println("m1.v1=" + m1.v1);//v1의 접근제한자가 private 이므로 다른 클래스에서 접근불가
		System.out.println("m1.v2=" + m1.v2);// Modifier1 과 MainEx01 클래스는 같은 패키지에 속한 클래스
		System.out.println("m1.v3=" + m1.v3);
		System.out.println("m1.v4=" + m1.v4);
	}
}