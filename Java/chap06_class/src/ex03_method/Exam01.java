package ex03_method;

//Rectangle 클래스 구현하기
class Rectangle {
	static int cnt;
	int width,height,serialNo;
	int area() {
		return width*height;
	}
	int length() {
		return (width+height) * 2;
	}
	boolean isSquare() {
		return width == height;
	}
}
public class Exam01 {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.width = 30;
		r1.height = 20;
		r1.serialNo = ++Rectangle.cnt;
		System.out.println(r1.serialNo + "번 사각형 넓이:" + r1.area());
		System.out.println(r1.serialNo + "번 사각형 둘레:" + r1.length());
		System.out.println(r1.serialNo + "번 정사각형여부:" + (r1.isSquare()?"정사각형":"직사각형"));
		Rectangle r2 = new Rectangle();
		r2.width = 10;
		r2.height = 10;
		r2.serialNo = ++Rectangle.cnt;
		System.out.println(r2.serialNo + "번 사각형 넓이:" + r2.area());
		System.out.println(r2.serialNo + "번 사각형 둘레:" + r2.length());
		System.out.println(r2.serialNo + "번 정사각형여부:" + (r2.isSquare()?"정사각형":"직사각형"));
	}
}