package ex01_isa;

/*
 * 1. Java Project 생성 : chap07_inheritance
 * 2. 패키지 생성 : ex01_isa
 * 3. class 생성 : MainEx01.java
 */
/*
 * 상속 예제
 * 1. 자손클래스의 객체 생성시 부모클래스의 객체부터 생성한다.
 * 2. 클래스 간의 상속은 단일 상속만 가능함.
 *    => 자손클래스의 부모 클래스는 한개만 가능함.
 * 3. 모든 클래스의 부모 클래스는 Object 클래스다.  
 *    => 모든 클래스의 객체에는 Object 클래스의 객체를 포함한다. 
 * 4. 부모클래스와 자손 클래스는 is a 관계가 성립한다.   
 */
class Phone extends Object {
	boolean power;
	int number;

	void power() {
		power = !power;
	}

	void send() {
		if (power)
			System.out.println("전화걸기");
		else
			System.out.println("전원이 꺼져 있습니다.");
	}

	void receive() {
		if (power)
			System.out.println("전화받기");
		else
			System.out.println("전원이 꺼져 있습니다.");
	}
}

class SmartPhone extends Phone {
	void setApp(String name) {
		System.out.println(name + "앱 설치함");
	}
}

public class MainEx01 {
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		sp.power();
		sp.send();
		sp.receive();
		sp.setApp("네이버");
	}
}