package ex07_arrays;

import java.util.Arrays;
import java.util.Comparator; //인터페이스. 정렬관련

public class Exam01 {
	public static void main(String[] args) {
		Integer[] arr = { 1, 2, 3, 4, 5 };
		// 1. arr배열의 요소를 10으로 채우기
		Arrays.fill(arr, 10);
		System.out.println(Arrays.toString(arr));
		// 2. arr배열의 요소를 2,3번인덱스를 100으로 채우기
		Arrays.fill(arr, 2, 4, 100);
		System.out.println(Arrays.toString(arr));
		// 3. arr 배열을 정렬(sort)하기
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		// 4. arr 배열을 내림차순 정렬(sort)하기
		// Comparator.reverseOrder() : 요소의 자료형이 객체여야함.
		Arrays.sort(arr, Comparator.reverseOrder());
		System.out.println(Arrays.toString(arr));
	}
}