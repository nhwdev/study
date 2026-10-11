package ex05_constructor;

/*
 * Rectangle 클래스 구현하기
 * 멤버변수 : width, height
 * 생성자 : 구동 클래스에 맞도록
 * 멤버 메서드
 *     int area()
 *     int length()
 *     String toString() 
 *     (width,height),면적:area(),둘레:length()     
 */
class Rectangle {
	int width, height;

	Rectangle(int w, int h) {
		width = w;
		height = h;
	}

	Rectangle(int w) {
		width = w;
		height = 1;
	}

	int area() {
		return width * height;
	}

	int length() {
		return (width + height) * 2;
	}

	public String toString() {
		return "(" + width + "," + height + "),면적:" + area() + ",둘레:" + length();
	}
}

public class Exam01 {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(10, 10);
		Rectangle r2 = new Rectangle(10);
		System.out.println(r1); // (10,10),면적:100,둘레:40
		System.out.println(r2); // (10,1),면적:10,둘레:22
	}
}