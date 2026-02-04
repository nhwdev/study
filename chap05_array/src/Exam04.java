/*
 * command 라인에서 소문자로 된 문장을 입력받아 사용된 소문자의 갯수 출력하기
 * java Exam04 aaabbbcccdddffee
 * [결과]
 * a : 3 => ***
 * b : 3 => ***
 * c : 3 => ***
 * e : 2 => **
 * ....
 * 
 * char ch = args[0].charAt(i)
 */
public class Exam04 {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("command 라인에 소문자열을 입력하세요");
			return;
		}
									// 0 1 2 3 4 5 6 7 8.. 25
		int[] cntarr = new int[26]; // [3 3 3 3 2 2 0 0... 0] //26개 정수값
									// a b c d e f g h ...z
		// args[0] : "aaa bbb-cccdddffee"
		int len = args[0].length(); // 16
		for (int i = 0; i < len; i++) { // i : 16
			char ch = args[0].charAt(i); // f
			if (ch >= 'a' && ch <= 'z') // 소문자만 갯수 설정
				cntarr[ch - 'a']++; // cntarr['e'-'a']++
		}
		for (int i = 0; i < cntarr.length; i++) {
		//	if (cntarr[i] <= 0) continue;
			if (cntarr[i] > 0) {
				System.out.print((char) (i + 'a') + " : " + cntarr[i] + " => ");
				for (int j = 0; j < cntarr[i]; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}