/* 
 * 다차원 배열 : 2차원 이상의 배열
 *            배열의 배열로 선언.
 *            n 차원 배열은 n-1차원 배열의 배열임
 *            
 * 2차원 배열 : 1차원 배열의 참조변수의 배열임
 */
public class ArrayEx05_two_dim {
	public static void main(String[] args) {
		int[] arr[] = new int[3][2];
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[1][0] = 30;
		arr[1][1] = 40;
		arr[2][0] = 50;
		arr[2][1] = 60;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("arr[" + i + "][" + j + "]=" + arr[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("1차원 배열 객체 변경하기");
		int[] arr1 = { 1, 2, 3, 4, 5 };
		arr[1] = arr1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("arr[" + i + "][" + j + "]=" + arr[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("arr[2] = {100,200,300} 배열로 변경하기");
		arr[2] = new int[] { 100, 200, 300 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("arr[" + i + "][" + j + "]=" + arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}