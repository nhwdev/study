

/*
 * 산술연산자
 *   + : 더하기
 *   - : 빼기
 *   * : 곱하기
 *   / : 나누기
 *   % : 나머지
 */
public class OpEx03 {
	public static void main(String[] args) {
		int x = 10, y = 8;
		System.out.println("10 + 8=" + (x + y)); // 더하기
		System.out.println("10 - 8=" + (x - y)); // 빼기
		System.out.println("10 * 8=" + (x * y)); // 곱하기
		System.out.println("10 / 8=" + (x / y)); // 나누기. int <= int / int
		System.out.println("10 % 8=" + (x % y)); // 나머지
		// 나누기
		System.out.println("10 / 8=" + (x / y));
		System.out.println("-10 / 8=" + (-x / y));
		System.out.println("10 / -8=" + (x / -y));
		System.out.println("-10 / -8=" + (-x / -y));
		// 나머지 : 피젯수의 부호를 따른다
		System.out.println("10 % 8=" + (x % y));
		System.out.println("-10 % 8=" + (-x % y));
		System.out.println("10 % -8=" + (x % -y));
		System.out.println("-10 % -8=" + (-x % -y));

	}
}