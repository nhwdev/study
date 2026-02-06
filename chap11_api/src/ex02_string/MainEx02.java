package ex02_string;

/*
 * String 클래스의 주요메서드
 */
public class MainEx02 {
	public static void main(String[] args) {
		String s = "ABCDEFGH";
		// s 문자열의 4번인덱스에 해당하는 문자 리턴. 5번째 문자
		System.out.println(s.charAt(4)); // E
		// 정렬관련메서드. 결과가 음수 : s 문자열이 abc 문자열 보다 앞쪽 순서.
		// 결과가 양수: s 문자열이 abc 문자열 보다 뒷쪽 순서
		System.out.println(s.compareTo("abc")); // -32
		// IgnoreCase : 대소문자 상관없이
		// 0 : s 문자열과 abcdefgh 문자열은 같다.
		System.out.println(s.compareToIgnoreCase("abcdefgh")); // 0
		// s 문자열이 ABC로 시작?
		System.out.println(s.startsWith("ABC")); // true
		// s 문자열이 FGH로 끝?
		System.out.println(s.endsWith("FGH")); // true
		System.out.println(s.equals("ABCDEFGH")); // true
		System.out.println(s.equalsIgnoreCase("abcdefgh")); // true
		System.out.println("=========================");
		s = "This is a String";
		// indexOf(char) : char 가 몇번 인덱스. 첫번째 인덱스 리턴
		// indexOf(String) : String 이 몇번 인덱스. 첫번째 인덱스 리턴
		System.out.println(s.indexOf('i')); // 2
		System.out.println(s.indexOf("is")); // 2
		// lastIndexOf() : 뒤우선으로 찾아서 인덱스 리턴
		System.out.println(s.lastIndexOf("is")); // 5
		System.out.println(s.lastIndexOf('i')); // 13
		// i 문자 3번 인덱스 부터 검색하여 인덱스 리턴
		System.out.println(s.indexOf('i', 3)); // 5
		System.out.println(s.indexOf('Z')); // -1 . 해당 문자가 없는 경우
		System.out.println(s.indexOf("is", 7)); // -1
		// 문자열의 길이
		System.out.println(s.length());
		// 문자열 치환
		System.out.println(s.replace("is", "##"));
		System.out.println(s);
		System.out.println(s.replaceAll("is", "##")); // 정규식 사용 가능
		// "This is a String"
		// 부분문자열 : substring(시작인덱스,[종료+1인덱스])
		System.out.println(s.substring(5));// 5번 인덱스부터 이후의 부분 문자열
		System.out.println(s.substring(5, 13));// 5번 인덱스부터 13이전까지의 부분 문자열
												// 5번 인덱스부터 12번인덱스까지의 부분 문자열
		// 대소문변경. toUpperCase, toLowerCase
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());

		// 양쪽 공백제거
		s = "   문자열 trim    ";
		System.out.println(s);
		System.out.println(s.trim());
		System.out.println(s.length());
		System.out.println(s.trim().length());

		// 문자열 분리 : split(분리기준문자열)
		s = "홍길동,이몽룡,김삿갓,abc,def,123";
		String[] arr = s.split(","); // ,를 기준으로 문자열을 분리하여 배열 리턴
		for (String a : arr)
			System.out.println(a);

		// toCharArray() : 문자열을 한개씩 char 분리하여 배열로 리턴
		char[] carr = s.toCharArray();
		for (char c : carr)
			System.out.print(c + " ");
		System.out.println();

		// getBytes() : 문자열을 한개씩 byte 형으로 분리하여 배열로 리턴
		byte[] barr = s.getBytes();
		for (byte b : barr)
			System.out.print((char) b + " ");
		System.out.println();
	}
}