package ex11_regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 정규 표현식 : 문자의 형식을 지정
 */
public class MainEx01 {
	public static void main(String[] args) {
		String[] data = { "bat", "baby", "bonus", 
						  "c", "cA", "ca", "combat", 
						  "count", "cTT", "data", "disk" };
		/*
		 * c[A-Za-z] : c 문자로 시작하고, 다음문자 영문자 한개 c[A-Za-z]?: c 문자로 시작하고, 다음문자 영문자 0 또는 1개
		 * c[A-Za-z]*: c 문자로 시작하고, 다음문자 영문자 0개이상 c[A-Za-z]+: c 문자로 시작하고, 다음문자 영문자 1개이상
		 * 
		 * ? : 0,1개 * : 0개 이상 + : 1개 이상
		 */
		Pattern p = Pattern.compile("c[A-Za-z]+");
		for (String s : data) {
			Matcher m = p.matcher(s);//
			// m.matches() : 패턴에 맞는 문자열?
			if (m.matches())
				System.out.print(s + ",");
		}
		System.out.println();
	}
}