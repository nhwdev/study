package ex01_object;

/*
 * [결과]
 * 다른 Number 객체임
 * 같은 숫자임
 */
class Number {
	int num;

	Number(int num) {
		this.num = num;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Number) {
			return num == ((Number) obj).num;
		} else
			return false;
	}
}

public class Exam01 {
	public static void main(String[] args) {
		Number n1 = new Number(100);
		Number n2 = new Number(100);
//		n2 = n1;
		if (n1 == n2)
			System.out.println("같은 Number 객체임");
		else
			System.out.println("다른 Number 객체임");
		if (n1.equals(n2))
			System.out.println("같은 숫자임");
		else
			System.out.println("다른 숫자임");
	}
}
