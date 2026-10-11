package ex06_this;
/* Rectangle 클래스 구현하기
 * 1. 멤버 변수 
 *     int width, height, sno
 *     static int cnt
 * 2. 생성자 : 구동클래스에 맞도록 구현
 * 3. 멤버메서드
 *      int area()
 *      int length()
 *      boolean isSquare()
 *      String toString() : 결과 출력에 맞도록   
 * 
 * [결과]
 * 1번사각형:(10,10), 면적:100, 둘레:40,정사각형
 * 2번사각형:(1,1), 면적:1,둘레:4, 정사각형
 * 3번사각형:(10,1), 면적:10, 둘레:12,직사각형
 * 4번사각형:(10,10), 면적:100, 둘레:40, 정사각형
 */
class Rectangle {
	int width,height,sno;
	static int cnt;
	Rectangle(int width,int height) {
		this.width = width;
		this.height = height;
		sno = ++cnt;
	}
	Rectangle() {
		this(1,1);
	}
	Rectangle(int width) {
		this(width,1);
	}
	Rectangle(Rectangle r) {
		this(r.width,r.height);
	}
	//멤버메서드
	int area() {
		return this.width * this.height;
	}
	int length() {
		return (this.width + this.height) * 2;
	}
	boolean isSquare() {
		return this.width == this.height;
	}
	public String toString() {
		return this.sno+"번사각형:(" + this.width + "," + this.height + "),면적:" + this.area()
		+",둘레:"+this.length() + "," + (this.isSquare()?"정사각형":"직사각형");
	}
}
public class Exam01 {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(10,10); // 1번사각형:(10,10), 면적:100, 둘레:40,정사각형
		Rectangle r2 = new Rectangle();      // 2번사각형:(1,1), 면적:1,둘레:4, 정사각형
		Rectangle r3 = new Rectangle(10);    // 3번사각형:(10,1), 면적:10, 둘레:12, 직사각형
		Rectangle r4 = new Rectangle(r1);    // 4번사각형:(10,10), 면적:100, 둘레:40, 정사각형
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
	}
}