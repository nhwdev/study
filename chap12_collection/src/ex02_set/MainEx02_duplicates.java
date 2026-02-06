package ex02_set;

import java.util.HashSet;
import java.util.Set;

/*
 * 객체 추가시 중복판단 기준
 *   1. equals 메서드의 결과가 true
 *   2. hashCode메서드의 결과가 같은 경우
 *   => 1,2 모두 만족하는 경우 중복판단함.
 *   
 * equals 메서드 오버라이딩 시 , hashCode 메서드도 오버라이딩 권장.   
 */
class Person {
	String name;
	int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + ":" + age;
	}

	@Override
	public int hashCode() { // 이름과 나이가 같은 경우 같은 리턴 오버라이딩
		return name.hashCode() + age;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person other = (Person) obj;
			return name.equals(other.name) && age == other.age;
		}
		return false;
	}
}

public class MainEx02_duplicates {
	public static void main(String[] args) {
		Set<Object> set = new HashSet<>();
		set.add(new String("abc"));
		set.add(new String("abc"));
		set.add(new Person("홍길동", 10));
		set.add(new Person("홍길동", 10));
		System.out.println(set);
	}
}