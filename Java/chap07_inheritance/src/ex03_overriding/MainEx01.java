package ex03_overriding;

/*
 * 오버라이딩 예제
 * - 상속관계에서 가능함
 * - 부모클래스의 메서드를 자손클래스에서 재정의 함. 메서드의 재정의
 * - 부모클래스의 메서드의 선언부와 자손클래스의 메서드의 선언부는 같아야 함
 *   접근제어자 리턴타입 메서드명 (매개변수목록) 예외처리선언  => 메서드의 선언부
 *   단 접근제어자 : 넓은 범위는 허용
 *      예외처리   : 좁은 범위로 허용
 */
class Bike {
	int wheel; // 바퀴갯수

	Bike(int wheel) {
		this.wheel = wheel;
	}

	String drive() {
		return "페달을 밟는다";
	}

	String stop() {
		return "브레이크를 잡는다";
	}
}

class AutoBike extends Bike {
	boolean power;

	AutoBike(int wheel) {
		super(wheel);
	}

	void power() {
		power = !power;
	}

	@Override // 오버라이딩된 메서드. 오버라이딩 여부 판별 => 어노테이션
	String drive() {
		return "출발 버튼을 누른다";
	}
}

public class MainEx01 {
	public static void main(String[] args) {
		AutoBike ab = new AutoBike(2);
		ab.power();
		System.out.println(ab.drive());
		System.out.println(ab.stop());
		Bike b = new Bike(2);
		System.out.println(b.drive());
		System.out.println(b.stop());
	}
}