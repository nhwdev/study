/*
 * arr 배열의 열의 합 구하기
 */
public class ArrayEx06_two_dim {
	public static void main(String[] args) {
		int[][] arr = {
				{10,20,30},	{15,25,35},
				{100,150,200},{1,2,3,4,5}
		};
		//열의 최대 갯수만큼 1차원 배열 설정
		int max = 0;
		for(int i=0;i<arr.length;i++) {
			if(max < arr[i].length) max = arr[i].length;
		}
		//   0   1    2   3  4 
		// [126, 197, 268, 4, 5]
		int colSum[] = new int[max]; //정수형 값을 max개 저장할 수 있는 배열 생성
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				colSum[j] += arr[i][j]; //arr[3][4]
			}
		}
		for(int i=0;i<colSum.length;i++) {
			System.out.println(i+"열의 합:" + colSum[i]);
		}
	}
}