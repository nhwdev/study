/*
 * 대입연산자 : =, +=, -=,....
 * 
 * a = 10 : 10값을 a 변수에 저장.
 * a == 10 : a값이 10와 같은지 여부 판단. 관계연산자. 등가연산자
 * 
 *  lvalue(left value) = rvalue(right value)
 *  lvalue는 반드시 변수여야함
 *  rvalue는 변수,상수,수식 모두 가능
 *  
 *  a + b = 10;  (x)
 *  10 = a + b;  (x)
 *  a = 10;      (o)
 *  a = 10 + 20; (o)
 *  a = b;       (o)
 *  a = a + 10;  (o)
 */
public class OpEx08 {
	public static void main(String[] args) {
		int a = 0, b = 0;
//		a + b = 10;
//		10 = a + b;
		a = 10;
		System.out.println(a);// 10
		a = 10 + 20;
		System.out.println(a); // 30
		a = b;
		System.out.println(a); // 0
		a = a + 10;
		System.out.println(a); // 10

		int num = 100;
		num += 10; // num 변수에 10값 더해서 num에 저장. num = num + 10; 의미와 같다
		System.out.println("num=" + num); // num=110
		num -= 10; // num = num - 10;
		System.out.println("num=" + num); // num=100
		num *= 5; // num = num * 5;
		System.out.println("num=" + num); // num=500
		num /= 10; // num = num / 10;
		System.out.println("num=" + num); // num=50
		num %= 3; // num = num % 3;
		System.out.println("num=" + num); // num=2
		num += 2 + 3; // num = num + (2 + 3);
		System.out.println("num=" + num); // num=7
	}
}