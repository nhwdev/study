/*
 * 배열의 선언, 생성, 초기화 하기
 */
public class ArrayEx02 {
	public static void main(String[] args) {
		// 배열의선언 + 생성 + 초기화
		int arr[] = { 10, 20, 30, 40, 50 };
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]=" + arr[i]);
		}
		// 개선된 for 문. forEach 구문이라고도함
		// 인덱스 사용불가.
		// 배열 요소 전체의 값을 조회가능
		for (int a : arr)
			System.out.println(a);
		// 생성 + 초기화
		arr = new int[] { 100, 200, 300 };
		for (int a : arr)
			System.out.println(a);
	}
}