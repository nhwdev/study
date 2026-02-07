package ex03_map;

import java.util.Arrays;
import java.util.List;

class Student {
	String name;
	int eng, math;

	public Student(String name, int eng, int math) {
		super();
		this.name = name;
		this.eng = eng;
		this.math = math;
	}

	// getter 소스 생성
	public String getName() {
		return name;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}
}

public class MainEx02_Student {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(new Student("홍길동", 90, 80), 
										   new Student("김삿갓", 95, 80),
										   new Student("이몽룡", 95, 85));
		System.out.println("Stream을 이용하여 영어 점수의 합 출력하기");
		System.out.print("영어점수합:");
		System.out.println(list.stream().mapToInt(s -> s.eng).sum());
		System.out.print("수학점수합:");
		System.out.println(list.stream().mapToInt(s -> s.math).sum());
		System.out.print("전체점수합:");
		System.out.println(list.stream().mapToInt(s -> s.eng + s.math).sum());
	}
}