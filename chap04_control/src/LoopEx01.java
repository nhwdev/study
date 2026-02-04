/*
 * 반복문 : 조건식의 결과가 참인 동안 {}내의 문장을 반복 수행
 * === for ===
 * for(초기값;조건식;증감식) {
 *    조건식의 결과가 참인 동안 수행되는 문장
 * }
 * 
 * === while ===
 * while(조건식) {
 *    조건식의 결과가 참인 동안 수행되는 문장
 * }
 * 
 * === do while ===
 * do {
 *   처음 반복 시작시 실행되거나, 조건식의 결과가 참인 경우 수행되는 문장
 * }while(조건식)
 */
public class LoopEx01 {
	public static void main(String[] args) {
		System.out.println("반복문 없이 1 ~ 5까지 출력하기");
		System.out.print(1);
		System.out.print(2);
		System.out.print(3);
		System.out.print(4);
		System.out.println(5);
		System.out.println("for 구문으로 1 ~ 5까지 출력하기");
		for (int i = 1; i <= 5; i++) {
			System.out.print(i);
		}
		System.out.println();
		/*
		 * 12345
		 * 
		 * 1. int i=1 : 반복문 시작시 한번만 실행.
		 * 				i 변수는 for 구문 내부에서 선언되었으므로 for 구문 내에서만 사용이 가능한 지역 변수임 
		 * 2. i<=5 : 조건식. 조건식의 결과가 참인 경우 
		 * 			 {} 내의 문장을 실행 조건식의 결과가 거짓인 경우 for 구문이 종료. 반복 종료 
		 * 3. System.out.print(i); 문장 실행 4. i++ : i 변수의 값이 1 증가됨
		 * 
		 * 2번으로 다시 반복
		 */
		System.out.println("while 구문으로 1 ~ 5까지 출력하기");
		int i = 1;
		while (i <= 5) {
			System.out.print(i);
			i++;
		}
		System.out.println();
		System.out.println("i=" + i);
		/*
		 * 12345
		 * 
		 * 1. (i <= 5) : 조건식. 조건식의 결과가 참인 경우
		 * 				 {} 내의 문장을 실행 조건식의 결과가 거짓인 경우 반복문 종료 
		 * 2. System.out.print(i); i++;
		 * 
		 * 1번 반복함
		 */
		i = 1;
		System.out.println("do while 구문으로 1 ~ 5까지 출력하기");
		do {
			System.out.print(i);
			i++;
		} while (i <= 5);
		System.out.println();
	}
}