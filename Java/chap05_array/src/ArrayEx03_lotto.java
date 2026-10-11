import java.util.Arrays;

/*
 * 로또 번호 생성하기
 * 1. 1 ~ 45사이의 값을 저장하는 배열 생성
 * 2. 배열의 값을 섞기
 * 3. 6개의 숫자를 다른 배열에 저장
 * 4. 선택된 6개의 숫자를 정렬(sort)하기
 */
public class ArrayEx03_lotto {
	public static void main(String[] args) {
		int[] balls = new int[45]; // [1 2 3 4 5 6 7 .... 45]
		// balls 배열에 1 ~ 45까지의 숫자로 초기화하기
		for (int i = 0; i < balls.length; i++) {
			balls[i] = i + 1;
		}
		// 배열의 값 섞기
		// [5 2 6 4 1 3 7 .... 45]
		for (int i = 0; i < 1000; i++) {
			int f = (int) (Math.random() * 45); // 0 ~ 44사이의 임의의 정수
			int t = (int) (Math.random() * 45); // 0 ~ 44사이의 임의의 정수
			// swap : 두개 값을 바꾸기
			int tmp = balls[f]; // 1
			balls[f] = balls[t];
			balls[t] = tmp;
		}
		// 6개의 숫자를 다른 배열에 저장
		int[] lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = balls[i]; // balls 배열의 요소중 0 ~ 5사이의 값
		}
		// Arrays.toString(lotto) : lotto 배열의 요소들을 문자열로 전달.
		System.out.println(Arrays.toString(lotto));
		// 정렬하기
		Arrays.sort(lotto); // 선택된 숫자 6개를 정렬하기. 숫자의 크기 순서로 변경
		System.out.println(Arrays.toString(lotto));
	}
}