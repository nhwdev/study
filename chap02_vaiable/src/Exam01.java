
//잘못된 문장을 골라내고 그 이유를 설명하시오.
public class Exam01 {
	public static void main(String[] args) {
        char       a='a'; //정상
//오류  char       b="a"; // 작은따옴표로 표시
        char b = 'a';
        String     c="a"; //정상   
//오류  String     d='a'; //큰따옴표로 표시
//오류  char       e='ab'; //char는 한개의 문자만 저장이 가능
	    String     f="ab";
//오류	char       g = ''; //char는 한개의 문자만 저장이 가능. 빈문자 안됨 
	    char       g = ' ';
	    String     h = "";  //빈문자열 가능
	    
//오류  byte   var1 = 128; //byte형의 값의 범위 초과. -128 ~ 127까지 값만 저장 가능
		short  var2 = 128; //정상 
//오류  int    var3 = 128L; //128L값은 long 형 리터널.  
		long   var4 = 128L;//정상
//오류	float  var5 = 1.2; //1.2리터널값의 자료형은 double
//		float  var5 = (float)1.2;
		float  var5 = 1.2f;
		double var6 = 1.2; //정상 
	    float  var7 = (float)'1'; //정상 49.0 
	    System.out.println(var7);
	}
}