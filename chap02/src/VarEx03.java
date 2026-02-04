

/*
 * 문자열 : 문자여러개 저장. 0개이상 => 참조자료형 String : "" 큰 따옴표로 표현 
 * 문자  : 문자 한개 저장. 한개만 가능 => 기본자료형 char : '' 작은 따옴표로 표현
 * 
 * String 클래스는 기본자료형과 + 연산이 가능
 * 큰자료형 = 큰자료형 + 작은자료형
 * String = String + 기본자료형
 * 
 * =======================================
 *   리터널에 붙는 접미사
 *      L,l : long 형 접미사
 *      F,f : float 형 접미사
 *      D,d : double 형 접미사
 */
public class VarEx03 {
	public static void main(String[] args) {
		int i1 = 10;
		long l1 = 20;
		int i2 = (int) (i1 + l1);
		long l2 = i1 + l1;
		String nostr = "번호";
		String str1 = nostr + 1 + 2;
		System.out.println(str1);
		String str2 = 1 + 2 + nostr;
		System.out.println(str2);
		// ===========================
		int i3 = (int) (100l + 100);
		float f1 = (float) (100f + 1.0);
		double d1 = 100d + 1.0;
	}
}