
package ex07_modifier;

/*
 * 생성자의 접근 제한자를 private 로 설정가능 => 객체의 갯수를 제한할 수 있음.
 * 객체의 갯수를 한개만 설정
 */
class SingleObject {
	private static SingleObject obj = new SingleObject(); // 객체화
	int value = 100;

	private SingleObject() {
	} // 생성자

	public static SingleObject getObject() {
		return obj;
	}
}

public class MainEx04_Singleton {
	public static void main(String[] args) {
//		SingleObject o = new SingleObject(); //생성자의 접근제한자가 private 이므로 생성자 접근 불가.객체생성불가
		SingleObject o1 = SingleObject.getObject();
		SingleObject o2 = SingleObject.getObject();
		System.out.println("o1.value=" + o1.value);
		System.out.println("o2.value=" + o2.value);
		o1.value = 200;
		System.out.println("o1.value=" + o1.value);
		System.out.println("o2.value=" + o2.value);
//		Math m = new Math(); //Math 클래스의 생성자가 private 임. 객체 생성 불가
							 // Math 클래스의 모든 멤버는 static 임.
	}
}
