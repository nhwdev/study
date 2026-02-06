package ex02_lambda;

/*
 * 추상메서드의 구조
 *  매개변수 2개, 리턴타입 있음
 *  
 * {} 내부에 문장이 한개인 경우 {},return 생략 가능 
 */
interface LambdaInterface3 {
	int method(int x, int y);
}

public class MainEx03 {
	public static void main(String[] args) {
		LambdaInterface3 f = (x, y) -> {
			return x + y;
		};
		System.out.println("두수의 합: " + f.method(2, 5)); // 7
		f = (x, y) -> x + y;
		System.out.println("두수의 합: " + f.method(20, 5)); // 25
		f = (x, y) -> x * y;
		System.out.println("두수의 곱: " + f.method(20, 5)); // 25
		f = (x, y) -> x / y;
		System.out.println("두수의 나눈몫: " + f.method(20, 5)); // 25
		f = (x, y) -> x % y;
		System.out.println("두수의 나눈나머지: " + f.method(20, 5)); // 25
		f = (x, y) -> (x > y) ? x : y;
		System.out.println("두수중 큰수: " + f.method(20, 5)); // 25
		f = (x, y) -> (x < y) ? x : y;
		System.out.println("두수중 작은수: " + f.method(20, 5)); // 25
	}
}