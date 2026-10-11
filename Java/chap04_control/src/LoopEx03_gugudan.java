public class LoopEx03_gugudan {
	public static void main(String[] args) {
		for (int i = 2; i <= 9; i++) { // i : 10
			System.out.println("\n" + i + "단"); // 9단
			for (int j = 2; j <= 9; j++) { // j : 10
				System.out.println(i + "x" + j + "=" + (i * j)); // 9x9=81
			} // j 반복문의 끝
		} // i 반복문의 끝
	} // main 함수 종료. 프로그램 종료
}