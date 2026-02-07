package test1229;
/*
11*11 크기의 사각형이 있다고 가정할때 다음 결과를 출력되도록 프로그램 작성하기
							i	j
X□■□■□■□■□X		0	1	3	5	7	9	11
□X□■□■□■□X□		1	0	2	4	6	8	10
■□X□■□■□X□■		2	1	3	5	7	9
□■□X□■□X□■□
■□■□X□X□■□■
□■□■□X□■□■□
■□■□X□X□■□■
□■□X□■□X□■□
■□X□■□■□X□■
□X□■□■□■□X□
X□■□■□■□■□X

■ : ㅁ 한자
□ : ㅁ 한자
*/
public class Test06 {
	public static void main(String[] args) {
		char[][] x= new char[11][11];
		for(int i=0; i<11; i++) {
			for(int j=0; j<11; j++) {				
				if(i+j==10 || i==j) {
					x[i][j] = 'X';
				}else if(i%2==0?j%2==0:j%2==1 || (i+j)%2==0) {
					x[i][j] = '■';
				}else x[i][j] = '□';
				System.out.print(x[i][j]);
			}
			System.out.println();
		}
	}
}
