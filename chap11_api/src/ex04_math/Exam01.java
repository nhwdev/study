package ex04_math;

/*
 * round(실수,소숫점이하자리수) : 소숫점이하 자리수까지 반올림하여 출력 
 * truncate(실수,소숫점이하자리수) : 소숫점이하 자리수까지 버림하여 출력 
 */
public class Exam01 {
	public static void main(String[] args) {
		System.out.println(round(3.1215, 1)); // 3.1
		System.out.println(round(3.1215, 2)); // 3.12
		System.out.println(round(3.1215, 3)); // 3.122
		System.out.println(truncate(3.1215, 1)); // 3.1
		System.out.println(truncate(3.1215, 2)); // 3.12
		System.out.println(truncate(3.1215, 3)); // 3.121
	}

	private static double truncate(double d, int i) {
		double num = Math.pow(10, i);
		return (int) (d * num) / num;
	}

	/*
	 * private static String truncate(double d, int i) { 
	 *		String sd = d + ""; 
	 *		int idx = sd.indexOf("."); 
	 *		return sd.substring(0,idx)+"." + sd.substring(idx+1).substring(0,i); 
	 *}
	 *
	 *
	 * private static double round(double d, int i) { 
	 * 		double num = Math.pow(10, i);
	 * 		return (int) (d * num + 0.5) / num; 
	 * }
	 */
	private static String round(double d, int i) {
		return String.format("%." + i + "f", d);
	}
}