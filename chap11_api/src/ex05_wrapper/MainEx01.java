package ex05_wrapper;

/*
 * Wrapper(포장) 클래스 : 8개의 기본자료형을 객체화 하기 위한 클래스
 *   기본자료형       Wrapper 클래스
 *    boolean        Boolean
 *    char           Character
 *    byte           Byte
 *    short          Short
 *    int            Integer
 *    long           Long
 *    float          Float
 *    double         Double
 *    
 *    
 *  기본자료형과 참조자료형은 형변환 불가. String str = 'A'; (X)
 *  예외적으로 기본자료형과 Wrapper 클래스간의 형변환 가능  
 *  참조형 <= 기본형 : auto Boxing
 *  기본형 <= 참조형 : auto unBoxing
 *    
 */
public class MainEx01 {
	public static void main(String[] args) {
		Integer i1 = 100; // Boxing
		Integer i2 = 100;
		System.out.println(i1 == i2);
		System.out.println(100 == i2);
		System.out.println(i1.equals(i2));
		// int형 정보
		System.out.println("int형의 최대값:" + Integer.MAX_VALUE);
		System.out.println("int형의 최소값:" + Integer.MIN_VALUE);
		System.out.println("int형의 bit크기:" + Integer.SIZE);
		System.out.println("int형의 byte크기:" + Integer.BYTES);
		// long형 정보
		System.out.println("long형의 최대값:" + Long.MAX_VALUE);
		System.out.println("long형의 최소값:" + Long.MIN_VALUE);
		System.out.println("long형의 bit크기:" + Long.SIZE);
		System.out.println("long형의 byte크기:" + Long.BYTES);

		// Integer.parseInt : int <- 문자열
		int inum = Integer.parseInt("123");
		System.out.println(inum);
		// 123 : 1* 64 + 2*8 + 3 * 1 = 64 + 16 + 3
		inum = Integer.parseInt("123", 8); // 123문자열을 8진수로 인식해서 int형으로 리턴
		System.out.println(inum);
		inum = Integer.parseInt("123", 16); // 16진수 123을 int 형으로 리턴
		System.out.println(inum);

		// double형 <- 문자열
		double dnum = Double.parseDouble("123.5");
		System.out.println(dnum);
		// float형 <- 문자열
		float fnum = Float.parseFloat("123.5");
		System.out.println(fnum);

		// 255를 2진수로 변경하기
		System.out.println(Integer.toBinaryString(255));
		// 255를 8진수로 변경하기
		System.out.println(Integer.toOctalString(255));
		// 255를 16진수로 변경하기
		System.out.println(Integer.toHexString(255));

		// 8진수 : 377을 10진수 출력하기
		System.out.println(Integer.parseInt("377", 8));
		// 16진수 :ff를 10진수 출력하기
		System.out.println(Integer.parseInt("ff", 16));
		// 2진수 : 11111111을 10진수 출력하기
		System.out.println(Integer.parseInt("11111111", 2));
	}
}
