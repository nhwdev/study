package ex03_map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/*
 * map : 스트림의 요소를 이용하여 다른 요소로 변경할 수 있는 함수
 *       mapXXX 형식의 메서드
 *       mapToInt : IntStream 형<- Stream 형
 *  주요메서드      
 *  Stream<T>  map() : Stream 형 <- Stream 형
 *  Stream<T>  mapToObj() : Stream 형 <- IntStream/DoubleStream/LongStream 형
 *  
 *  IntStream mapToInt() : IntStream 형<- Stream 형
 *  IntStream map() : IntStream 형<- IntStream 형
 *  LongStream mapToLong() : LongStream 형<- Stream 형
 *  DoubleStream mapToDouble() : DoubleStream 형<- Stream 형
 */
public class MainEx01 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("홍길동전", "김삿갓", "구운몽", "전우치전", "사씨남정기");
		// 글자의길이를 IntStream으로 생성하기
//		IntStream isr = list.stream().mapToInt(s->s.length());
		IntStream isr = list.stream().mapToInt(String::length); // 메서드참조
//		isr.forEach(i->System.out.print(i+","));
		isr.forEach(System.out::print); // isr 스트림의 요소를 System.out.print() 함수로 출력
		System.out.println();
		System.out.println("전체문자열의크기:" + list.stream().mapToInt(s -> s.length()).sum());
	}
}