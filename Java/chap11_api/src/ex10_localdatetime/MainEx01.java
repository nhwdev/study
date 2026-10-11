package ex10_localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/*
 * java.time 패키지의 클래스 jdk8이후 
 * 
 *   날짜 : java.time.LocalDate
 *   시간 : java.time.LocalTime
 *   날짜시간 : java.time.LocalDateTime
 */
public class MainEx01 {
	public static void main(String[] args) {
		LocalDate date1 = LocalDate.now(); // 현재일자
		System.out.println(date1);
		LocalDate date2 = LocalDate.of(2026, 12, 25);
		System.out.println(date2);
		LocalDate date3 = LocalDate.parse("2026-01-13"); // 기본 문자열 형식 : yyyy-MM-dd
		System.out.println(date3);
		LocalDate date4 = LocalDate.parse("2026/01/13", DateTimeFormatter.ofPattern("yyyy/MM/dd")); // 문자열 형식 설정
		System.out.println(date4);
		// LocalTime
		LocalTime time1 = LocalTime.now(); // 현재 시간
		System.out.println(time1.toString());
		LocalTime time2 = LocalTime.of(18, 10, 10); // 시간 설정
		System.out.println(time2);
		LocalTime time3 = LocalTime.parse("18:10:20"); // 시간 설정
		System.out.println(time3);
		// LocalDateTime
		LocalDateTime datetime1 = LocalDateTime.now(); // 현재 일시
		System.out.println(datetime1);
		LocalDateTime datetime2 = LocalDateTime.of(2026, 01, 13, 15, 30, 50); // 일시 설정
		System.out.println(datetime2);
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 a hh:mm:ss");
		System.out.println(df.format(datetime2));

		// 년,월,일,시,분,초
		LocalDateTime today = LocalDateTime.now();
		int year = today.getYear();
		int mon = today.getMonthValue(); // 월: 1 ~ 12
		int day = today.getDayOfMonth(); // 일
		int h = today.getHour();
		int m = today.getMinute();
		int s = today.getSecond();
		System.out.printf("%d년 %02d월 %02d일 %02d:%02d:%02d\n", year, mon, day, h, m, s);
	}
}