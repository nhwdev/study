package ex05_objectstream;

import java.io.Serializable;

/*
 * Serializable 인터페이스의 멤버가 없다.
 * Serializable 인터페이스를 구현한 클래스의 객체는 외부로 출력이 가능함. 허가기능
 */
public class Customer implements Serializable {
	private String name;
	private int age;

	public Customer(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return name + "," + age;
	}
}