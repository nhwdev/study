package ex08_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * SimpleDateFormat : 날짜의 형식화 클래스. java.text 패키지의 클래스
 *   - String format(Date) : 지정한 형식대로 Data 객체를 문자열로 변경하여 리턴
 *   - Date parse(String) : 지정된 형식 문자열을 Data 객체로 변경 리턴. ParseException 예외처리
 *   - 날짜 형식에 사용되는 문자
 *      yyyy : 년도2자리
 *      MM   : 월2자리
 *      dd   : 일2자리
 *      HH   : 시간2자리
 *      mm   : 분2자리
 *      ss   : 초2자리
 *      E    : 요일. 
 *      a    : am/pm. 오전/오후
 */
public class MainEx01 {
	public static void main(String[] args) throws ParseException {
		Date now = new Date(); // 현재일시
		System.out.println(now);
		SimpleDateFormat sf = new SimpleDateFormat("yyyy년MM월dd일 HH시mm분ss초 E요일 a");
		System.out.println(sf.format(now));
		String formatDate = "2026-12-25 10:00:00";
		SimpleDateFormat sf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date day = null;
		day = sf2.parse(formatDate);
		System.out.println(day);
		System.out.println(sf.format(day));
		// 2026-12-25 금요일 출력하기
		SimpleDateFormat sf3 = new SimpleDateFormat("yyyy-MM-dd E요일");
		System.out.println(sf3.format(day));
		// 2026-12-31의 요일 출력하기
		formatDate = "2026-13-00 10:00:00";
		day = sf2.parse(formatDate);
		System.out.println(sf3.format(day));
	}
}