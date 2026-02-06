package ex04_polymorphism;

/*
 * Product 클래스 구현하기
 * 멤버변수 : price(가격),point(포인트)
 * 생성자 : 가격을 입력받고, 가격의 10%를 포인트로 저장
 */
class Product {
	int price, point;

	Product(int price) {
		this.price = price;
		this.point = price / 10;
	}
}

/*
 * Product 의 하위 클래스 Tv, Computer, HandPhone 
 * 클래스 구현하기 Tv 클래스 : 가격이 100,  toString() : TV 리턴 
 *           Computer 클래스 : 가격이 200,  toString() : Computer 리턴 HandPhone
 * 클래스 : 가격이 150, toString() : HandPhone 리턴
 */
class Tv extends Product {
	Tv() {
		super(100);
	}

	public String toString() {
		return "TV";
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}

	public String toString() {
		return "Computer";
	}
}

class HandPhone extends Product {
	HandPhone() {
		super(150);
	}

	public String toString() {
		return "HandPhone";
	}
}

/*
 * Buyer 클래스 구현하기 
 * 멤버변수 : money=500, point
 * 			  Product[] items = new Product[5]; 
 *            cnt // 구매 Product 갯수
 * 멤버메서드 
 * 	void buy(Product p) 
 * 		1. p 상품의 가격을 money에서 차감 
 * 		2. p 상품의 포인트를 point 증가
 * 		3. items에 p 추가. cnt값을 증가 
 * 		4. p 제품 이름 출력 : TV 구입 ... 
 * 	void summary() 
 * 		1. 구매제품 전체 금액 합계, 포인트 출력 
 * 		2. 잔액 출력하기 
 * 		3. 전체 구매 물품의 이름 출력하기
 */
class Buyer {
	int money = 500, point, cnt;
	Product[] items = new Product[5]; // 배열에서 다형성 이용.
		
	// 매개변수에 다형성을 사용
	void buy(Product p) { // p 참조변수가 참조가능한 클래스 : Tv, Computer, HandPhone, Product
		money -= p.price;
		point += p.point;
		items[cnt++] = p;
		System.out.println(p + " 구입");
	}

	void summary() {
		int totPrice = 0, totPoint = 0;
		String itemName = "";
		for (int i = 0; i < cnt; i++) {
			totPrice += items[i].price;
			totPoint += items[i].point;
			itemName += items[i] + ",";
		}
		System.out.println("구매물품합계금액:" + totPrice);
		System.out.println("구매물품포인트합계:" + totPoint);
		System.out.println("구매물품포인트합계:" + point);
		System.out.println("잔액:" + money);
		System.out.println("구매물품이름:" + itemName);
	}
}

public class Exam01 {
	public static void main(String[] args) {
		Tv t = new Tv();
		Computer c = new Computer();
		HandPhone h = new HandPhone();
		Buyer b = new Buyer();
		b.buy(t); // TV 구입
		b.buy(c); // Computer 구입
		b.buy(h); // HandPhone 구입
		b.summary();
	}
}