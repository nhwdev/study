package ex02_set;

import java.util.HashSet;
import java.util.Set;

/*
 * Student 클래스 구현하기
 * 멤버변수 : 학번(studno),이름(name),전공(major)
 * 멤버메서드 : toString() : 학생정보출력.
 * 생성자 : 구동클래스에 맞도록
 * 
 * 학번과 이름이 같은 경우 같은 학생으로 인식하도록 설정하기
 */
class Student {
	int studno;
	String name, major;

	public Student(int studno, String name, String major) {
		super();
		this.studno = studno;
		this.name = name;
		this.major = major;
	}

	@Override
	public String toString() {
		return studno + ":" + name + ":" + major;
	}

	@Override
	public int hashCode() {
		return studno + name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student s = (Student) obj;
			return studno == s.studno && name.equals(s.name);
		}
		return false;
	}

}

public class Exam01 {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<>();
		set.add(new Student(1, "홍길동", "경영"));
		set.add(new Student(2, "홍길순", "경영"));
		set.add(new Student(2, "홍길순", "컴공"));
		set.add(new Student(1, "홍길동", "통계"));
		set.add(new Student(3, "홍길동", "컴공"));
		System.out.println(set);
	}
}