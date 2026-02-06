/*
 * 예외 강제 발생
 */
public class MainEx06 {
	public static void main(String[] args) {
		/*
		 * try catch 방식으로 예외 처리
		 * 	try { 
		 * 		throw new Exception("예외 강제 발생"); 
		 * 	} catch(Exception e) {
		 * 		System.out.println(e.getMessage()); 
		 * 		e.printStackTrace();
		 * 	}
		 */
		// throw new Exception("예외 강제 발생"); // throws 문장으로 예외 처리

		// 예외 강제 발생 예외 처리 없이 강제 발생
		throw new RuntimeException("예외 강제 발생"); // 예외 처리 생략 가능
	}
}
