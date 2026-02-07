package test1229;
/*
삼각형의 높이를 입력하세요
5							
15	14	13	12	11			
	10	9	8	7			
		6	5	4			
			3	2			
				1						
 */

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("삼각형의 높이를 입력하세요");
		int h = scan.nextInt();
		int[][] arr = new int[h][h];
		int sum=0;
		for(int i=h-1; i>=0; i--) {
			for(int j=h-1; j>=i; j--) {
				sum++;
				arr[i][j]=sum;
			}
		}
		for(int i=0; i<h; i++) {
			for(int j=0; j<h; j++) {
				if(arr[i][j]==0) {
					System.out.print("     ");
				}else
				System.out.printf("%5d",arr[i][j]);
			}System.out.println();
		}
	}
}
		
//		for(int i=h-1; i>=0; i--) {
//			for(int j=h-1; j>=0; j--) {
//				if(i <= j) {
//				   sum++;
//				   arr[i][j] = sum;
//				}
//			}
//		}
//		for(int i=0; i< h; i++) {
//			for(int j=0; j < h; j++) {
//				if (arr[i][j]==0) System.out.print("    ");
//				else System.out.printf("%4d",arr[i][j]);
//			}System.out.println();
//		}
//		
//	}
