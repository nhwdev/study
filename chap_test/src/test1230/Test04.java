package test1230;

/*
 * 다음 결과가 나오도록 Watch 클래스 구현하기
 */

public class Test04 {
	public static void main(String[] args) {
		Watch watch = new Watch();  // 16시 15분 30초
		watch.hour = 16;
		watch.minute = 15;
		watch.second = 30;
		watch.see();			// 16시 15분 30초
		watch.addHour(25);  	// 25시간 후(1시간)
		watch.addMinute(61);	// 61분 후 	(1시간 1분)
		watch.addSecond(3661);	// 3661초 후(1시간 1분 1초)
		watch.see();  // 19시 17분 31초
	}
}
