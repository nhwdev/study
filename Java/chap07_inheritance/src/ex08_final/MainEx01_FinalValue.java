package ex08_final;

/*
 * final 변수 : 변경불가 변수=> 상수 (const 예약어 사용안함)
 * 
 * final 멤버변수는 생성자에서 한번 초기화 가능함 => 객체별로 다른 상수값이 가능함
 *  단 명시적 초기화된 상수는 안됨
 */
class FinalValue {
	final int NUM = 10;
	final int MAX;

	FinalValue(int max) {
		MAX = max; // 상수값 초기화
//		NUM = max; //명시적 초기화된 상수는 생성자에서 초기화 불가 
	}
}

public class MainEx01_FinalValue {
	public static void main(String[] args) {
		final int NUM = 100; // 선언시 초기화. 변경불가변수(상수)
//		NUM = 200; //변경 불가
		FinalValue f1 = new FinalValue(100);
		FinalValue f2 = new FinalValue(1000);
//		f1.NUM = 200; //변경불가
		System.out.println("f1.MAX=" + f1.MAX); // 100
		System.out.println("f2.MAX=" + f2.MAX); // 1000
	}
}
