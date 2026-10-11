package ex02_lambda;

/*
 * 추상메서드의 구조
 *   매개변수 1개, 리턴타입 없음
 *   
 * (매개변수)->{...}
 * 매개변수가 1개인 경우 : () 생략 가능
 * 실행 구문이 1개인 경우 : {} 생략 가능  
 */
interface LambdaInterface2 {
	void method(int a);
}

public class MainEx02 {
	public static void main(String[] args) {
		LambdaInterface2 fi = (i) -> {
			System.out.println(i * 10);
		};
		fi.method(5); // 50
		fi = i -> System.out.println(i * 10);
		fi.method(5); // 50
		// calc 함수를 이용하기
		calc(10, fi); // 100
		// 제곱을 출력하기
		calc(3, i -> System.out.println(i * i)); // 9
	}

	static void calc(int num, LambdaInterface2 f) {
		f.method(num);
	}
}