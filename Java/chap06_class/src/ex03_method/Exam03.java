package ex03_method;

/*
 * Exam01.java 파일의 Rectangle 클래스를 이용하여
 * 20~50 사이의 임의의 가로,세로 길이를 가진 사각형 3개를 생성하여
 * 사각형 정보를 출력하고, 전체 사각형의 면적의 합과, 둘레의 합을 출력하기
 * -- Exam02.java 소스를 배열로 변경함
 */
public class Exam03 {
	public static void main(String[] args) {
		Rectangle[] arr = new Rectangle[3]; // Rectangle 타입의 참조변수를 배열로 선언
		int totArea = 0, totLen = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Rectangle(); // Rectangle 객체화
			arr[i].width = (int) (Math.random() * 31) + 20;
			arr[i].height = (int) (Math.random() * 31) + 20;
			arr[i].serialNo = ++Rectangle.cnt;
			System.out.println(arr[i].serialNo + "번 사각형=>가로:" + arr[i].width +
							   ",세로:" + arr[i].height + ",면적:" + arr[i].area() +
							   ",둘레:" + arr[i].length() + "정사각형여부:" + 
							   (arr[i].isSquare() ? "정사각형" : "직사각형"));
			totArea += arr[i].area();
			totLen += arr[i].length();
		}
		System.out.println("전체면적의합:" + totArea);
		System.out.println("전체둘레의합:" + totLen);
	}
}