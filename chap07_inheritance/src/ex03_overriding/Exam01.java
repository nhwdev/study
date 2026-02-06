package ex03_overriding;

/*
 * Point3D 클래스 구현하기
 * 멤버변수 : x, y, z
 * Point 클래스 상속받아 구현하기
 * 멤버메서드 : info() => 오버라이딩하기 
 */
class Point {
	int x, y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	void info() {
		System.out.print("좌표:x=" + x + ",y=" + y);
	}
}

class Point3D extends Point {
	int z;

	Point3D(int x, int y, int z) {
		super(x, y); // 첫줄에 구현 해야 함
		this.z = z;
	}

	@Override
	void info() {
		//System.out.println(this.x + "," + this.y + "," + this.z);
		super.info(); // 부모클래스의 info 메서드 호출
		System.out.println(",z=" + z);
	}
}

public class Exam01 {
	public static void main(String[] args) {
		Point3D p3 = new Point3D(10, 20, 30);
		p3.info();
	}
}