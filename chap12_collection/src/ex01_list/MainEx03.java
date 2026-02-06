package ex01_list;

import java.util.ArrayList;
import java.util.List;

public class MainEx03 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		// add : 요소추가
		list.add("봄"); // 마지막에 요소가 추가됨
		list.add("여름");
		list.add("가을");
		list.add("겨울");
		System.out.println(list);

		list.add(0, "이른봄"); // 0번인덱스 요소 추가
		System.out.println(list);
		// 가을, 겨울사이에 늦가을 추가하기
		list.add(4, "늦가을");
		System.out.println(list);

		// 수정
		// 늦가을을 late autumn 변경하기
		list.set(4, "late-autumn");
		System.out.println(list);

		// 제거
		// 1.4번인덱스의 요소를 제거하고 출력하기
		System.out.println(list.remove(4));
		System.out.println(list);

		// 2.이른봄 요소를 제거하기
		list.remove("이른봄");
		System.out.println(list);

		// 3.없는 요소를 제거하기
		list.remove("홍길동"); // 객체가 없는 경우. false 리턴.
		System.out.println(list);

		list.remove(list.size()); // 인덱스 설정 오류. IndexOutOfBoundsException 예외 발생
		System.out.println(list);
	}
}