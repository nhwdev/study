package ex06_random;

import java.util.Random;

/*  java.util 패키지의 클래스
 * 
 * Random 클래스 : 난수 발생 클래스
 * 1. seed 값 설정가능
 * 2. 자료형별로 난수 발생
 *    nextInt() : 정수형 난수
 *    nextInt(n) : 정수형 난수. 0 ~ n-1까지의 임의의 수
 *    nextDouble() : 실수형 난수. Math.random()같음
 *    nextBoolean() : true/false
 */
public class MainEx01 {
	public static void main(String[] args) {
		Random rand1 = new Random();
		rand1.setSeed(1); //
		for (int i = 0; i < 5; i++)
			System.out.println(i + ":" + rand1.nextInt(100)); // 0 ~ 99사이의 임의의 정수
		System.out.println("=================");

		Random rand2 = new Random();
		rand2.setSeed(1);
		for (int i = 0; i < 5; i++)
			System.out.println(i + ":" + rand2.nextInt(100));
		System.out.println("=================");

		Random rand3 = new Random();
		// System.currentTimeMillis() : 1970년 이후부터 현재까지의 밀리초
		rand3.setSeed(System.currentTimeMillis());
		for (int i = 0; i < 5; i++)
			System.out.println(i + ":" + rand3.nextInt(100));

		// true/false
		for (int i = 0; i < 5; i++)
			System.out.println(i + ":" + rand3.nextBoolean());

		// 1 ~ 5사이의 임의의 정수를 출력하기
		for (int i = 0; i < 5; i++) {
			System.out.print(rand3.nextInt(5) + 1 + "  ");
		}
		System.out.println();
	}
}