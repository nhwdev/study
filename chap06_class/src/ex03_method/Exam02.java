package ex03_method;

/*
 * Exam01.java 파일의 Rectangle 클래스를 이용하여
 * 20~50 사이의 임의의 가로,세로 길이를 가진 사각형 3개를 생성하여
 * 사각형 정보를 출력하고, 전체 사각형의 면적의 합과, 둘레의 합을 출력하기
 */
public class Exam02 {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.width = (int) (Math.random() * 31) + 20;
		r1.height = (int) (Math.random() * 31) + 20;
		r1.serialNo = ++Rectangle.cnt;
		System.out.println(r1.serialNo + "번 사각형=>가로:" + 
						   r1.width + ",세로:" + r1.height + ",면적:" + r1.area() + ",둘레:" + 
						   r1.length() + "정사각형여부:" + (r1.isSquare() ? "정사각형" : "직사각형"));
		Rectangle r2 = new Rectangle();
		r2.width = (int) (Math.random() * 31) + 20;
		r2.height = (int) (Math.random() * 31) + 20;
		r2.serialNo = ++Rectangle.cnt;
		System.out.println(r2.serialNo + "번 사각형=>가로:" + r2.width + ",세로:" + r2.height + 
						   ",면적:" + r2.area() + ",둘레:" + r2.length() + ",정사각형여부:" + 
						  (r2.isSquare() ? "정사각형" : "직사각형"));
		Rectangle r3 = new Rectangle();
		r3.width = (int) (Math.random() * 31) + 20;
		r3.height = (int) (Math.random() * 31) + 20;
		r3.serialNo = ++Rectangle.cnt;
		System.out.println(r3.serialNo + "번 사각형=>가로:" + r3.width + ",세로:" + r3.height + 
						   ",면적:" + r3.area() + ",둘레:" + r3.length() + "정사각형여부:" + 
						  (r3.isSquare() ? "정사각형" : "직사각형"));
		System.out.println("전체면적의합:" + (r1.area() + r2.area() + r3.area()));
		System.out.println("전체둘레의합:" + (r1.length() + r2.length() + r3.length()));
	}
}