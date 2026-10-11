package ex11_regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainEx03 {
	public static void main(String[] args) {
		String source ="핸드폰:010-1111-1111,집:02-123-5678,"
				+ "이메일:regular@aaa.bbb,계좌번호:301-01-123456";
		/*
		  () : 그룹 
		  0\\d{1,2} : 0으로 시작. 숫자 1개이상 2개이하 => 지역번호
		  \\d{3,4}  : 숫자 3개이상 4개이하  => 국번
		  \\d{4}    : 숫자 4개.           => 번호
		 */
//		String telP = "(0\\d{1,2})-(\\d{3,4})-(\\d{4})";
		String telP = "(0[0-9]{1,2})-([0-9]{3,4})-([0-9]{4})";		
		Pattern p = Pattern.compile(telP); //패턴객체
		Matcher m = p.matcher(source); 
		int i = 0;
		System.out.println("전화번호:");
		//m.find() : source 중 패턴에 맞는 문자열을 찾기. 성공:true, 실패:false 리턴
		while(m.find()) {
			//m.group() : 찾은 문자열
			System.out.println(++i + ":" + m.group() + "=>" +
		            m.group(1) + "," + m.group(2) + "," + m.group(3));
		}
		i = 0;
		System.out.println("이메일:");
//		String emailP = "(\\w+)@(\\w+).(\\w+)";
		String emailP = "([0-9A-Za-z]+)@([0-9A-Za-z]+).([0-9A-Za-z]+)";
		p = Pattern.compile(emailP);
		m = p.matcher(source);
		while(m.find()) {
			System.out.println(++i + ":" + m.group() + "=>" +
		            m.group(1) + "," + m.group(2) + "," + m.group(3));
		}
		i = 0;
		System.out.println("계좌번호:");
		String accountP = "(\\d{3})-(\\d{2})-(\\d{6})";
		p = Pattern.compile(accountP);
		m = p.matcher(source);
		while(m.find()) {
			System.out.println(++i + ":" + m.group() + "=>" +
		            m.group(1) + "," + m.group(2) + "," + m.group(3));
		}
	}
}