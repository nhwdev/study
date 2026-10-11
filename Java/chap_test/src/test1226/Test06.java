package test1226;
/*
(1)+(1+2)+(1+2+3)+(1+2+3+4)+(1+2+3+4+5)+(1+2+3+4+5+6)+(1+2+3+4+5+6+7)+(1+2+3+4+5+6+7+8)+(1+2+3+4+5+6+7+8+9)+(1+2+3+4+5+6+7+8+9+10)=220
한줄로 출력하기
*/

public class Test06 {

	public static void main(String[] args) {
		int sum= 0;
		for(int i=1; i<11;i++) {
			if(i>1) {
			System.out.print("+(");
			} else System.out.print("(");
			for(int j=1; j<i+1; j++) {
				if(j==1) {
				System.out.print(j);
				} else if (j>1) {
					System.out.print("+"+j);
				}
				sum+=j;
			}System.out.print(")"); 
		}
		System.out.print("="+ sum);
	}

}
