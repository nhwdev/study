/*
 * 1. 길이가 5인 String 배열 선언하기
 * 2. 사과,귤,포도,복숭아,참외 배열의 요소에 초기화하기
 * 3. 생성된 배열의 인덱스를 이용하여 귤을 출력하기
 */
public class Exam02 {
	public static void main(String[] args) {
		/*
		* String[] arr = new String[5]; //String 배열 5개 생성. //초기화 arr[0]="사과";
		* arr[1]="귤"; 
		* arr[2]="포도";
		* arr[3]="복숭아"; 
		* arr[4]="참외";
		* System.out.println(arr[1]); //귤 출력 //모든 요소 출력하기 for(String a : arr)
		* System.out.println(a);
		*/
		String[] arr = { "사과", "귤", "포도", "복숭아", "참외" };
		// 귤출력
		System.out.println(arr[1]);
		// 모든 요소 출력하기
		for (String a : arr)
			System.out.println(a);
	}
}