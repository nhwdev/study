import java.util.Scanner;

/*
 * 1. 길이가 10인 정수형 배열을 생성하기
 * 2. 1부터 10까지의 값을 초기화기. for구문을 이용하여 초기화하기
 * 3. 배열의 값을 출력하기
 * ---------------------------------------------------
 * 1. 길이가 10인 정수형 배열을 생성하기 (arr2)
 * 2. 10부터 1까지의 값을 초기화기. for구문을 이용하여 초기화하기
 * 3. 배열의 값을 출력하기
 * ---------------------------------------------------
 * 1. 화면에서 배열의 크기를 입력받기
 * 2. 배열의 크기 만큼 정수형 배열을 생성하기
 * 3. 화면에서 크기만큼 정수값을 입력받아, 합계, 평균 출력하기
 * 
 */
public class Exam01 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]=" + arr[i]);
		}
		System.out.println("--------------------------");
		int[] arr2 = new int[10];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = arr2.length - i;
		}
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("arr2[" + i + "]=" + arr2[i]);
		}
		System.out.println("--------------------------");
		Scanner scan = new Scanner(System.in);
		System.out.println("배열의 크기를 입력하세요");
		int size = scan.nextInt();
		int[] arr3 = new int[size];
		System.out.println("배열에 저장할 값 " + size + "개를 입력하세요");
		int sum = 0;
		for (int i = 0; i < size; i++) {
			arr3[i] = scan.nextInt();
			sum += arr3[i];
		}
		System.out.println("합계:" + sum);
		System.out.println("평균:" + (double) sum / size);
	}
}