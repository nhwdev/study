package ex03_method;

public class MainEx01_Adder {
	public static void main(String[] args) {
		Adder a1 = new Adder();
		int i1 = a1.add1(10, 20);
		System.out.println(i1);
		long l1 = a1.add2(10, 30);
		System.out.println(l1);
//		int i2 = a1.add3(10,40); //오류발생. add3()메서드의 리턴타입이 void. 리턴값 없음
		a1.add3(10, 40);
	}
}