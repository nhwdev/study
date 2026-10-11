package ex02_field;

public class Main1_Value {
	public static void main(String[] args) {
		System.out.println("자동차크기:" + Car.width + "," + Car.height);
//		System.out.println("자동차정보:" + Car.color + "," + Car.num);
		Car car1 = new Car();
		car1.color = "White";
		car1.num = 1234;
		System.out.println(car1.toString()); // car1.toString() 호출
		Car car2 = new Car();
		car2.color = "Black";
		car2.num = 3456;
		System.out.println(car2);
		car1.width = 80;
		car2.height = 50;
		System.out.println(car1);
		System.out.println(car2);
	}
}