package test0107;

/*
 *  문제: start부터 end까지의 숫자 중 짝수만 출력하는 람다를 작성하세요.
 *  실행문이 여러 줄이므로 중괄호 { } 가 필요합니다.
 *  
 [결과]
1부터 10까지 짝수: 2 4 6 8 10  
 */

@FunctionalInterface
interface RangePrinter {
	void printRange(int start, int end);
}

public class Test07 {
	public static void main(String[] args) {
		RangePrinter evenPrinter = (a, b) -> {
			System.out.print(a + "부터 " + b + "까지 짝수: ");
			for (; a <= b; a++) {
				;
				if (a % 2 == 0) {
					System.out.print(a + " ");
				}
			}
		};

		evenPrinter.printRange(1, 10);
	}
}