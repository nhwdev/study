package test0112;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/*
 * 
년도와 월를 입력하세요
2026 1

	2026년 1월
  일   월   화  수   목  금   토
                   1   2   3
   4   5   6   7   8   9  10
  11  12  13  14  15  16  17
  18  19  20  21  22  23  24
  25  26  27  28  29  30  31
  
 */

public class Test02 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		LocalDate date = LocalDate.of(s.nextInt(), s.nextInt(), 1);
//		int wcnt = date.getDayOfWeek().toString().equals("SUNDAY")? 0
//				: date.getDayOfWeek().toString().equals("MONDAY")? 1
//						: date.getDayOfWeek().toString().equals("TUESDAY")? 2
//								: date.getDayOfWeek().toString().equals("WEDNESDAY")? 3
//										: date.getDayOfWeek().toString().equals("THURSDAY")? 4
//												: date.getDayOfWeek().toString().equals("Friday")? 5 : 6;
		int wcnt = date.getDayOfWeek().getValue() % 7;
		String[] week = { "일", "월", "화", "수", "목", "금", "토" };
//		System.out.printf("%17s월\n", date.toString().substring(0, 7).replace("-", "년 "));
		// 타이틀 년-월
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy년 MM월");
		System.out.printf("%" + ((21 / 2) + 8) + "s\n", date.format(df));
		// 주간 출력
		for (String i : week)
			System.out.printf("%3s", i);
		System.out.println();
		// 달에 첫날부터 마지막날까지 출력, wcnt+해야해
		for (int i = date.getDayOfMonth(); i <= date.lengthOfMonth() + wcnt; i++) {
			if (i % 8 == 0) {
				System.out.println();
			} else if (i <= wcnt) {
				System.out.printf("%4s", "");
			} else {
				System.out.printf("%4d", i - wcnt);
			}
		}
	}
}
