package ex01_list;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * Comparator 인터페이스 
 * - 동적으로 정렬방식 설정시 사용
 * - FunctionalInterface 이므로 람다방식 사용가능
 * - 추상메서드 : compare(T t1, T t2)
 *     결과 : 양수 => t1이 뒤쪽
 *           음수 => t1이 앞쪽
 *  - Comparable 인터페이스 객체가 아니어도 정렬가능
 */
class Data2 {
	int value;

	Data2(int value) {
		this.value = value;
	}

	public String toString() {
		return value + "";
	}
}

public class MainEx06_Comparator {
	public static void main(String[] args) {
		List<Data2> list = Arrays.asList(new Data2(1), 
										 new Data2(5), 
										 new Data2(3), 
										 new Data2(4), 
										 new Data2(2));
		System.out.println(list);
		Comparator<Data2> c = new Comparator<>() {
			@Override
			public int compare(Data2 d1, Data2 d2) {
				return d1.value - d2.value;
			}
		};
		Collections.sort(list, c);
		System.out.println(list);
		// Comparator 인터페이스는 FunctionalInterface : 람다식으로 표현 가능함
		Collections.sort(list, (d1, d2) -> d1.value - d2.value);
		System.out.println(list);
		// 내림차순 정렬하기
		// Comparator.reverseOrder() : 요소가 Comparable 객체인 경우만 사용 가능함
//		Collections.sort(list,Comparator.reverseOrder());
		Collections.sort(list, (d1, d2) -> d2.value - d1.value);
		System.out.println(list);
	}
}