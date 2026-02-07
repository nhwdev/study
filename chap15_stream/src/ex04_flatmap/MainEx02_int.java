package ex04_flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;

// flatMapToInt() 예제

public class MainEx02_int {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("10,20,30", "40,50,60");
		// 숫자들의 갯수,합,평균 출력하기

//		IntStream isr = list.stream().flatMapToInt(data->{
//			String[] strArr = data.split(",");
//			int[] intArr = new int[strArr.length];
//			for(int i=0;i<strArr.length;i++) {
//				intArr[i] = Integer.parseInt(strArr[i].trim());
//			}
//			return Arrays.stream(intArr);
//		});

		// 스트림에서 사용되는 Functional Interface
		// Function 인터페이스의 추상메서드 : 매개변수,리턴타입 모두 존재.
		Function<String, IntStream> f = data -> {
			String[] strArr = data.split(",");
			int[] intArr = new int[strArr.length];
			for (int i = 0; i < strArr.length; i++) {
				intArr[i] = Integer.parseInt(strArr[i].trim());
			}
			return Arrays.stream(intArr);
		};

		System.out.println("숫자들의 갯수:" + list.stream().flatMapToInt(f).count());
		System.out.println("숫자들의 합:" + list.stream().flatMapToInt(f).sum());
		System.out.println("숫자들의 평균:" + list.stream().flatMapToInt(f).average().getAsDouble());
	}
}