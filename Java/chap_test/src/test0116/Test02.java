package test0116;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Random;

/*
다음 결과가 나오도록 프로그램을 작성하시오
 1 ~ 1000번까지의 번호를 가지는 복권이 있다.
 1등 1장, 2등 2장, 3등 3장 을 추첨하는 프로그램 작성하기
  단 추첨은 3등부터 추첨하고, 당첨번호는 중복되면 안된다.
  추첨된 번호는 임의의 수이므로 숫자 값은 실행 할때 마다 다르다.

  LinkedHashSet : 순서유지, 중복불가
  Random
  new ArrayList(Set) : Set 객체를 List객체로 생성
  
  [결과]
3등 복권 추첨합니다.
369,355,699,
2등 복권 추첨합니다.
280,920,
1등 복권 추첨합니다.
839,
*** 복권 추첨 결과 ***
1등:839
2등:920,280,
3등:699,355,369,
===========
1등:[839]
2등:[280, 920]
3등:[355, 369, 699]
 */
public class Test02 {
	public static void main(String[] args) {
		Random r = new Random();
		LinkedHashSet<Integer> lotto = new LinkedHashSet<>();
		int cnt = 0;
		while (lotto.size() < 6) {
			if (lotto.size() == 0) {
				System.out.println("3등 복권 추첨합니다.");
			} else if (lotto.size() == 3) {
				System.out.println("\n2등 복권 추첨합니다.");
			} else if (lotto.size() == 5) {
				System.out.println("\n1등 복권 추첨합니다.");
			}
			int num = r.nextInt(999) + 1;
			if (lotto.add(num)) {
				System.out.print(num + ", ");
			}
		}
		System.out.println("\n*** 복권 추첨 결과 ***");
		ArrayList<Integer> lottoArr = new ArrayList<>(lotto.reversed());
		for (int i = 0; i < 3; i++) {
			System.out.print(i + 1 + "등:");
			for (int j = 0; j <= i; j++) {
				System.out.print(lottoArr.get(cnt++) + ", ");
			}
			System.out.println();
		}
		System.out.println("===========");
		System.out.println("1등:"+lottoArr.subList(0, 3));
		System.out.println("2등:"+lottoArr.subList(3, 5));
		System.out.println("3등:"+lottoArr.subList(5, 6));	
	}
}
