import java.util.Arrays;

/*
 *  생성된 배열의 크기 변경 불가
 *  새로운 배열 객체를 생성하여 배열의 요소 값을 복사
 *  1. for 구문을 이용한 복사
 *  2. System.arraycopy 함수 이용한 복사
 *  3. Arrays.copyOf 함수 이용 복사
 */
public class ArrayEx08_arraycopy {
	public static void main(String[] args) {
		int[] arr1 = { 10, 20, 30 };
		System.out.println
		("arr1 배열 보다 크기가 1더 큰 배열  arr2에 arr1의 요소를 저장하고 마지막 요소에 합계 저장하기");
		int[] arr2 = new int[arr1.length + 1];
		// 1. for 구문으로 배열의 값을 복사. 합계 저장
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
			arr2[arr1.length] += arr1[i];
		}
		System.out.println(Arrays.toString(arr2));
		System.out.println
		("요소의 갯수가 10개인 arr3에 arr1의 요소를 2번 인덱스부터 3개를 저장하기");
		// 2. System.arraycopy() 함수 사용하기
		// arraycopy(원본배열, 원본배열의시작인덱스,복사배열,복사위치인덱스,요소의갯수)
		int[] arr3 = new int[10]; // [10 20 30 0 0 0 0 0 0 0]
		System.arraycopy(arr1, 0, arr3, 2, arr1.length);
		System.out.println(Arrays.toString(arr3));
		// 3. Arrays.copyOf 함수 사용하기
		// copyOf(원본배열, 갯수)
		int[] arr4 = Arrays.copyOf(arr3, 5);
		System.out.println(Arrays.toString(arr4));
		arr3[4] = 500;
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		int[] arr5 = arr3; // 얕은복사
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr5));
		arr3[5] = 600;
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr5));
	}
}