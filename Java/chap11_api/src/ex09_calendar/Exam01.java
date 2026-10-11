package ex09_calendar;

import java.util.Calendar;
import java.util.Scanner;

/*
 * 년도와 월을 입력받아서, 월의 첫째날과 마지막날짜의 일자와 요일 출력하기.
 * Calendar 클래스 이용하기 
 * [결과]
 * 년도와 월을 입력하세요
 * 2026 1
 * 2026-01-01 요일 
 * 2026-01-31 요일
 */
public class Exam01 {
	public static void main(String[] args) {
		System.out.println("년도와 월일 입력하세요");
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		int mon = scan.nextInt();
		Calendar fday = Calendar.getInstance(); // 현재일시
		fday.set(year, mon - 1, 1); // 입력년월의 첫째날 설정
		Calendar lday = Calendar.getInstance();
		int lastdate = fday.getActualMaximum(Calendar.DATE);
		lday.set(year, mon, 0); // 다음월 0일 => 현재월의 마지막일자로 설정
//		lday.set(year, mon - 1,lastdate); //=> 현재월의 마지막일자로 설정
		String week = "일월화수목금토";
		System.out.printf("%4d-%02d-%02d %c요일\n", fday.get(Calendar.YEAR), fday.get(Calendar.MONTH) + 1,
				fday.get(Calendar.DATE),
				// fday.get(Calendar.DAY_OF_WEEK) : 1(일) ~ 7(토)
				week.charAt(fday.get(Calendar.DAY_OF_WEEK) - 1));
		System.out.printf("%4d-%02d-%02d %c요일\n", lday.get(Calendar.YEAR), lday.get(Calendar.MONTH) + 1,
				lday.get(Calendar.DATE), week.charAt(lday.get(Calendar.DAY_OF_WEEK) - 1));
	}
}