package ex03_method;

/*
 * 매개변수 예제
 * 
 * call by value : 매개변수를 값을 전달방식 
 */
class Value {
	int val;
}

public class MainEx03_Parameter {
	public static void main(String[] args) {
		Value v = new Value();
		v.val = 100;
		// change1(v.val); //기본자료형 매개변수인 경우 값을 조회 가능.
		// 객체화 필요
		MainEx03_Parameter m = new MainEx03_Parameter();
		m.change1(v.val);
		System.out.println("change1 이후:" + v.val);
		change2(v); // 참조자료형 매개변수인 경우 값을 조회,변경 가능
		System.out.println("change2 이후:" + v.val);
	}

	void change1(int val) { // static 제어자가 없는 경우 인스턴스 멤버
		val += 100;
		System.out.println("change1() 에서 val 출력:" + val);
	}

	static void change2(Value v) {
		v.val += 100;
		System.out.println("change2() 에서 val 출력:" + v.val);
	}
}