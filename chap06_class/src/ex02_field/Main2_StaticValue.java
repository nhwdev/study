package ex02_field;

public class Main2_StaticValue {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.r = 10;
		c1.sno = ++Circle.cnt;
		System.out.println(c1);
		Circle c2 = new Circle();
		c2.r = 5;
		c2.sno = ++Circle.cnt;
		System.out.println(c2);
		System.out.println("생성된 원의 갯수:" + Circle.cnt);
	}
}