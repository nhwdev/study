package ex01_isa;

/*
 * Person 클래스
 * void eat() : 먹는다를 화면에 출력함
 * void sleep() : 잔다를 화면에 출력함
 * 
 * Student 클래스
 * void study() : 공부한다를 화면에 출력함
 */
class Person {
	void eat() {
		System.out.println("먹는다");
	}

	void sleep() {
		System.out.println("잔다");
	}
}

class Student extends Person {
	void study() {
		System.out.println("공부한다");
	}
}

public class Exam01 {
	public static void main(String[] args) {
		Student st = new Student();
		st.eat(); // 먹는다
		st.sleep(); // 잔다
		st.study(); // 공부한다
		System.out.println(st.toString());
	}
}