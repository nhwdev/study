package test0113;
/*
 * 찾고자 하는 번호의 일부를 입력받아 번호를 출력하기
 * [결과]
 * 찾는 번호의 일부를 입력하세요:
 * 3456
 * 012-3456-7890
 * 013-3456-7890
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test02 {
	public static void main(String[] args) {
		String[] phoneNumArr = { "012-3456-7890", "099-2456-7980", "088-2346-9870", "013-3456-7890" };
		Scanner s = new Scanner(System.in);
		System.out.print("찾는 번호의 일부를 입력하세요: ");
		Pattern p = Pattern.compile("\\d+-" + s.next() + "-\\d+");
		for(String a : phoneNumArr) {
		Matcher m = p.matcher(a);
		if(m.matches()) System.out.println(a);
		};
	}
}
