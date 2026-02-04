/*
 * 논리연산 : 피연산자의 자료형이 boolean. 결과도 boolean
 *   && : AND
 *   || : OR
 *   ^  : XOR
 *   
 *   AND                OR            XOR (배타적 OR)
 *   T && T : T        T || T : T     T ^ T : F  
 *   T && F : F        T || F : T     T ^ F : T
 *   F && T : F        F || T : T     F ^ T : T
 *   F && F : F        F || F : F     F ^ F : F
 *   
 *   && : 앞의 수식이 false 인경우 뒤의 수식은 실행하지 않음 => 쇼트서킷평가(short circuit evaluation)
 *   || : 앞의 수식이 true 인경우 뒤의 수식을 실행하지 않음  => 쇼트서킷평가(short circuit evaluation)
 */
public class OpEx05 {
	public static void main(String[] args) {
		int x = 1, y = 1;
		System.out.println("x==1 && y==1 :" + (x == 1 && y == 1)); // true
		System.out.println("x==2 && y==1 :" + (x == 2 && y == 1)); // false
		System.out.println("x==1 || y==2 :" + (x == 1 || y == 2)); // true
		System.out.println("x==2 || y==2 :" + (x == 2 || y == 2)); // false
		System.out.println("x==1 ^ y==1 :" + (x == 1 ^ y == 1)); // false
		System.out.println("x==1 ^ y==2 :" + (x == 1 ^ y == 2)); // true
	}
}