package test0106;
/*
 * 다음 소스는 컴파일 오류가 발생한다. 
 * 결과가 "Tested" 가 출력되도록 프로그램을 수정하기
 */
interface Beta {

	String testIt();}

class Alpha implements Beta {
	@Override
	public String testIt() {
		return "Tested";
	}
}
class Gamma implements Beta {
	@Override
	public String testIt() {
		return "Gamma";
	}
}
public class Test01 {
	static Beta getIt() {
		return new Alpha();
	}
	public static void main(String[] args) {
		Beta b = getIt();
		System.out.println(b.testIt());
	}
}
