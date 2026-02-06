package ex02_set;

import java.util.Set;
import java.util.TreeSet;

/*
 * Lotto 번호 생성하기
 * 1. 1 ~ 45사이의 임의의 값 중복되지 않게 6개 선택
 * 2. 정렬하기
 * => TreeSet 이용하기
 * 
 * 1. TreeSet 객체 생성. 요소의 자료형 Integer
 * 2. 난수 생성 : Random 클래스, Math.random() . 1 ~ 45사이의 임의의 값 선택
 *    set.add(난수) 
 *    set.size() < 6 인 동안 2번반복. set.size() 6이되면 반복 종료
 * 3. treeset 객체 출력.    
 */
public class Exam02_TreeSet {
	public static void main(String[] args) {
		Set<Integer> lotto = new TreeSet<>();
		/*
		 * Random rand = new Random(); 
		 * while (lotto.size() < 6) { 
		 * 		int num = rand.nextInt(45) + 1; // 1~ 45 lotto.add(num); 
		 * }
		 */
		while (lotto.size() < 6) {
			int num = (int) (Math.random() * 45) + 1;
			lotto.add(num);
		}
		System.out.println(lotto);
	}
}