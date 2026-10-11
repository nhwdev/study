package test0102;
/*
 * 구동 클래스가 실행이 되도록 Student 클래스 구현하기
 * [결과]
1번 좌석 : 홍길동
2번 좌석 : 비어 있음
3번 좌석 : 김두한
4번 좌석 : 비어 있음
5번 좌석 : 비어 있음
6번 좌석 : 비어 있음
7번 좌석 : 비어 있음
8번 좌석 : 비어 있음
9번 좌석 : 비어 있음
10번 좌석 : 비어 있음
 */
class Bus {
	Seat[] seats;        // 여러 좌석이 있음
	int passengerLimit;  // 버스 정원
	// 생성자
	public Bus(int passengerLimit) {
		this.seats = new Seat[passengerLimit];
		this.passengerLimit = passengerLimit;
		for(int i = 0; i < seats.length; i++) {
			seats[i] = new Seat();
		}
	}
	public void riding(int seatNo, Person person) {
		if(seatNo <= 0 || seatNo > passengerLimit) {
			return;
		}
		Seat seat = seats[seatNo - 1];
		Person p = seat.person;
		if(p == null) {
			seat.person=person;
		}
	}
	public void info() {
		for(int i = 0; i < passengerLimit; i++) {
			Person person = seats[i].person;
			if(person != null) {
				System.out.println((i + 1) + "번 좌석 : " + person.name);
			} else {
				System.out.println((i + 1) + "번 좌석 : 비어 있음");
			}
		}
	}
}
class Person {
	String name;
	public Person(String name) {
		this.name = name;
	}
}
class Seat {
	Person person;
}
class Student extends Person{
	String name;
	public Student(String name) {
		super(name);
	}
}

public class Test04 {
	public static void main(String[] args) {
		Bus bus = new Bus(10);  // 10인승 버스(좌석번호는 1부터 10까지 부여)
		bus.riding(1, new Person("홍길동"));  // 1번 좌석에 홍길동 앉음
		bus.riding(1, new Person("도깨비"));  // 1번 좌석에 도깨비 앉음(이미 앉아 있으므로 아무 일도 없어야 함)
		bus.riding(3, new Student("김두한")); // 3번 좌석에 김두한 앉음
		bus.riding(11, new Person("공유"));   // 11번 좌석에 공유 앉음(잘못된 입력이므로 아무 일도 없어야 함)
		bus.info();
	}
}
