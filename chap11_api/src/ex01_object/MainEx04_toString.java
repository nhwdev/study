package ex01_object;

/*
 *  toString 메서드
 *  1. 객체를 문자열로 표현하는 기능
 *  2. 참조변수를 표준출력시 자동으로  toString 메서드를 호출
 *  3. Object 구현 : 클래스명@16진수해시코드값 
 *  4. 각 클래스별로 내용을 문자열로 표현하기 위해서는 오버라이딩 필요
 */
class ToString {
	int value;

	ToString(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "ToString [value=" + value + "]";
	}
}

public class MainEx04_toString {
	public static void main(String[] args) {
		ToString to1 = new ToString(10);
		ToString to2 = new ToString(10);
		System.out.println(to1);
		System.out.println(to2);
	}
}