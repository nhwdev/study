package ex02_filter;

import java.util.Arrays;
import java.util.List;

/*
 * distinct() : 요소의 중복제거. 
 * filter(boolean result) : result 가 true 인 요소만 가능
 */
public class MainEx01 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("홍길동", "김삿갓", "홍길동", "임꺽정", "홍길동");
		list.stream().forEach(s -> System.out.println(s)); // "홍길동","김삿갓","홍길동","임꺽정","홍길동"
		System.out.println("중복제거하여 출력하기");
		list.stream().distinct().forEach(s -> System.out.println(s)); // 홍길동,김삿갓,임꺽정
		
		System.out.println("홍으로 시작하는 문자열만 출력하기");
		list.stream().filter(n -> n.startsWith("홍"))
					 .forEach(s -> System.out.println(s)); // 홍길동,홍길동,홍길동

		System.out.println("홍으로 시작하는 문자열만 중복 없이 출력하기");
		list.stream().distinct() // 홍길동,김삿갓,임꺽정
				     .filter(n -> n.startsWith("홍"))
				     .forEach(s -> System.out.println(s)); // 홍길동
		list.stream().filter(n -> n.startsWith("홍")) // 홍길동,홍길동,홍길동
				     .distinct() // 홍길동
				     .forEach(s -> System.out.println(s)); // 홍길동
	}
}