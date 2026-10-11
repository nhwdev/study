package ex02_field;
//출력 결과가 나오도록 Rectangle 클래스 구현하기

class Rectangle {
	int width, height, sno;
	static int cnt;

	public String toString() {
		return sno + "번사각형: 가로(" + width + "), 세로(" + height + "), 면적:" +
			   (width * height) + ", 둘레:" + ((width + height) * 2);
	}
}

public class Exam01 {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.width = 10;
		r1.height = 20;
		r1.sno = ++Rectangle.cnt;
		System.out.println(r1); // 1번사각형:가로(10),세로(20),면적:200,둘레:60
		Rectangle r2 = new Rectangle();
		r2.width = 1;
		r2.height = 2;
		r2.sno = ++Rectangle.cnt;
		System.out.println(r2); // 2번사각형:가로(1),세로(2),면적:2,둘레:6
		System.out.println("현재까지 생성된 사각형 갯수:" + Rectangle.cnt); // 현재까지 생성된 사각형 갯수 : 2
	}
}