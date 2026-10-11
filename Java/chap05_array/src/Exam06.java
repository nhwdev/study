/*
 * 가변 배열 연습
 * [결과]
   46
   47  37
   48  38  26
   49  39  30  22
   50  40  31  23  16
   51  41  32  24  17  11
   52  42  33  25  18  12  7
   53  43  34  26  19  13  8 4 
   54  44  35  27  20  14  9 5 2
   55  45  36  28  21  15 10 6 3 1
   
   숫자   i   j
     1   9   9
     2   8   8
     3   9   8
     4   7   7
     5   8   7
     6   9   7
     7   6   6
     8   7   6
     9   8   6
    10   9   6
    11   5   5
    12   6   5
    13   7   5
    14   8   5
    15   9   5
    ...     
 */
public class Exam06 {
	public static void main(String[] args) {
		// 가변 배열 생성
		int[][] arr = new int[10][];
		// 각 행의 1차원 배열 객체 생성
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new int[i + 1];
		}
		// arr 배열에 숫자값 저장하기
		int num = 0;
		for (int j = 9; j >= 0; j--) {
			for (int i = j; i <= 9; i++) {
				arr[i][j] = ++num;
			}
		}
		// 배열 출력하기
		for (int[] ar : arr) {
			for (int a : ar) {
				System.out.printf("%3d", a);
			}
			System.out.println();
		}
	}
}