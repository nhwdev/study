package ex06_package;

//import java.util.Date;
//import java.util.Scanner;
import java.util.*; //java.util 패키지의 모든 클래스는 패키지명을 생략. 권장하지 않음.
/*
 * package
 *  - 클래스,인터페이스들의 모임
 *  - 클래스의 이름은 패키지명을 포함한다
 *  - 패키지의 설정은 파일의 처음에 한번만 기술해야 함
 *    => 같은 파일에 존재하는 모든 클래스는 같은 패키지에 속한 클래스임.
 *    
 * import : 클래스 이름의 패키지명을 생략할 수 있도록 미리 선언함  
 * 
 * 클래스의 패키지명을 생략 할 수 있는 경우
 * 1. 같은 패키지에 속한 클래스는 패키지명 생략 가능
 * 2. java.lang 패키지에 속한 클래스는 패키지명 생략 가능
 * 3. import 구문으로 선언된 클래스는 패키지명을 생략 가능
 *    import 패키지명.*; => 패키지에 속한 모든 클래스는 패키지명을 생략 가능
 */

class Pack1 {
	void method() {
		System.out.println("ex06_package.Pack1 클래스의 method() ");
		System.out.println(this.getClass().getName() + " 클래스의 method() ");
	}
}

public class MainEx01 {
	public static void main(String[] args) {
		Pack1 p = new Pack1(); // 패키지명 생략. MainEx01와 Pack1 클래스의 패키지가 같다
		p.method();
		Scanner scan = new Scanner(System.in);
		Date date = new Date();
	}
}