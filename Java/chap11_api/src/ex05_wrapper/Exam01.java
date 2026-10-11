package ex05_wrapper;

/*
 * str 문자열의 숫자의 합 출력하기
 */
public class Exam01 {
	public static void main(String[] args) {
		String str = "10,20,  30  , 40 ,  50";
		// , 를 기준으로 문자열 분리: split
		String arr[] = str.split(",");
		int sum = 0;
		for (String s : arr) {
			sum += Integer.parseInt(s.trim());
		}
		System.out.println(str + "문자열의 합 : " + sum);
		/*
		 * \s*, \s* : , 를 중심으로 양쪽 공백들로 분리기준문자 설정 => 정규식표현법 
		 * \s : 공백한개 \s* : 공백 0개 이상
		 */
		sum = 0;
		String arr2[] = str.split("\s*,\s*");
		for (String s : arr2)
			sum += Integer.parseInt(s);
		System.out.println(str + "문자열의 합 : " + sum);
	}
}