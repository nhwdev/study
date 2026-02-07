package test1224;
/*
 * 1부터 100까지의 숫자 중 2의 배수이거나, 3의 배수의 합을 구하기 
 */
public class Test06 {
	public static void main(String[] args) {
		int num=1;
		int total=0;
		for(int i=0; i<100;i++) {
			if(num%2==0 || num%3==0) {
				total+=num;
			}
			num++;
		}
		System.out.println(total);
	}
}
