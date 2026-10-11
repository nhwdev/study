package ex03_method;

/*
 * 재귀함수 : Recurcive call
 *          자신의 함수를 호출하는 함수
 *  4! = 4 * 3 * 2 * 1         
 */
public class MainEx02_Factorial {
	public static void main(String[] args) {
		System.out.println("4!=" + factorial(4));
	}

	private static int factorial(int i) {
		return (i == 1) ? 1 : i * factorial(i - 1);
	}
}