package ex04_overloading;

public class MainEx01 {
	public static void main(String[] args) {
		Adder a = new Adder();
		System.out.println(a.add(10));
		System.out.println(a.add(10.5));
		System.out.println(a.add("번"));
		System.out.println(a.add(20L)); // 자동형변환 가능한 메서드 호출
	}
}