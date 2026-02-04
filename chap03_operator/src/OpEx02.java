

/* 단항연산자
 *   부호연산자 : +, -
 * 		+ : 현재 부호를 유지
 * 		- : 부호를 변경. 현재값 음수 => 양수, 현재값 양수 => 음수 변경	
 * 
 *   논리부정 : ! (not)
 *     !true => false 
 *     !false => true 
 */
public class OpEx02 {
	public static void main(String[] args) {
		int x = -10;
		System.out.println("x=" + +x); // x=-10
		System.out.println("x=" + -x); // x=10
		x = 10;
		System.out.println("x=" + +x); // x=10
		System.out.println("x=" + -x); // x=-10
		// 논리부정 연산자 : !
		System.out.println("true=" + !false);
		System.out.println("false=" + !true);
		System.out.println("5 != 4 :" + (5 != 4));
		System.out.println("!(5 == 4) :" + !(5 == 4));
	}
}