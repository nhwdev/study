package test1231;
/*
 * Test06.java의 Product를 배열 3개에 저장하여 전체 Product의 금액 합계를 출력하기
 */
public class Test07 {
	public static void main(String[] args) {
		Product[] arr = new Product[3];
		arr[0] = new Product("ssgnote9", "갤럭시노트9", "경기도 수원", 960000, 10.0);
		arr[1] = new Product("lgxnote5", "LG스마트폰5", "경기도 평택", 780000, 0.7);
		arr[2] = new Product("ktsnote3", "KT스마트폰3", "서울시 강남", 250000, 0.3);
		
		int sum = 0;
		
		for(int i=0; i<3; i++) {
			sum += arr[i].price;
			
		}
		System.out.println("전체 Product의 금액 합계: "+ sum);
	}
}
