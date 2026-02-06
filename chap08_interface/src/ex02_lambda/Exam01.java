package ex02_lambda;

/*
 * LambdaInterface2를 이용하기
 * 1. 입력된 값까지의 합을 구하여 출력하기
 * 2. n! 값을 구하여 출력하기 
 */
public class Exam01 {
	public static void main(String[] args) {
		LambdaInterface2 f = n -> {
			int sum = 0;
			for (int i = 1; i <= n; i++)
				sum += i;
			System.out.println("1~" + n + "까지의 합:" + sum);
		};
		calc(10, f);
		calc(100, f);
		calc(5, n -> {
			int fa = 1;
			for (int i = n; i >= 1; i--)
				fa *= i;
			System.out.println(n + "!=" + fa);
		});
		calc(6, n -> {
			int fa = 1;
			for (int i = n; i >= 1; i--)
				fa *= i;
			System.out.println(n + "!=" + fa);
		});
	}

	static void calc(int num, LambdaInterface2 f) {
		f.method(num);
	}
}