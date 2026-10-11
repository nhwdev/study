package ex08_final;

import java.util.Arrays;

public class MainEx02_FinalValue {
	public static void main(String[] args) {
		final int[] arr = { 10, 20, 30, 40, 50 }; // arr 참조변수가 상수임
		System.out.println(Arrays.toString(arr));
		arr[0] = 100; // 변경 가능함
		arr[1] = 200;
		System.out.println(Arrays.toString(arr));
//		arr = new int[] {100,200,300}; // arr 변수가 상수임.
	}
}
