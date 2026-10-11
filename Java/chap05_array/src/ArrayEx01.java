/*
 * 배열의 선언,생성,초기화
 * 
 * 배열이란 
 *   같은 자료형을 가진 여러개의 값을 저장 할 수 있는 자료 구조
 *   
 * -- 자료구조에 따른 분류 --  
 * 변수 : 한개의 값만 저장 가능 공간
 * 배열 : 여러개의 값을 저장 가능 공간. 단 같은 자료형인 값들
 * 구조체 : 여러개의 값을 저장 가능 공간 단 다른 자료형의 값들도 가능 => 자바는 없음   
 * 클래스 : 구조체 + 함수 
 */
public class ArrayEx01 {
	public static void main(String[] args) {
		int[] arr; // 배열 참조변수 선언
		arr = new int[5]; // 배열의 생성
		/*
		 * new 예약어 기능 1. 객체 생성. int 형을 저장할 수 있는 공간 5개를 메모리에 할당. 
		 * 			       2. 기본값으로 요소(Element)를 초기화함
		 * 					  숫자 : 0 boolean : false 그외 : null
		 */
		arr[0] = 10; // 배열값을 초기화. 인덱스 사용. 인덱스 0부터 시작
		arr[1] = 20;
		// arr.length = 10; 변경불가
		// arr.length : 배열의 크기. 5. 상수값 변경 불가
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]=" + arr[i]);
		}
		int[] arr2 = new int[3]; // 배열 선언 + 생성
		arr2[0] = 10;
		arr2[1] = 20;
		arr2[2] = 30;
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("arr2[" + i + "]=" + arr2[i]);
		}
		arr2 = arr;
		arr[0] = 100;
		System.out.println("arr2 = arr 문장 실행 후=========");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]=" + arr[i]);
		}
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("arr2[" + i + "]=" + arr2[i]);
		}
	}
}