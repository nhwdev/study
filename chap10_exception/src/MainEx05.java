/*
 * throws : 예외 처리
 * throw  : 예외 발생. 없는 예외를 강제로 발생
 */
public class MainEx05 {
	public static void main(String[] args) {
		try {
			first();
		} catch (Exception e) {
			System.out.println("main 메서드에서 예외 처리");
		}
	}

	private static void first() throws Exception {
		second();
	}

	private static void second() throws Exception {
		try {
			System.out.println(Integer.parseInt("abc"));
		} catch (Exception e) {
			System.out.println("second 메서드에서 예외 처리");
			throw e; // 예외 재 발생
		}
	}
}