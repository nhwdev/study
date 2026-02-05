package ex06_this;

public class Car {
	String color;
	int number, serialNo;
	static int sno;

	Car(String color, int number) {
		System.out.println("1. Car(String,int) 생성자 호출");
		this.color = color;
		this.number = number;
		this.serialNo = ++sno;
	}

	Car() {
		this("White", 1000); // 다른 생성자 호출
		System.out.println("2. Car() 생성자 호출");
	}

	Car(String color) {
		this(color, 1000);
		System.out.println("3. Car(String) 생성자 호출");
	}

	Car(int number) {
		this("White", number);
		System.out.println("4. Car(int) 생성자 호출");
	}

	Car(Car c) {
		this(c.color, c.number);
		System.out.println("5. Car(Car) 생성자 호출");
	}

	public String toString() {
		return serialNo + "번자동차:" + color + "," + number;
	}
}