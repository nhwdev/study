package ex02_field;

public class Circle {
	int r; // 반지름
	int sno; // 원의 번호
	static int cnt; // 생성된 원의 갯수

	public String toString() {
		return sno + "번원=>반지름:" + r + ",넓이:" + area() + ",둘레:" + length();
	}

	double area() { // 원의 넓이
		return r * r * 3.14;
	}

	double length() { // 원의 둘레
		return 2 * r * 3.14;
	}
}