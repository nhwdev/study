package ex05_constructor;

public class MainEx02_Car {
	public static void main(String[] args) {
		Car c1 = new Car("Blue", 5678);
		Car c2 = new Car("Red");
		Car c3 = new Car(3456);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}
}