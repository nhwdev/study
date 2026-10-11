package ex01_object;

/*
 * Rectangle 클래스 구현하기
 */
class Rectangle {
	int width,height;
	void area() {
		System.out.println("면적:" + width*height);
	}
	void length() {
		System.out.println("둘레:" + (width+height) * 2);
	}
}
public class Exam01 {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.width = 10;
		r1.height = 5;
		r1.area(); //면적:50
		r1.length(); // 둘레:30
	}
}