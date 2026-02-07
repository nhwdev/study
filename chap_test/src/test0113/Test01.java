package test0113;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * text 문자열에서 이메일을 추출하여 출력하기
  [결과]
  추출된 이메일:
  example_1@gmail.com
  contact@company.co.kr
 */
public class Test01 {
	public static void main(String[] args) {
        String text = 
        	"Hello, my email is example_1@gmail.com and my work email is contact@company.co.kr.";
        Pattern p = Pattern.compile("\\w+@\\w+.\\w+(\\.\\w+)?");
        Matcher m = p.matcher(text);
        System.out.println("추출된 이메일:");
        while(m.find()) {
        	System.out.println(m.group());
        }
    }
}
