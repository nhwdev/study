package ex01_list;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * 정렬 예제
 * 정렬인터페이스
 *   1. Comparable<T>
 *     - 클래스에 구현. 기본정렬방식 설정시 사용
 *     - 추상메서드 : compareTo(T t) 
 *        결과 => 음수 : 현재객체가 앞. t 객체가 뒤 배치
 *                양수 : 현재객체가 뒤. t 객체가 앞 배치 
 *     - Collections.sort(List<Comparable>)          
 *   2. Comparator<T>
 *     - 동적으로 정렬방식을 설정시 사용
 *     - 추상메서드 : compare(T t1, T t2)
 *        결과 => 음수 : t1객체가 앞. t2객체가 뒤 배치
 *                양수 : t1객체가 뒤. t2객체가 앞 배치
 *     - FunctionalInterface 이므로 람다형식으로 많이 활용
 *     - 기본 정렬방식이 설정되지 않아도, 활용 가능함
 *     - 기본 정렬방식이 설정된 경우도, 다른 방식으로 정렬시 사용 가능
 *     - Collections.sort(List, Comparator 객체)
 *     
 *    3. 역순 정렬하기
 *     - 기본정렬방식의 역순으로 정렬
 *     - 기본정렬방식의 설정이 필요함
 *     - Comparator.reverseOrder()
 *     - Collections.reverseOrder()
 *                
 */
class Person implements Comparable<Person> {
	String name;
	int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "(" + name + "," + age + ")";
	}

	@Override
	public int compareTo(Person p) { // 이름 순으로 기본정렬방식 설정
		return name.compareTo(p.name);
	}
}

public class MainEx07_sort {
	public static void main(String[] args) {
		List<Person> list = Arrays.asList(new Person("홍길동", 30), new Person("이몽룡", 25), new Person("임꺽정", 15),
				new Person("김삿갓", 20), new Person("김자바", 23));
		System.out.println(list);
		// 정렬하기
		System.out.println("기본정렬방식(이름순):");
		Collections.sort(list); // 기본정렬 방식
		System.out.println(list);
		System.out.println("기본정렬방식의 역순(이름의 역순):");
		Collections.sort(list, Comparator.reverseOrder()); // 이름의 역순으로 정렬하기
		System.out.println(list);
		System.out.println("나이순으로 정렬");
		Collections.sort(list, (d1, d2) -> d1.age - d2.age); // 나이순으로 정렬하기
		System.out.println(list);
		System.out.println("나이 역순으로 정렬");
		Collections.sort(list, (d1, d2) -> d2.age - d1.age); // 나이 역순으로 정렬하기
		System.out.println(list);
	}
}