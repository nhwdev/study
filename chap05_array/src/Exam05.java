/*
 * 2차원 배열 arr의 행의 합을 출력하기
 * [결과]
 * 10+20+30 = 60
 * 15+25+35 = 75
 * 100+150+200 = 450
 * 
 * 2차원 배열 arr의 열의 합을 출력하기
 */
public class Exam05 {
	public static void main(String[] args) {
		int[][] arr = { { 10, 20, 30 },
						{ 15, 25, 35 },
						{ 100, 150, 200 },
						{ 1, 2, 3, 4, 5 } };
		for (int i = 0; i < arr.length; i++) {
			int sum = 0; // 행별 합계 초기화
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
				System.out.print(arr[i][j] + ((j == arr[i].length - 1) ? "=" : "+"));
			}
			System.out.println(sum);
		}
	}
}