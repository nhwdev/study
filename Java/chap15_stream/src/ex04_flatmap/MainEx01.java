package ex04_flatmap;

import java.util.Arrays;
import java.util.List;

/*
 * flatMap 함수 : 새로운 형태의 스트림으로 생성
 * 주요 메서드
 * Stream<R> flatMap(T) : Stream/IntStream <= Stream/IntStream 
 * IntStream flatMapToInt(T) : IntStream <= Stream 
 */
public class MainEx01 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("자바 8 버전에", "추가된 스트림을", "열심히 공부합니다.");
		System.out.println("list 요소의 갯수:" + list.stream().count());
		list.stream() // list의 요소들을 스트림으로 생성
		   /*
		 	* data->Arrays.stream(data.split(" "))
		 	* data : list요소 중 한개. => 자바 8 버전에
		 	* Arrays.stream(배열) : 배열의 요소를 스트림 생성
		 	* 배열 : {"자바","8","버전에"}
		 	*       {"추가된","스트림을"}
		 	*       {"열심히","공부합니다."}
		 	*/
			.flatMap(data -> Arrays.stream(data.split(" "))) // Stream<String> <- Stream<String>
			.forEach(word -> System.out.println(word));
	}
}