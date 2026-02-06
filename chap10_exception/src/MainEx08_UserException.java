/*
 * 사용자 정의 예외 클래스 생성하기 
 */
class LoginFailException extends RuntimeException {
	LoginFailException(String msg) {
		super(msg);
	}
}

public class MainEx08_UserException {
	public static void main(String[] args) {
		String id = "hong1";
		String pw = "1234";
		if (!id.equals("hong") || !pw.equals("1234")) {
			System.out.println("아이디 또는 비밀번호가 틀립니다.");
		} else {
			System.out.println("반갑습니다." + id + "님");
		}
		// 예외처리 방식으로 구현하기
		try {
			if (!id.equals("hong") || !pw.equals("1234")) {
				throw new Exception("아이디 또는 비밀번호가 틀립니다.");
			}
			System.out.println("반갑습니다." + id + "님");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		// 사용자 예외로 구현하기
		if (!id.equals("hong") || !pw.equals("1234")) {
			throw new LoginFailException("아이디 또는 비밀번호가 틀립니다.");
		}
		System.out.println("반갑습니다." + id + "님");

	}
}