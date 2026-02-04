

/*
 * 특수 문자 : \ 
 */
public class VarEx04 {
	public static void main(String[] args) {
		char single = '\''; // \' => 순수한 작은따옴표 문자 한개
		System.out.println(single);
		String str = "홍길동이 말했습니다. \"반갑습니다.\""; // \" => 순수한 큰따옴표 문자 한개
		System.out.println(str);
		String dir = "c:\\"; // \\ => 순수한 \ 문자를 의미
		System.out.println(dir);

		System.out.println("서울\t대전\t대구\t부산"); // \t : tab 출력
		System.out.println("안녕하세요\n홍길동 입니다.\n3줄에 출력됩니다."); // \n : new line 출력
		System.out.println("\uD64D"); // \ u : 유니코드 출력. 16진수
	}
}