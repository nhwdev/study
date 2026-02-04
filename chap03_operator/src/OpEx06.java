
/*
 * 비트연산자 : 피연산자가 정수임. 결과도 정수임
 *  & : AND
 *  | : OR
 *  ^ : XOR
 */
public class OpEx06 {
	public static void main(String[] args) {
		System.out.println(6 & 3);
		/*
		 * 6 : 0110
		 * 3 : 0011
		 * ---------
		 * & : 0010 : 2  
		 */
		System.out.println(6 | 3);
		/*
		 * 6 : 0110
		 * 3 : 0011
		 * ---------
		 * | : 0111 : 7  
		 */
		System.out.println(6 ^ 3);
		/*
		 * 6 : 0110
		 * 3 : 0011
		 * ---------
		 * ^ : 0101 : 5  
		 */
	}
}