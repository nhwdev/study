/*
 * 예외처리 : 발생된 예외를 정상화 하는 과정.예외 없애기
 * 
 * try 구문
 *  try 블럭 : 예외 발생 가능성이 있는 문장. 
 *  catch(예외클래스 참조변수) 블럭 : 예외클래스에 해당하는 예외 발생시 실행되는 영역
 *  finally 블럭 : 정상,예외발생 모두 실행되는 영역
 *  
 *  throws : 예외처리 방식. try 구문 외의 예외처리의 다른 방식 
 *  throw  : 강제 예외 발생
 */
public class MainEx01 {
	public static void main(String[] args) {
		try {
			System.out.println(args[0]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Command 라인에 파라미터를 입력하세요");
		}
	}
}