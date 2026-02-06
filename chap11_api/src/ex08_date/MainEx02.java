package ex08_date;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Date 클래스에 날짜 설정하기
 *  생성자
 *  new Date()    : 현재일시 맞는 Date 객체 생성
 *  new Date(long): 1970년 이후부터 밀리초를 매개변수에 입력. long 값에 맞는 Date 객체 생성
 *  long getTime() : Date 객체의 설정된 밀리초 리턴
 *  setTime(long)  : Date 객체의 밀리초를 입력받아 새로운 날짜로 설정
 */
public class MainEx02 {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now.getTime()); // now Date의 밀리초 리턴
		System.out.println(System.currentTimeMillis()); // 현재의 밀리초 리턴
		// 3일 이후의 시간을 설정하기
		Date day = new Date(now.getTime() + (1000 * 60 * 60 * 24 * 3));
		System.out.println(day);
		System.out.println(new SimpleDateFormat("yyyy-MM-dd E요일").format(day));
		// day 일자의 3일 이후의 시간을 설정하기
		day.setTime(day.getTime() + (1000 * 60 * 60 * 24 * 3));
		System.out.println(new SimpleDateFormat("yyyy-MM-dd E요일").format(day));
	}
}