package ex11_regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * data 문자열 중 점수를 찾아서 총점과 평균 출력하기
 */
public class Exam01 {
	public static void main(String[] args) {
		String data = "번호:1,이름:홍길동,국어:100,영어:70,수학:85,과학:95";
		Pattern p = Pattern.compile("\\d{2,3}");
		Matcher m = p.matcher(data);
		int sum = 0, cnt = 0;
		while (m.find()) {
			System.out.println(m.group());
			cnt++;
			sum += Integer.parseInt(m.group());
		}
		System.out.println("총점:" + sum);
		System.out.println("평균:" + (double) sum / cnt);
		System.out.println("======================");
		System.out.println("한글만 출력하기");
		p = Pattern.compile("[가-힣]+");
		m = p.matcher(data);
		while (m.find()) {
			System.out.println(m.group());
		}
	}
}