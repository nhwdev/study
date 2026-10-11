package ex05_iterator;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;

/*
 * Iterator 인터페이스 : 반복자
 * Collection.iterator() : Collection 객체를 Iterator 객체로 변환 기능
 * 
 * Iterator 인터페이스
 *   - boolean hasNext() : 조회할 요소 존재?  있으면 true, 없으면 false
 *   - Object next()  : 조회 대상 요소 리턴
 *   - void remove()  : 조회된 객체 제거. next() 실행 후 실행 가능
 *   
 * Enumeration 인터페이스 : 반복자. Iterator 이전에 사용하던 반복자.
 *                          Vector, HashTable 에서만 사용가능  
 *    - hasMoreElements() : boolean. 조회할 요소 존재 여부
 *    - nextElement() : 조회 대상 요소 리턴.                    
 */
public class MainEx01 {
	public static void main(String[] args) {
		Iterator<Object> it = null;
		List<Object> list = new ArrayList<>();
		Set<Object> set = new HashSet<>();
		for (int i = 1; i <= 5; i++) {
			list.add(i + 10);
			set.add(i * 10);
		}
		System.out.println("print() 이전의 list => " + list); // 11 12 13 14 15
		System.out.println("print() 이전의 set => " + set); // 10 20 30 40 50
		it = list.iterator(); // list 객체를 Iterator 형식의 객체로 변형
		print(it);
		it = set.iterator(); // set 객체를 Iterator 형식의 객체로 변형
		print(it);
		System.out.println("print() 이후의 list => " + list);
		System.out.println("print() 이후의 set => " + set);

		// ===============================================
		Vector<Object> vec = new Vector<>();
//		List<Object> vec = new Vector<>();
		vec.add("사과");
		vec.add("바나나");
		vec.add("체리");
		vec.addElement("망고"); // Vector 구버전의 멤버. List 타입의 멤버가 아님
		it = vec.iterator();
		print(it);
		Enumeration<Object> e = vec.elements(); // List 타입의 멤버가 아님
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

	private static void print(Iterator<Object> it) { //
		System.out.println("print() 함수에서 요소 출력");
		while (it.hasNext()) { // boolean. 조회할 요소 존재 여부
			System.out.print(it.next() + ","); // 11,12,13,14,15,
//			it.remove(); //객체 제거. next() 호출 이후에 가능. next()된 객체를 제거
		}
		System.out.println();
	}
}