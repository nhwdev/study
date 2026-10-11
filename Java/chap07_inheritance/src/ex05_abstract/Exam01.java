package ex05_abstract;

import java.net.MulticastSocket;

/*
 * 1. Shape 클래스를 상속받은 Rectangle 클래스 구현하기
 * Rectangle 클래스
 * 멤버변수 : width,height
 * 생성자 : 구동클래스에 맞도록
 * 멤버메서드 : 추상 메서드 오버라이딩 하기
 * 
 * 2. 구동 클래스 완성하기
 *    도형의 면적의 합과 둘레의 합을 구하여 출력하기
 */
public class Exam01 {
	public static void main(String[] args) {
		Shape[] arr = new Shape[2];
		arr[0] = new Circle(5);
		arr[1] = new Rectangle(10, 10);
		// 도형의 면적의 합과 둘레의 합 출력하기
		double totArea = 0, totLength = 0;
		for (Shape s : arr) {
			totArea += s.area();
			totLength += s.length();
			// 원:반지름=5,면적=....,둘레=xxxx
			// 사각형:가로=10,세로=10,면적=....,둘레=xxxx
			System.out.println(s.toString()); // Shape, Circle, Rectangle
		}
		System.out.println("전체 면적:" + totArea);
		System.out.println("전체 둘레:" + totLength);
	}
}