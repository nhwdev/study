package test0109;
/*
 * format 메서드 구현하기
 * 메서드명 : String format (String str,int len,int align)
 * 기능 : 주어진 문자열을 지정된 크기의 문자열로 변환.
 *        나머지 공간은 공백으로채운다.
 *      (0 : 왼쪽 정렬, 1: 가운데 정렬, 2:오른쪽 정렬)     
 [결과]
 가나다    
  가나다  
    가나다
 가나 
 */

public class Test03 {
	public static void main(String[] args) {
		String str = "가나다";
		System.out.println(format(str, 7, 0));
		System.out.println(format(str, 7, 1));
		System.out.println(format(str, 7, 2));
		System.out.println(format(str, 13, 1));
		System.out.println(format(str, 2, 0));
	}

	static String format(String str, int len, int align) {
		char[] strC = new char[len];
		String st = "";

		for (int i = 0; i < len; i++) {
			if (align == 0) {
				if (str.length() > i) {
					strC[i] = str.charAt(i);
				} else
					strC[i] = ' ';
			} else if (align == 1) {
				if (i < (strC.length - str.length()) / 2) {
					strC[i] = ' ';
				} else if (i - (strC.length - str.length()) / 2 < str.length())
					strC[i] = str.charAt(i - (strC.length - str.length()) / 2);
			} else if (align == 2) {
				if (i < len - str.length()) {
					strC[i] = ' ';
				} else
					strC[i] = str.charAt(i - (len - str.length()));
			}
		}
		for (char i : strC) {
			st += i;
		}
		return st;
	}
}