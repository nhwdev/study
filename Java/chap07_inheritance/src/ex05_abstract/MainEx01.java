package ex05_abstract;

/*
 * 추상클래스
 * 1. 추상 메서드를 멤버로 가질 수 있는 클래스
 * 2. abstract 예약어를 사용
 * 3. 객체화 불가 => 상속을 통해서 자손클래스의 객체화로 객체화 가능
 * 4. 그외는 일반클래스와 동일함
 *    - 생성자
 *    - 멤버변수,멤버메서드
 *    - 초기화블럭
 *    - 다른 클래스를 상속가능. 다른클래스의 자손클래스도 가능
 *    
 * 추상메서드
 * 1. 메서드의 선언부만 존재함
 * 2. abstract 예약어를 사용
 * 3. 자손클래스에서 반드시 오버라이딩이 필요함.    
 */
abstract class Shape { // 추상클래스
	String type;

	Shape(String type) {
		this.type = type;
	}

	abstract double area(); // 추상메서드

	abstract double length(); // 추상메서드

	public String toString() {
		return String.format("면적=%-12.5f,둘레=%-12.5f", area(), length());
	}
}

class Circle extends Shape {
	int r;

	Circle(int r) {
		super("원");
		this.r = r;
	}

	@Override
	double area() { // Shape 추상클래스의 추상메서드를 오버라이딩함. 오버라이딩 필수
		return r * r * Math.PI;
	}

	@Override
	double length() { // Shape 추상클래스의 추상메서드를 오버라이딩함. 오버라이딩 필수
		return 2 * r * Math.PI;
	}

	public String toString() {
		return type + ":반지름=" + r + "," + super.toString();
	}
}

class Rectangle extends Shape {
	int width, height;

	Rectangle(int width, int height) {
		super("사각형");
		this.width = width;
		this.height = height;
	}

	@Override
	double area() {
		return width * height;
	}

	@Override
	double length() {
		return (width + height) * 2;
	}

	public String toString() {
		return type + ":가로=" + width + ",세로=" + height + "," + super.toString();
	}
}

public class MainEx01 {
	public static void main(String[] args) {
//		Shape s = new Shape("도형");  //추상클래스는 객체화 불가
		Shape s = new Circle(10);
		System.out.println("면적:" + s.area());
		System.out.println("둘레:" + s.length());
		System.out.println("도형종류:" + s.type);
//		System.out.println("반지름:" + ((Circle)s).r);
		Circle c = (Circle) s;
		System.out.println("반지름:" + c.r);
	}
}