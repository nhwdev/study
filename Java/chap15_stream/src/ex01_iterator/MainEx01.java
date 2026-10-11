package ex01_iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/*
 * Stream 클래스 : 대용량 데이터 처리를 위한 클래스
 * 
 * Iterator : 외부 반복자
 *   boolean hasNext() 
 *   Object next() 
 *   void remove()
 *   
 * forEach() : 내부반복자  
 */
public class MainEx01 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("홍길동", "김삿갓", "이몽룡", "임꺽정");
		System.out.println("외부 반복자 이용");
		Iterator<String> it = list.iterator();
		while (it.hasNext())
			System.out.println(it.next());
		for (String s : list)
			System.out.println(s);

		System.out.println("내부 반복자 이용");
//		list.stream().forEach(s->System.out.println(s));
		Stream<String> st = list.stream();
		st.forEach(s -> System.out.println(s)); // 한번만 순회 가능
		System.out.println("한번더 출력");
//		st.forEach(s->System.out.println(s)); // 두번은 순회 불가능함
		list.stream().forEach(s -> System.out.println(s));
	}
}