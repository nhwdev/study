package ex02_string;

/*
 *[결과]
 main : ABC123
 change : ABC123456
 change 후 main : ABC123456
 */
public class Exam01 {
	public static void main(String[] args) {
		String str = "ABC123";
		System.out.println("main:" + str);
		str = change(str);
		System.out.println("change 후 main:" + str);
	}

	private static String change(String str) {
		str += 456;
		System.out.println("change :" + str);
		return str;
	}
}