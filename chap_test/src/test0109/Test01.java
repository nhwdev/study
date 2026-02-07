package test0109;
/*
 * indexOf(문자열,찾는 문자열)
 *    문자열에서 찾는 문자열의 위치 값을 출력하는 함수 구현하기
 */
public class Test01 {
	public static void main(String[] args) {
		indexOf("12345AB12AB45AB", "12");  //12:0,7
		indexOf("12345AB12AB45AB", "AB");  //AB:5,9,13
		indexOf("12345", "AB");            //AB : 없음
	}
	public static void indexOf(String str, String i) {
		System.out.print(i+":");
		int j=0;
		int count=0;
		while(true) {
			count++;
			j=str.indexOf(i,j);
			if(j==-1) {
				System.out.print(count==1?"없음":"");
				break;
			}
			System.out.print(((count==1)?"":",")+j);
			j++;
			
		} System.out.println();
	}
}
