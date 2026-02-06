package ex11_regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
   정규 표현식
   . : 임의문자 한개
   ? : 0,1 개
   * : 0개 이상
   + : 1개 이상
^[..]: 문자열의 시작. ^[0-9] : 숫자로 시작하는 경우
[^..]: 문자열을 제외(NOT). [^0-9] : 숫자가 아닌 경우
   | : 또는. OR. 02|010:02또는 010 인 경우
   & : AND
  \s : 공백 한개
  \S : 공백이 아닌 문자 한개 
  \d : 숫자한개. [0-9]와 같은 의미
  \D : 숫자가 아닌 문자 한개 [^0-9] 같은의미
  \w : 일반문자 [0-9A-Za-z] 같은 의미
  \W : 일반문자가 아닌 문자 한개
  
  () : 그룹
 {n} : n개. \d{3} : 숫자 3개
{n,} : n개 이상
{n,m}: n개 이상 m개 이하
 */
public class MainEx02 {
	public static void main(String[] args) {
		String[] patterns = { ".", "[a-z]?", "[0-9]+", "^[0-9]", "[a-z]*", "[a-z]+", 
							  "02|010", "\\s", "\\S", "\\d", "\\D", "\\w", "\\W" };
		String[] datas = { "", "a", "1", "12", "012", "abc", "02", " ", "A", "5", "*", "010" };
		for (String s : datas) {
			// s : ""
			if (s.equals(""))
				System.out.print("빈문자열\"\"패턴=>");
			else if (s.equals(" "))
				System.out.print("공백문자 \" \"패턴=>");
			else
				System.out.print(s + "문자의 패턴 =>");
			for (String p : patterns) {
				// p : [a-z]?
				Pattern pattern = Pattern.compile(p);
				Matcher m = pattern.matcher(s);
				if (m.matches())
					System.out.print(p + ",");
			}
			System.out.println();
		}
	}
}