package ex04_overloading;

public class Adder2 {
	int add(int a, int b) {
		System.out.print("1:");
		return a + b;
	}

	long add(long a, int b) {
		System.out.print("2:");
		return a + b;
	}

	long add(int a, long b) {
		System.out.print("3:");
		return a + b;
	}

	long add(long a, long b) {
		System.out.print("4:");
		return a + b;
	}
}