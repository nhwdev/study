/*
 * 관계연산자(비교연산자) : 결과는 boolean
 *  == : 등가연산
 *  >  : 크다  
 *  <  : 작다
 *  >=  :크거나 같다  
 *  <=  :작거나 같다
 *  !=  : 같지 않다  
 */
public class OpEx04 {
	public static void main(String[] args) {
		int x = 1, y = 1;
		System.out.println("1 == 1 :" + (x == y));
		System.out.println("1 != 1 :" + (x != y));
		System.out.println("1 < 1 :" + (x < y));
		System.out.println("1 > 1 :" + (x > y));
		System.out.println("1 <= 1 :" + (x <= y));
		System.out.println("1 >= 1 :" + (x >= y));
	}
}