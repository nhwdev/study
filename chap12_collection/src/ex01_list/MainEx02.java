package ex01_list;

import java.util.ArrayList;
import java.util.List;

/*
 * List 에서 사용하는 메서드
 */
public class MainEx02 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(); // 1 2 5 4 3 0 3
		list.add(1);
		list.add(2);
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(0);
		list.add(3);
		// subList : 1번인덱스부터 3번인덱스까지를 부분리스트로 리턴
		// 얕은 복사
		List<Integer> list2 = list.subList(1, 4); // 2 5 4
		System.out.println(list);
		System.out.println(list2);
		list2.add(100); // list2 에 100 추가
		System.out.println(list); // 1 2 5 4 100 3 0 3
		System.out.println(list2); // 2 5 4 100
		// 깊은 복사
		List<Integer> list3 = new ArrayList<>(list.subList(1, 4));
		System.out.println(list); // 1 2 5 4 100 3 0 3
		System.out.println(list3); // 2 5 4
		list3.add(200);
		System.out.println(list); // 1 2 5 4 100 3 0 3
		System.out.println(list3); // 2 5 4 200
		// 요소 제거
		// boolean remove(Object) : 객체를 제거
		// T remove(int) : 인덱스의 객체를 제거
		int i = 0;
		System.out.println(list.remove(i));// i번 인덱스의 객체 제거. 제거된 객체를 리턴
		System.out.println(list);
		Integer n = 0;
		System.out.println(list.remove(n)); // n객체를 제거. 제거여부를 boolean으로 리턴
		System.out.println(list);
	}
}