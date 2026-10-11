package ex02_string;

/*
 * String.format() : 형식화된 문자(서식문자)를 이용하여 문자열로 리턴
 * 형식문자(서식문자) : %d,%f,%c,%x,...
 * => System.out.printf() 사용법이 동일. 화면출력 
 */
public class MainEx03_format {
	public static void main(String[] args) {
		// %d : 10진 정수. decimal
		String sf = String.format("%d", 12345);
		System.out.println(sf);
		// 세자리마다 ,출력하기
		sf = String.format("%,d", 12345);
		System.out.println(sf);
		// 10자리를 확보하고, 세자리마다 ,출력하기
		sf = String.format("%,10d", 12345);
		System.out.println(sf);
		// 10자리를 확보하고, 세자리마다 , 좌측 정렬로 출력하기
		sf = String.format("%-,10d", 12345);
		System.out.println(sf);
		// 10자리를 확보하고 빈자리는 0으로 채워 출력하기
		sf = String.format("%010d", 12345);
		System.out.println(sf);

		// %X,%x : 16진수. Hexa
		sf = String.format("%X,%x", 12345, 12345); // 10진수 12345를 16진수로 리턴
		System.out.println(sf);
		sf = String.format("%X,%x", 255, 255); // 10진수 255를 16진수로 리턴
		System.out.println(sf);
		// %o : 8진수. octal
		sf = String.format("%o", 10); // 10진수 10를 8진수로 리턴
		System.out.println(sf);

		// %b : boolean
		sf = String.format("%b,%b", true, false);
		System.out.println(sf);

		// %f : 부동소숫점 표현
		sf = String.format("%f", 123.142);
		System.out.println(sf);

		sf = String.format("%.2f", 123.142); // 소숫점 이하 2자리까지만 리턴. 소숫점이하 3자리에서 반올림됨
		System.out.println(sf);
		sf = String.format("%.2f", 123.145); // 소숫점 이하 2자리까지만 리턴. 소숫점이하 3자리에서 반올림됨
		System.out.println(sf);
		// 세자리마다 ,를 출력하고, 소숫점 이하 2자리까지만 리턴. 소숫점이하 3자리에서 반올림됨
		sf = String.format("%,.2f", 12345.145);
		System.out.println(sf);
		// 15자리 확보하고 세자리마다 ,를 출력하고, 소숫점 이하 2자리까지만 리턴.
		sf = String.format("%,15.2f", 12345.145);
		System.out.println(sf);
		// 15자리 확보하고 세자리마다 ,를 출력하고, 소숫점 이하 2자리까지만 좌측정렬로 리턴.
		sf = String.format("%-,15.2f", 12345.145);
		System.out.println(sf);
		// 15자리 확보하고 소숫점 이하 2자리까지만 빈자리는 0으로 채워 리턴.
		sf = String.format("%015.2f", 12345.145);
		System.out.println(sf);

		// %s : 문자열
		sf = String.format("%s,%10s,%-10s", "홍길동", "홍길동", "홍길동");
		System.out.println(sf);

		// %c : 문자
		sf = String.format("%c,%10c,%-10c", '홍', '길', '동');
		System.out.println(sf);

		// System.out.printf() 사용하기
		System.out.printf("%c,%10c,%-10c\n", '홍', '길', '동');
		System.out.printf("%s의 학점은 %c 입니다. 점수는 %3d 입니다.%n", "홍길동", 'B', 85);
		System.out.printf("%s의 학점은 %c 입니다. 점수는 %3d 입니다.", "김삿갓", 'A', 95);
	}
}