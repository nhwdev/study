
/* 
 * 1. 식별자 : 프로그램 작성시 결정해야 하는 이름
 *           변수명, 메서드(함수)명,클래스명,상수명
 *    규칙 : 
 *       - 문자, 숫자, 특수문자 중(_, $)만 가능
 *       - 숫자로 시작불가.
 *       - 예약어(키워드)는 식별자로 사용 불가
 *    권장사항 : 
 *       - 클래스명은 대문자로 시작
 *       - 변수,메서드는 소문자로 시작
 *       - 의미가 변경되는 경우 대문자로 구분하기(카멜방식:소문자로시작,파스칼방식:대문자로시작)
 *         변수명   : mathScore 
 *         메서드명 :  getScore()  
 *       
 * 2. 변수
 *    - 값을 저장하는 메모리의 공간
 *    - 한개의 변수는 한개의 값만 저장 가능  
 *    - 사용전에 반드시 선언이 필요함
 *       자료형(변수타입) 변수이름 =>변수의 선언
 * 3. 자료형 ********
 *    - 기본자료형 : 8가지
 *        종류
 *        논리형 : boolean(1)              => true/false
 *        문자형 : char(2)                 => 한개의 문자만 저장 
 *        정수형 : byte(1),short(2),int(4),long(8) => 소숫점이하가 없는 숫자형
 *        실수형 : float(4), double(8)      => 소숫점이하가 있는 숫자형
 *    - 참조자료형  
 *        배열
 *        클래스
 *        인터페이스         
 */
public class VarEx01 {
	public static void main(String[] args) {
		boolean b = true;
		b=false;
//		b=0; //컴파일 오류 발생. boolean 형은 true/false만 저장 가능
		byte by = 10;
		short sh = 20;
		int i = 30;
		long l = 40;
		float f = 10.5f;
		double d = 100.23456;
		char c = 'A'; //문자열은 ", 문자는 ' 
		System.out.println("b=" + b);
		System.out.println("by=" + by);
		System.out.println("sh=" + sh);
		System.out.println("i=" + i);
		System.out.println("l=" + l);
		System.out.println("f=" + f);
		System.out.println("d=" + d);
//		by =128; //byte형이 저장할 수 있는 범위 : -128 ~ 127까지만 저장 가능
		by = (byte)300;
		System.out.println("by=" + by);
	}
}