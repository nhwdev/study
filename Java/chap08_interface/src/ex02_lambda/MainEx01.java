package ex02_lambda;

/*
 * 람다식 (함수객체,화살표함수)
 *  - FunctionalInterface(함수적인터페이스) : 인터페이스의 멤버중 추상메서드가 한개인 인터페이스
 *  - 함수적인터페이스만 람다방식으로 처리 가능.
 *  - jdk8 이후에서만 가능
 *  
 *  추상메서드의 선언부 : 리턴타입 메서드명 (매개변수목록)
 *  - 리턴타입(void), 매개변수없음 구조 
 *    () -> { ... }
 *  - { ... } 내부의 문장이 한개인 경우 {} 생략 가능  
 */
@FunctionalInterface // 인터페이스가 함수적 인터페이스
interface LambdaInterface1 {
	void method();
//	void m1()  // 함수적 인터페이스는 추상메서드가 한개만 가능함
}

public class MainEx01 {
	public static void main(String[] args) {
		LambdaInterface1 fi;
		fi = new LambdaInterface1() {
			@Override
			public void method() {
				System.out.println("기존 방식으로 내부객체 구현함");
			}
		};
		fi.method();
		// 람다방식1
		fi = () -> {
			String str = "람다방식1";
			System.out.println(str + "으로 내부 객체 구현함");
		};
		fi.method();
		// 람다방식2 : 내부의 문장이 한개인 경우 {} 생략가능
		fi = () -> System.out.println("람다방식2로 내부객체 구현함");
		fi.method();
		// 다른함수(execute)를 이용하여 1 ~ 100까지의 합을 출력하기
		// 1. execute 메서드 호출
		// 2. 매개변수값(인자값)을 함수객체 전달
		// 3. execute 메서드 실행 : f.method()
		execute(() -> {
			int sum = 0;
			for (int i = 1; i <= 100; i++)
				sum += i;
			System.out.println("1 ~ 100까지의 합:" + sum);
		});
		// 다른함수(execute)를 이용하여 "람다방식에서 함수 호출로 구현하기" 출력하기
		execute(() -> System.out.println("람다방식에서 함수 호출로 구현하기"));
	}

	static void execute(LambdaInterface1 f) {
		f.method();
	}
}