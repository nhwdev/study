import java.util.Scanner;

/*
 * 삼각형의 높이를 입력받아서 *로 삼각형 출력하기
 * [결과]
 * 삼각형의 높이 : 3
        i   j
   *    1   1
   **   2   1,2
   ***  3   1,2,3
   ----------------------
        i   j
   ***  3   1,2,3    
   **   2   1,2
   *    1   1 
   ----------------------
		i   j
     *  3  1,2,* 
    **  2  1, **
   ***  1  ***
   
       if(j >= i) "*"
       else "공백" 
   ----------------------
        i   j
   ***  1  ***    
    **  2  1**
     *  3  12* 
 */
public class Exam06_loop {
	public static void main(String[] args) {
		System.out.print("삼각형의 높이 : ");
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		for(int i=1;i <= h ; i++) {
			for(int j=1;j <= i ;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------------------------------");
		for(int i = h; i>=1;i--) {
			for(int j=1;j <= i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------------------------------");
		for(int i=h;i>=1;i--) {
			for(int j=1;j<=h;j++) {
				if(i <= j) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println("------------------------------");
		for(int i=1;i<=h;i++) {
			for(int j=1;j<=h;j++) {
				if(i <= j) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
	}
}