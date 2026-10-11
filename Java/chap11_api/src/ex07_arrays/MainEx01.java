package ex07_arrays;

import java.util.Arrays;
import java.util.Comparator;

/*
 * Arrays 클래스 : 배열의 도움이 되는 기능을 가진 클래스
 * 	- 배열 비교,복사, 정렬,출력
 */
public class MainEx01 {
	public static void main(String[] args) {
		String[] arr1 = { "홍길동", "이몽룡", "성춘향", "향단이" };
		System.out.println(arr1);
		// 요소출력
		for (String s : arr1)
			System.out.print(s + ",");
		System.out.println();
		System.out.println(Arrays.toString(arr1));
		// arr1 요소를 김삿갓으로 저장하기
		Arrays.fill(arr1, "김삿갓");
		System.out.println(Arrays.toString(arr1));
		// arr1 1,2인덱스 요소를 홍길동으로 저장하기
		Arrays.fill(arr1, 1, 3, "홍길동");
		System.out.println(Arrays.toString(arr1));
		// arr1의 내용을 정렬하기. 오름차순정렬 : 작은것부터. 기본정렬
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		// arr1의 내용을 내림차순 정렬하기 :큰것 부터, 역순정렬
		Arrays.sort(arr1, Comparator.reverseOrder());
		System.out.println(Arrays.toString(arr1));
	}
}