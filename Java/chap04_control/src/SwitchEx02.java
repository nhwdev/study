/*
 * 1 ~ 10사이의 임의의 수(난수)를 생성하여 1,2,3인경우 경품을 출력하고, 그외는 다음 기회에 를 출력하기
 */
public class SwitchEx02 {
	public static void main(String[] args) {
		int num = (int) (Math.random() * 10) + 1; // 1 ~ 10사이의 임의의 수
		/*
		 * 0.0 <= Math.random() < 1.0 0.0 <= Math.random() * 10 < 10.0 0 <=
		 * (int)(Math.random() * 10) < 10 1 <= (int)(Math.random() * 10) + 1 <= 10
		 */
		switch (num) {
		case 1:
			System.out.println("자전거 당첨");
			break;
		case 2:
			System.out.println("USB 당첨");
			break;
		case 3:
			System.out.println("마우스 당첨");
			break;
		default:
			System.out.println("다음 기회에 : " + num);
		}
		// if 조건문으로 변경하기
		if (num == 1)
			System.out.println("자전거 당첨");
		else if (num == 2)
			System.out.println("USB 당첨");
		else if (num == 3)
			System.out.println("마우스 당첨");
		else
			System.out.println("다음 기회에 : " + num);
	}
}