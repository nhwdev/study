package ex05_constructor;

//생성자 오버로딩 
public class Car {
	String color;
	int number;
	static int width = 200;
	static int height = 120;

	Car(String c, int n) {
		color = c;
		number = n;
	}

	Car(String c) {
		color = c;
		number = 1234;
	}

	Car(int n) {
		color = "White";
		number = n;
	}

	public String toString() {
		return color + "," + number + "(" + width + "," + height + ")";
	}
}