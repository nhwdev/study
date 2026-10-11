package ex02_set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/*
 * TreeSet에 사용자정의 객체 추가하기
 *  1. Comparable 인터페이스의 구현클래스의 객체가 아닌경우
 *    - new TreeSet<>() 형식인 경우 ClassCastException 예외 발생. 
 *      TreeSet 에 객체 추가시 Comparable 인터페이스의 객체여야함
 *    - new TreeSet<>(Comparator) 형식을 가능함
 *  2. Comparable 인터페이스의 구현클래스의 객체인 경우  
 *    - new TreeSet<>() 형식으로 생성가능 => 기본정렬방식대로 정렬됨.
 *    - new TreeSet<>(Comparator) 형식 생성가능 => 기본정렬방식 이외의 정렬 방식으로 정렬을 설정가능함. 
 *    
 * 정렬 기준 설정 관련 인터페이스
 *  - Comparable : int compareTo(T o)
 *  - Comparator : int compare(T o1, T o2)  
 *  
 *  결과 
 *   음수 : 현재객체(o1객체) 가 앞쪽 위치. o객체/o2객체 가 뒤쪽 위치.
 *   양수 : 현재객체(o1객체) 가 뒤쪽 위치. o객체/o2객체 가 앞쪽 위치.
 *  
 */
class Data implements Comparable<Data> {
	int value;

	Data(int value) {
		this.value = value;
	}

	public String toString() {
		return value + "";
	}

	@Override
	public int compareTo(Data d) { // value 값을 기준으로 정렬
		return value - d.value;
	}
}

class Data2 {
	int value;

	Data2(int value) {
		this.value = value;
	}

	public String toString() {
		return value + "";
	}
}

public class MainEx04_TreeSet {
	public static void main(String[] args) {
		Set<Data> set = new TreeSet<>();
		set.add(new Data(5)); // Comparable 객체만 추가 가능함
		set.add(new Data(4));
		set.add(new Data(1));
		set.add(new Data(3));
		set.add(new Data(2));
		System.out.println(set);
		Set<Data2> set2 = new TreeSet<>((d1, d2) -> d1.value - d2.value);
		set2.add(new Data2(5));
		set2.add(new Data2(4));
		set2.add(new Data2(1));
		set2.add(new Data2(3));
		set2.add(new Data2(2));
		System.out.println(set2);
		// set3 객체는 내림차순정렬 객체로 생성하기
		Set<Data> set3 = new TreeSet<>(Comparator.reverseOrder());
		set3.add(new Data(5)); // Comparable 객체만 추가 가능함
		set3.add(new Data(4));
		set3.add(new Data(1));
		set3.add(new Data(3));
		set3.add(new Data(2));
		System.out.println(set3);
		// set4:Data2객체를 내림차순정렬하기
		Set<Data2> set4 = new TreeSet<>((d1, d2) -> d2.value - d1.value);
		set4.add(new Data2(5));
		set4.add(new Data2(4));
		set4.add(new Data2(1));
		set4.add(new Data2(3));
		set4.add(new Data2(2));
		System.out.println(set4);
	}
}