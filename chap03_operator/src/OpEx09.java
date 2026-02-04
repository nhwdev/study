

/*
 * 연산의 결과는 큰자료형을 따른다.
 * int = int + int
 * float = float + int
 * long = long + int
 * 
 * int형보다 작은자료형(byte,short,char)의 연산의 결과는 int임
 */
public class OpEx09 {
	public static void main(String[] args) {
		byte b1 = 10;
		short s1 = 20;
		short s2 = (short) (b1 + s1); // int형보다 작은자료형(byte,short,char)의 연산의 결과는 int임

		char c1 = 'A';
		System.out.println("c1=" + c1); // c1=A
		System.out.println("c1=" + ++c1); // c1=B
		c1 += 1;
		System.out.println("c1=" + c1); // c1=C
		c1 = (char) (c1 + 1);
		System.out.println("c1=" + c1); // c1=D
	}
}