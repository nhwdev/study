package ex01_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * Collection 인터페이스 : 여러개의 객체를 저장할 수 있는 기능. 
 *   - List 인터페이스 : Collection 인터페이스를 상속받은 하위 인터페이스
 *                     요소를 추가한 순서유지. 중복가능
 *                     인덱스(첨자) 사용할 수 있음 : list.get(인덱스)
 *                     가변배열 객체라고 함.
 *               구현클래스 : ArrayList : List 의 대표 클래스 
 *                         Vector    : Collection 프레임워크 이전에 사용된 클래스  
 *                         LinkedList: Queue 인터페이스도 구현함.  
 *  - Set 인터페이스 
 */
public class MainEx01 {
	public static void main(String[] args) {
		/*
		 * <Integer> : 제네릭 표현. 요소의 자료형 미리 설정
		 *             list 객체는 Integer 객체를 여러개 가지고 있는 List 객체
		 *             Integer 객체가 아닌 다른자료형(String)은 추가하면 컴파일 오류가 발생
		 * <Object>로 제네릭을 표현하면 모든 객체를 추가 가능함
		 * 제네릭을 표현하지 않는 경우
		 *   - 기본적을 Object로 판단. warning 발생. 이클립스에서는 노란줄로 표시
		 *   
		 * Collection 프레임워크에서는 객체만 저장가능.
		 *  기본자료형은 자동으로 Wrapper 클래스로 저장됨.
		 */
		List<Integer> list = new ArrayList<Integer>(); // ArrayList는 List 인터페이스의 구현클래스
		list.add(1); //Integer 객체로 auto Boxing됨
		list.add(2);		list.add(5);		list.add(4);
		list.add(3);		list.add(0);
		// list.add("10"); //list 객체는 Integer 객체만 저장  
		System.out.println(list);
		// List 객체. 인덱스 사용 가능
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		// 개선된 for구문 (forEach)
		System.out.println("개선된 for구문으로 출력");
		for(Integer a : list) {
			System.out.println(a);
		}
		// 정렬하기
		/*
		 * Collection : 인터페이스. List,Set 인터페이스의 상위 인터페이스
		 * Collections: 클래스. Collection 객체의 보조 기능 담당. 정렬, 섞기 ,....
		 * 
		 * Collections.sort(List) : List 객체만 정렬 가능
		 */
		Collections.sort(list); // 오름차순 정렬
		System.out.println(list);
		Collections.sort(list,Collections.reverseOrder()); // 내림차순 정렬
		System.out.println(list);
		// 요소를 섞기
		Collections.shuffle(list);
		System.out.println(list);
		// 내림차순 정렬하기
		Collections.sort(list,Comparator.reverseOrder()); // 내림차순 정렬
		System.out.println(list);
	}
}