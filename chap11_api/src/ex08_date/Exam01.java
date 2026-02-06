package ex08_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * 년도와 월을 입력받아서, 월의 첫째날과 마지막날짜의 일자와 요일 출력하기
 * [결과]
 * 년도와 월을 입력하세요
 * 2026 1
 * 2026-01-01 요일 
 * 2026-01-31 요일
 */
public class Exam01 {
	public static void main(String[] args) throws ParseException {
		System.out.println("년도와 월을 입력하세요");
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		int mon = scan.nextInt();
		String fdate = year + "-" + mon + "-01";
		String ldate = year + "-" + (mon + 1) + "-00";
		SimpleDateFormat sf1 = new SimpleDateFormat("yyyy-MM-dd");
		Date fday = sf1.parse(fdate);
		Date lday = sf1.parse(ldate);
		SimpleDateFormat sf2 = new SimpleDateFormat("yyyy-MM-dd E요일");
		System.out.println(sf2.format(fday));
		System.out.println(sf2.format(lday));
	}
}