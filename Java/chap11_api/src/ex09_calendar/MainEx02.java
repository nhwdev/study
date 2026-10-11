package ex09_calendar;

import java.util.Calendar;
import java.util.Date;

/*
 * Date 클래스와 연결
 */
public class MainEx02 {
	public static void main(String[] args) {
		// Calendar 객체 <= Date 객체
		Date now = new Date();
		now.setTime(now.getTime() + (1000 * 60 * 60 * 24)); // 밀리초를 이용하여 Data 객체의 날짜 변경
		System.out.println(now);

		Calendar cal = Calendar.getInstance(); // 현재일시 객체
		// cal.setTime(Date)
		cal.setTime(now); // Date 객체로 Calendar 객체의 날짜 설정
		System.out.printf("%4d-%02d-%02d %02d:%02d:%02d\n", cal.get(Calendar.YEAR), cal.get(Calendar.MONTH) + 1,
				cal.get(Calendar.DATE), cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE), cal.get(Calendar.SECOND));

		Calendar cal2 = Calendar.getInstance(); // 현재일시 객체
		// cal2.setTimeInMillis(long) : 밀리초로 Calendar 객체의 날짜 설정
		cal2.setTimeInMillis(now.getTime());
		System.out.printf("%4d-%02d-%02d %02d:%02d:%02d\n", cal2.get(Calendar.YEAR), cal2.get(Calendar.MONTH) + 1,
				cal2.get(Calendar.DATE), cal2.get(Calendar.HOUR_OF_DAY), cal2.get(Calendar.MINUTE), cal2.get(Calendar.SECOND));
		// Date 객체 <= Calendar 객체
		Date day = new Date();
		day.setTime(cal2.getTimeInMillis());
		System.out.println(day);
	}
}