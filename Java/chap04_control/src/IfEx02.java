/*
 * 중첩 if 문 : if문 내부에 if 구문이 존재함
 */
public class IfEx02 {
	public static void main(String[] args) {
		int score = 65;
		if(score >= 60) {
			System.out.println("합격입니다.");
			if(score >= 80) {
				System.out.println("좋은 성적으로 합격하셨습니다.");
			}
		} else {
			System.out.println("불합격입니다.");
		}
	}
}