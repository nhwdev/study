/*
   1. 자바 컴파일러(javac):자바 언어를 기계어로 번역 기능
           javac HelloWord.java   => HelloWorld.class 파일 생성. (바이트코드)
      자바 인터프리터(java) : 바이트 코드를 JVM 상에서 실행 해주는 기능
           java HelloWorld   => HelloWorld.class 파일을 실행
*/
/*
   2. 자바의 주석(comment) : 실행 영역이 아님. 자바 문법과 상관 없음. 바이트코드로 번역되지 않는 영역
       - 여러줄 주석 : /*   ....     
       - 한줄 주석 :   
   3. 프로그램 작성
       - public class HelloWorld : class 명. public class이름은 파일명과 같아야 함.
*/
public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("HelloWorld");
	}
}
