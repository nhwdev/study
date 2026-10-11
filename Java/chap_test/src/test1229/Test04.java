package test1229;

import java.util.Arrays;
import java.util.Scanner;

/*
 [결과]
--------------------
1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
--------------------
선택>1
학생수>5
--------------------
1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
--------------------
선택>2
scores[0]>100
scores[1]>50
scores[2]>80
scores[3]>75
scores[4]>95
--------------------
1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
--------------------
선택>3
scores[0]:100
scores[1]:50
scores[2]:80
scores[3]:75
scores[4]:95
--------------------
1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
--------------------
선택>4
최고 점수:100
평균 점수:80.0
--------------------
1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
--------------------
선택>5
프로그램 종료
 */
public class Test04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = 0;
		int[] stu= new int[0];
		
		for(int i=0; i<6; i=0) {
			System.out.println("------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("------------------------------------------------------");
			
			System.out.print("선택> ");
			i=scan.nextInt();
			if(i==1) {
				System.out.print("학생수> ");
				input = scan.nextInt();
				stu=new int[input];
				continue;
			} else if(i==2) {
				for(int j=0; j<stu.length; j++) {
					System.out.print("score["+j+"] =");
					stu[j] = scan.nextInt();
				}
			} else if(i==3) {
				for(int j=0; j<stu.length;j++) {
					System.out.println("score["+j+"] =" + stu[j]);
				}
			} else if(i==4) {
				int sum=0;
				int max=0;
				for(int j=0; j<stu.length; j++) {
					sum += stu[j];
					if(max<stu[j]) {
						max=stu[j];
					}
					}
				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + (sum/stu.length));
				
			} else if(i==5) {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}
}