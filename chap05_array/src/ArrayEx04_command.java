/*
 * 1. 소스코딩 : ArrayEx04.java
 * 2. 컴파일 : javaC ArrayEx04.java
 *       => ArrayEx04.class 바이트 코드 생성
 * 3. 인터프리터 : java ArrayEx04 홍길동 김삿갓 이몽룡
 *               args <= ["홍길동","김삿갓","이몽룡"]
 *               
 * === java 명령어 ===     
 * 1. JVM 환경 생성.(클래스영역(메서드영역),스택영역,힙영역) 
 * 2. 클래스영역에 바이트코드 로드. 검증
 * 3. main 함수 호출 : args 변수에 command 라인에서 입력된 파라미터값을 배열로 생성하여 전달.
 * 4. args 배열 객체를 사용 가능           
 */
public class ArrayEx04_command {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("command 라인에 파라미터를 입력하세요");
			return; // main 함수 종료. 프로그램 종료
		}
		for (String a : args)
			System.out.println(a);
		System.out.println("===========");
		for (int i = 0; i < args.length; i++) {
			System.out.println("args[" + i + "]=" + args[i]);
		}
	}
}