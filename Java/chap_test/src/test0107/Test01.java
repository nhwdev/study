package test0107;

/*
 문제: 람다식을 사용하여 다음 연산을 완성하세요.
  
 [결과]
10 + 5 = 15
10 vs 20 Max = 20
7의 제곱 = 49

 */

@FunctionalInterface
interface IntOperation {
 int calculate(int a, int b);
}

public class Test01 {
	public static void main(String[] args) {
	     // [A] 두 수의 합을 구하는 람다
		IntOperation add = (x, y)->x+y; 
	     // [B] 두 수 중 큰 값을 반환하는 람다 (삼항 연산자 활용 가능)
		IntOperation max = (x, y)->x>y?x:y; 
	     // [C] 첫 번째 수의 제곱을 구하는 람다 (b는 무시)
		IntOperation square = (x, y) -> {return x*x;}; 

	     System.out.println("10 + 5 = " + add.calculate(10, 5));
	     System.out.println("10 vs 20 Max = " + max.calculate(10, 20));
	     System.out.println("7의 제곱 = " + square.calculate(7, 0));
	}
}
