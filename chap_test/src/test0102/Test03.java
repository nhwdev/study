package test0102;
/*
 * 구동클래스가 실행 이 되도록 Hybrid 클래스 구현하기
 */

class Car {
	public void drive() {
		System.out.println("달린다.");
	}
}
class Ev extends Car {

	public void charge() {
		System.out.println("충전한다.");
	}
	
}
class Hybrid extends Car{
	
	public void charge() {
		System.out.println("충전한다.");
	}
	 
	public void addOil() {
		System.out.println("기름을 넣는다.");
	}

}

public class Test03 {
	public static void main(String[] args) {
		Hybrid car = new Hybrid();
		car.drive();   // 달린다.
		car.charge();  // 충전한다.
		car.addOil();  // 기름을 넣는다.
	}
}
