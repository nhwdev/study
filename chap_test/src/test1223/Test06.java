package test1223;

import java.util.Scanner;

//  반지름을 입력받아 원의 둘레와 면적을 구하시오
public class Test06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("원의 반지름 입력: ");
		int r = scan.nextInt();
		double pi = 3.141592;
		
		double perimeter = 2*pi*r;
		double area = pi*r*r;
		
		System.out.println("원의 둘레: " + perimeter);
		System.out.println("원의 면적: " + area);
		
		
	}
}
