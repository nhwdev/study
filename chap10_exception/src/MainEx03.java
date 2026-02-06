/*
 * finally 블럭 : try 블럭에서 정상처리/예외발생 모두 실행되는 블럭
 *               try/catch 에서 return 명령이 실행되도 반드시 실행되는 블럭
 * 
 * 정상실행 : 12356
 * 정상실행 return : 1235
 * 2/0 예외 : 1456
 * 2/0 예외 return : 145
 */
public class MainEx03 {
	public static void main(String[] args) {
		try {
			System.out.print(1);
			System.out.print(2);
			System.out.print(3);
			return;
		} catch (Exception e) {
			System.out.print(4);
//			return; //함수 종료
		} finally {
			System.out.print(5);
		}
		System.out.println(6);
	}
}