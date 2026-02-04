/*
 * for, while, do while 구문으로 1 ~ 100까지의 합을 출력하기
 */
public class LoopEx02 {
	public static void main(String[] args) {
		int sum = 0,i=0;
		System.out.println("for 구문으로 1 ~ 100까지의 합 출력하기");
		for(i=1;i<=100;i++) {
			sum += i;
		}
		System.out.println("sum=" + sum);
		System.out.println("while 구문으로 1 ~ 100까지의 합 출력하기");
		i=1;
		sum = 0;
		while(i<=100) {
			sum += i;
			i++;
		}
		System.out.println("sum=" + sum);
		System.out.println("do while 구문으로 1 ~ 100까지의 합 출력하기");
		i=1;
		sum=0;
		do {
			sum += i;
			i++;
		} while(i <= 100);
		System.out.println("sum=" + sum);
	}
}