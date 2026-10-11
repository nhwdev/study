package ex05_constructor;

/*
 * EastCard 구현하기
 * 멤버변수 
 *    int number
 *    boolean isKwang
 * 생성자 : 구동클래스에 맞도록 구현   
 * 멤버 메서드
 *    toString() : number +  isKwang==true "K"
 *                           isKwang==false ""
 */
class EastCard {
	int number;
	boolean isKwang;

	EastCard(int n, boolean k) {
		number = n;
		isKwang = k;
	}

	EastCard() {
		number = 1;
		isKwang = true;
	}

	public String toString() {
		return number + (isKwang ? "K" : "");
	}
}

public class Exam02 {
	public static void main(String[] args) {
		EastCard c1 = new EastCard(3, false);
		EastCard c2 = new EastCard();
		System.out.println(c1); // 3
		System.out.println(c2); // 1K
	}
}