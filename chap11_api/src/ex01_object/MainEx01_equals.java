package ex01_object;

/*
 * equals() 
 *  - Object 클래스의 멤버 메서드
 *  - 내용 비교를 위한 기능 => 오버라이딩 필요
 */
class Equal {
	int value;

	Equal(int value) {
		this.value = value;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Equal) {
			Equal e = (Equal) obj;
			return this.value == e.value;
		} else
			return false;
	}
}

public class MainEx01_equals {
	public static void main(String[] args) {
		Equal e1 = new Equal(10);
		Equal e2 = new Equal(10);
		if (e1 == e2)
			System.out.println("e1과 e2는 같은 객체임");
		else
			System.out.println("e1과 e2는 다른 객체임");
		if (e1.equals(e2))
			System.out.println("e1과 e2 객체의 내용은 같음");
		else
			System.out.println("e1과 e2 객체의 내용은 다름");
	}
}