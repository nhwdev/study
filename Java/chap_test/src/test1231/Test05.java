package test1231;
/*
 Test2.java의 Coin 클래스를 이용하기 
 두개의 Coin 객체를 생성하기 myCoin, youCoin 객체 생성하기
 앞면이 연속해서 3번 나오면 승리가 출력되도록 구동 클래스 구현하기   

 [결과예시] => 결과는 다를 수 있습니다.
 myCoin	youCoin
  앞면	뒷면
  뒷면	앞면
  앞면	앞면
  앞면	앞면
 youCoin 승리
 */
public class Test05 {
	public static void main(String[] args) {
		int flip = (int)(Math.random() * 2);
		boolean isResult=true;
		int frontX=0;
		int backX=0;
		int frontY=0;
		int backY=0;
		Coin myCoin = new Coin(flip);
		Coin youCoin = new Coin(flip);
		
		System.out.println("myCoin\tyouCoin");
		while(isResult) {
			myCoin.flip();
			youCoin.flip();
			
			if(myCoin.toString().equals("앞면")) {
				frontX++;
				backX=0;
			}else if(myCoin.toString().equals("뒷면")) {
				backX++;
				frontX=0;
			}
			if(youCoin.toString().equals("앞면")) {
				frontY++;
				backY=0;
			}else if(youCoin.toString().equals("뒷면")) {
				backY++;
				frontY=0;
			}
			if(frontX==3 || backX==3 || frontY==3 || backY==3) {
				isResult=false;
			}
			System.out.println(myCoin+"\t"+youCoin);
			
		}
	}
}
			
