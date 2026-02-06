/*
 * throws : 예외처리
 *          예외던지기. 예외선언
 *          예외발생한 메서드에서 발생된 예외를 호출한 메서드로 전달함.
 *          => 호출한 메서드에서 예외 발생
 */
public class MainEx04 {
	public static void main(String[] args) {
		try {
			first();
		} catch (Exception e) {
			System.out.println("main 에서 예외 처리");
		}
	}

	private static void first() throws Exception {
		second();
	}

	private static void second() throws Exception {
//		try {
		System.out.println(Integer.parseInt("aaa")); // 예외 발생
//		} catch(Exception e) {
//			System.out.println("숫자만 입력하세요");
//		}
	}
}