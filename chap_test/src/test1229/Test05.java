package test1229;

import java.util.Arrays;

/*
11*11 크기의 사각형이 있다고 가정할때 다음 결과를 출력되도록 프로그램 작성하기
				i	j	i	j
X         X		0	10	0	0
 X       X		1	9	1	1
  X     X 		2	8	2	2
   X   X  		3	7	3	3
    X X   		4	6	4	4
     X    		5	5	5	5
    X X   		6	4	6	6
   X   X  		7	3	7	7
  X     X 		8	2	8	8
 X       X		9	1	9	9
X         X		0	10	10	10
 
*/
public class Test05 {
	public static void main(String[] args) {
		char[][] x= new char[11][11];
		for(int i=0; i<11; i++) {
			for(int j=0; j<11; j++) {				
				if(i+j==10 || i-j==0) {
					x[i][j] += 'X';
				}else x[i][j] += ' ';
				System.out.print(x[i][j]);
			}System.out.println();
		}
	}
}
