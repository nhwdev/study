package ex02_set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/*
 * Set 인터페이스
 *  - Collection 인터페이스의 하위인터페이스
 *  - 중복객체 저장 안함
 *  - 추가 메서드
 *    boolean add(Object) : 추가성공(true), 추가실패(false)
 *  - 인덱스로 조회 불가.
 *  - 개선된 for 구문 사용됨
 *  - 구현클래스
 *     HashSet : 중복불가. 순서모름
 *     TreeSet : 중복불가. 정렬됨   
 *     LinkedHashSet : 중복불가. 추가 순서 유지
 */
public class MainEx01_Set {
	public static void main(String[] args) {
		Object[] arr = { "홍길동", 1, "1", "김삿갓", "이몽룡", "홍길동", "성춘향", "향단이", "홍길동", "김삿갓" };
//		Set<Object> set1 = new HashSet<>();
		Set<Object> set1 = new LinkedHashSet<>();
		Set<Object> set2 = new HashSet<>();
		Set<Object> set3 = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			if (!set1.add(arr[i])) {
				if (!set2.add(arr[i])) {
					set3.add(arr[i]);
				}
			}
		}
		for (Object o : set1)
			System.out.print(o + ",");
		System.out.println();
//		System.out.println(set1.get(0)); //get 함수 없음
		System.out.println("set1:" + set1);
		System.out.println("set2:" + set2);
		System.out.println("set3:" + set3);
	}
}