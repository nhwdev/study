package ex02_field;

/*
 * 지역변수 : 지역 변수는 반드시 초기화 필요
 *          메서드 내부에 선언된 변수
 *          매개변수도 지역변수
 *          {} 내에서 사용 가능한 변수
 */
public class Main3_LocalValue {
	public static void main(String[] args) {
		int num;
//		System.out.println(num); //초기화 되지 않았으므로 오류
		boolean b = true;
		if (b)
			num = 100; // num 변수 초기화
//		System.out.println(num); //초기화 되지 않을 가능성이 있음. 오류
		if (b)
			num = 100;
		else
			num = 200;
		System.out.println(num); // 초기화 되지 않을 가능성이 없음. 정상

		String grade = null; // 선언시 초기화 하면 오류 발생 안됨.
		int score = 80;
		if (score >= 90)
			grade = "A";
		else if (score >= 80)
			grade = "B";
		else if (score >= 70)
			grade = "C";
//		else  grade = "C";
		System.out.println(grade);
	}
}