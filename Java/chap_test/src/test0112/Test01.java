package test0112;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * 두개의 날짜를 입력받아서 두날짜사이의 일수를 출력하기
  [결과]
첫번째 날짜를 입력하세요(yyyy-MM-dd)
2026-01-01
두번째 날짜를 입력하세요(yyyy-MM-dd)
2026-01-03
2026-01-03 -2026-01-01 일자의 차이 : 2

 */
public class Test01 {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		while(true) {
		try {
		System.out.println("첫번째 날짜를 입력하세요(yyyy-MM-dd)");
		String fdate = s.next();
		System.out.println("두번째 날짜를 입력하세요(yyyy-MM-dd)");
		String sdate = s.next();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		Date d1 = sf.parse(fdate);
		Date d2 = sf.parse(sdate);
		System.out.println(fdate + " ~ " + sdate + " 일자의 차이: " + Math.abs(d2.getTime()-d1.getTime()) / (1000*60*60*24));
		break;
		} catch (ParseException e) {
			System.out.println("(yyyy-MM-dd)형식으로 재입력 하십시오.\n");
			continue;
		}
		}
	}
}
