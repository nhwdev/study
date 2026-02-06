/*
 * catch 블럭 : try 블럭 내부에서 예외 발생시 실행되는 영역
 *             다중 catch 블럭 가능함
 * 다중 catch
 *  1. 1개 try 구문에 여러개의 catch 블럭이 가능함
 *  2. try 블럭에서 발생되는 예외 종류별로 예외 처리 가능 
 *  3. 상위 예외클래스(Exception)은 catch 들 중 하단에 배치해야 함 (순서 중요)
 *  
 *  예외 클래스 계층도
 *  Object - Throwable - Error
 *                     |
 *                     - Exception ---- RuntimeException : 예외처리 생략 가능
 *            (예외 클래스의 최상위 클래스) | 
 *                                    - 그외 Exception    : 예외처리 생략 불가
 *  
 * 정상 : 12346            
 * 3/0 예외 발생 : 1256
 */
public class MainEx02 {
	public static void main(String[] args) {
//		System.out.print(3/0); //예외 발생시 JVM 즉시 정상적 실행 중단
		try {
			String str = null; // 객체없이 참조변수값을 초기화.
			System.out.println(str.trim()); // NullPointerException 예외 발생
			// Integer.parseInt(String) : 문자열을 정수(int)로 변경하는 함수
			// 숫자형문자열이 아닌 경우 NumberFormatException 예외 발생
			System.out.println(Integer.parseInt("abc")); // 숫자만 입력하세요 메세지 출력하기
			System.out.println(args[0]); // ArrayIndexOutOfBoundsException 예외 발생
			System.out.print(1);
			System.out.print(2);
			System.out.print(3 / 0); // ArithmeticException 예외 발생
			System.out.print(4);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("command 라인에 파라미터를 입력하세요");
		} catch (ArithmeticException e) {
			System.out.print(5);
		} catch (NumberFormatException e) {
			System.out.println("숫자만 입력하세요");
		} catch (RuntimeException e) { //
			System.out.println("실행 오류가 발생 했습니다. 전산부로 전화하세요.");
			e.printStackTrace(); // 예외 발생 경로 출력.
		} catch (Exception e) { // e :NullPointerException 객체 저장됨
			System.out.println("전산부로 전화하세요.");
			e.printStackTrace(); // 예외 발생 경로 출력.
		}
		System.out.println(6);
	}
}