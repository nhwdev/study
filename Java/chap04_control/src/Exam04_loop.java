/*
 * for 구문을 이용하여 1 ~ 100 사이의 짝수의 합 출력하기
 * while 구문을 이용하여 1 ~ 100 사이의 홀수의 합 출력하기
 * do while 구문을 이용하여 1 ~ 100 사이의 3의 배수의 합 출력하기
 */
public class Exam04_loop {
	public static void main(String[] args) {
		int sum = 0, i = 0;
		System.out.println("for 구문을 이용하여 1 ~ 100사이의 짝수의 합 출력하기");
		for (i = 1; i <= 100; i++) {
			if (i % 2 == 0)
				sum += i;
		}
		System.out.println("sum=" + sum);
		sum = 0;
		for (i = 2; i <= 100; i += 2) {
			sum += i;
		}
		System.out.println("sum=" + sum);
		System.out.println("while 구문을 이용하여 1 ~ 100사이의 홀수의 합 출력하기");
		sum = 0;
		i = 1;
		while (i <= 100) {
			if (i % 2 == 1)
				sum += i;
			i++;
		}
		System.out.println("sum=" + sum);
		sum = 0;
		i = 1;
		while (i <= 100) {
			sum += i;
			i += 2;
		}
		System.out.println("sum=" + sum);
		System.out.println("do while 구문을 이용하여 1 ~ 100사이의 3의 배수의 합 출력하기");
		sum = 0;
		i = 1;
		do {
			if (i % 3 == 0)
				sum += i;
			i++;
		} while (i <= 100);
		System.out.println("sum=" + sum);
		sum = 0;
		i = 3;
		do {
			sum += i;
			i += 3;
		} while (i <= 100);
		System.out.println("sum=" + sum);
	}
}