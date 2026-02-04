

/*
 * [결과]
 * f=1.5
 * l=27000000000
 * result=true
 */
public class Exam05 {
	public static void main(String[] args) {
		float f = 3f / 2;
		long l = 3000L * 3000 * 3000;
		float f2 = 0.1f;
		double d = 0.1f;
		boolean result = d == f2;
		System.out.println("f=" + f);
		System.out.println("l=" + l);
		System.out.println("result=" + result);
		System.out.println("d=" + d + ",f2=" + f2);
		System.out.printf("d=%.20f\n", d);
		System.out.printf("f2=%.20f\n", f2);
	}
}