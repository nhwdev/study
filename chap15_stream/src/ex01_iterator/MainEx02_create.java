package ex01_iterator;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 * 배열 객체를 이용하여 Stream 객체 생성하기
 */
public class MainEx02_create {
	public static void main(String[] args) {
		String[] arr = new String[] { "a", "b", "c" };
		Stream<String> stream1 = Arrays.stream(arr);
		stream1.forEach(s -> System.out.print(s + "\t"));
		System.out.println();

		int[] intArr = { 1, 2, 3, 4, 5 };
		System.out.println();
		System.out.println("Arrays.stream 메서드를 이용하여 IntStream 생성");
		// IntStream : int 형 Stream. 요소의 자료형이 기본형 int 형
		IntStream intSt1 = Arrays.stream(intArr); // int[] 배열을 IntStream으로 생성
		intSt1.forEach(s -> System.out.print(s + ","));
		System.out.println();

		System.out.println("IntStream.of 메서드를 이용하여 IntStream 생성");
		intSt1 = IntStream.of(intArr);// int[] 배열을 IntStream으로 생성
		intSt1.forEach(s -> System.out.print(s + ","));
		System.out.println();

		System.out.println("IntStream.range 메서드를 이용하여 IntStream 생성");
		intSt1 = IntStream.range(1, 6); // 1 ~ (6 - 1) 까지의 숫자를 IntStream으로 생성
		intSt1.forEach(s -> System.out.print(s + ","));
		System.out.println();

		System.out.println("IntStream.rangeClosed 메서드를 이용하여 IntStream 생성");
		intSt1 = IntStream.rangeClosed(1, 5); // 1 ~ 5 까지의 숫자를 IntStream으로 생성
		intSt1.forEach(s -> System.out.print(s + ","));
		System.out.println();

		System.out.println("1 ~ 100까지의 숫자를 IntStream으로 생성하기");
		intSt1 = IntStream.range(1, 101);
		intSt1.forEach(s -> System.out.print(s + ","));
		System.out.println();
		intSt1 = IntStream.rangeClosed(1, 100);
		System.out.println("1 ~ 100까지의 합:" + intSt1.sum());
	}
}