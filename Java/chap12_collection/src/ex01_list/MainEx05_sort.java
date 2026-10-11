package ex01_list;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * List 정렬하기
 * 1. 요소가 Comparable 인터페이스를 구현해야 함
 * 2. Comparable 인터페이스의 멤버는 compareTo(T t) 추상메서드가 존재
 * 3. compareTo(T t) 결과 
 *    음수 : 현재 객체가 t 객체 보다 앞
 *    양수 : 현재 객체가 t 객체 보다 뒤
 */
class Data implements Comparable<Data>{
	int value;
	Data(int value) {
		this.value = value;
	}
	public String toString() {
		return value + "";
	}
	@Override
	public int compareTo(Data d) {
		return value - d.value;
	}
}
public class MainEx05_sort {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("a","c","d","b","f");
		System.out.println(list1);
		Collections.sort(list1);
		System.out.println(list1);
		//list1 내림차순 정렬하기
		Collections.sort(list1,Comparator.reverseOrder());
		System.out.println(list1);
		List<Data> list2 = Arrays.asList(new Data(1),new Data(5),new Data(3),
				new Data(4),new Data(2));
		System.out.println(list2);//[1 5 3 4 2]
		/*
		 * Collections.sort(List<Comparable<Data>>) : 정렬가능
		 *      List 요소가 Comparable 객체인 경우만 정렬이 가능함
		 *      List 요소는 Comparable 인터페이스를 구현한 클래스의 객체만 가능함
		 *      => sort는 List의 요소 객체가 Comparable 인터페이스를 구현해야함
		 *      => sort는 Comparable 객체의 compareTo 메서드를 호출.
		 */
		Collections.sort(list2);
		System.out.println(list2);
		//list2 내림차순 정렬하기
		Collections.sort(list2,Comparator.reverseOrder());
		System.out.println(list2);
	}
}