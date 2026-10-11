package ex09_calendar;

import java.util.Calendar;

/*
 * Calendar 클래스
 *  - 추상클래스
 *  - getInstance() 메서드로 객체 리턴
 *  - get(int) : 필요한 정보 리턴
 */
public class MainEx01 {
	public static void main(String[] args) {
//		Calendar now = new Calendar(); //객체 생성 불가
		Calendar now = Calendar.getInstance();
		System.out.println(now);
		System.out.println("년도:" + now.get(Calendar.YEAR));
		System.out.println("년도:" + now.get(1));
		System.out.println("월(0~11):" + (now.get(Calendar.MONTH) + 1)); // 0(1월) ~ 11(12월)
		System.out.println("일(월기준일자):" + now.get(Calendar.DATE));
		System.out.println("일(월기준일자):" + now.get(Calendar.DAY_OF_MONTH));
		System.out.println("일(년기준일자):" + now.get(Calendar.DAY_OF_YEAR));
		System.out.println("월기준몇째주:" + now.get(Calendar.WEEK_OF_MONTH));
		System.out.println("년기준몇째주:" + now.get(Calendar.WEEK_OF_YEAR));
		System.out.println("요일(1:일~7:토):" + now.get(Calendar.DAY_OF_WEEK));
		System.out.println("월몇번째요일:" + now.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		// 시간
		System.out.println("오전(0)/오후(1):" + now.get(Calendar.AM_PM));
		System.out.println("시간(0~11):" + now.get(Calendar.HOUR));
		System.out.println("시간(0~23):" + now.get(Calendar.HOUR_OF_DAY));
		System.out.println("분(0~59):" + now.get(Calendar.MINUTE));
		System.out.println("초(0~59):" + now.get(Calendar.SECOND));
		System.out.println("밀리초(0~999):" + now.get(Calendar.MILLISECOND));
		/*
		 * now.get(Calendar.ZONE_OFFSET) : 지역 기준시를 밀리초로 리턴. 시간의 밀리초로 나누기
		 */
		System.out.println("TimeZone(-12 ~ 12):" + (now.get(Calendar.ZONE_OFFSET) / (1000 * 60 * 60)));
		//
		System.out.println("이번달의 마지막일자:" + now.getActualMaximum(Calendar.DATE));

		// 이번달의 마지막일자의 요일 출력하기
		int lastday = now.getActualMaximum(Calendar.DATE);
		Calendar cal = Calendar.getInstance();
		// cal 날짜를 마지막 일자로 변경
		cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), lastday);
		String week = " 일월화수목금토";
		System.out.println(week.charAt(cal.get(Calendar.DAY_OF_WEEK)) + "요일");
	}
}