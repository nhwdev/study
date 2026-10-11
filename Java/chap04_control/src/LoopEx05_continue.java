/*
 * continue : 반복문의 처음으로 제어 이동
 * break : 반복문 강제 종료
 */
public class LoopEx05_continue {
	public static void main(String[] args) {
		for (int i = 2; i <= 9; i++) {
			System.out.println("\n" + i + "단");
			for (int j = 2; j <= 9; j++) { // j: 6
//				if(j==5) continue;
				if (j == 5)
					break; // 반복문 강제 중단
				System.out.println(i + "x" + j + "=" + (i * j)); // 2x6=12
			}
		}
	}
}