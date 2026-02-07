package test0109;

import java.util.Random;

/*
 * true/false 값을 난수로 발생하여 시스템과 사용자 중3번 연속 true가 나오는 한쪽이 승리
 * 하는 프로그램 구현하기
 * [결과]
 * 시스템:true, 사용자:true
 * 시스템:true, 사용자:false
 * 시스템:false, 사용자:true
 * 시스템:true, 사용자:true
 * 시스템:true, 사용자:true
 * 사용자승리
 */

public class Test08 {
	public static void main(String[] args) {
		Random r = new Random();
		int user, system;
		int ucnt = 0, scnt = 0;

		
		while (true) {
			user = r.nextInt(2);
			system = r.nextInt(2);
			// 0일때 true 1일때 false , 0이 3번 연속으로나오면 승리
			if (system == 0) {
				System.out.print("시스템: true, ");
				scnt++;
			} else {
				System.out.print("시스템: false, ");
				scnt = 0;
			}
			if (user == 0) {
				System.out.print("사용자: true");
				ucnt++;
			} else {
				System.out.print("사용자: false");
				ucnt = 0;
			}
			System.out.println();
			if(ucnt==3||scnt==3) break;
		}
		System.out.println(scnt == ucnt ? "비김" : scnt==3? "시스템 승리":"사용자 승리");
	}
}