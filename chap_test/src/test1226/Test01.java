package test1226;
/*
 * 가로 구구단 출력하기
 *  2단       3단        9단
 * 2*2=4    3*2=6  ...  9*2=18
 * 2*3=6
 * ...
 * 2*9=18   3*9=27      9*9=81 
 */

public class Test01 {
	public static void main(String[] args) {
		for(int i=2; i<10; i++) {
			System.out.print(i + "단\t");
		}
		for(int i=2; i<10; i++) {
			System.out.println();
			for(int j=2; j<10; j++) {
				System.out.print(j + "*" + i + "=" + j*i + "\t");
				
			}
		}
	}
}
