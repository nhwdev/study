package ex01_list;

import java.util.Arrays;
import java.util.List;

/*
 * Arrays 클래스를 활용한 초기화
 */
public class MainEx04 {
	public static void main(String[] args) {
		/*
		 * List<Integer> java.util.Arrays.asList(Integer... a) 가변 매개변수 : Integer... a :
		 * Integer 객체 한개이상 (1),(1,2),(1,2,3) ...
		 */
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println(list1);

		// 봄,여름,가을,겨울 list2에 저장하고, 출력하기
		List<String> list2 = Arrays.asList("봄", "여름", "가을", "겨울");
		System.out.println(list2);

		// 0.1, 0.2, 0.3 list3에 저장하고, 출력하기
		List<Double> list3 = Arrays.asList(0.1, 0.2, 0.3);
		System.out.println(list3);
	}
}