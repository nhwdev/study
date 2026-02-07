package test1231;
/*
 * Product 클래스 구현하기
 *  멤버 변수 
  	String productId;   //상품아이디
	String productName; //상품명
	String productArea; //생산지
	int price;          //가격
	double tax;         //부가세 비율
	
	멤버 메서드
	  toString() : 결과에 맞도록 추가
 
 * 
 * [결과]
ssgnote9,갤럭시노트9,경기도 수원,960000,10.0
lgxnote5,LG스마트폰5,경기도 평택,780000,0.7
ktsnote3,KT스마트폰3,서울시 강남,250000,0.3
 */
class Product{
	  	String productId;   //상품아이디
		String productName; //상품명
		String productArea; //생산지
		int price;          //가격
		double tax;         //부가세 비율
		
		Product(String productId,String productName,String productArea,int price,double tax){
			this.productId=productId;
			this.productName=productName;
			this.productArea=productArea;
			this.price=price;
			this.tax=tax;
		}
		public String toString() {
			return productId+","+productName+","+productArea+","+price+","+tax;
		}
}
public class Test06 {

	public static void main(String[] args) {
		// 1. 매개변수 생성자를 이용하여 3개의 객체 생성 후 출력
		Product pro1 = new Product("ssgnote9", "갤럭시노트9", "경기도 수원", 960000, 10.0);
		Product pro2 = new Product("lgxnote5", "LG스마트폰5", "경기도 평택", 780000, 0.7);
		Product pro3 = new Product("ktsnote3", "KT스마트폰3", "서울시 강남", 250000, 0.3);

		System.out.println(pro1);
		System.out.println(pro2);
		System.out.println(pro3);
	}
}
