package ex01_interface;

/*
 * 1. java project 생성 : chap08_interface
 * 2. package 생성 : ex01_interface
 * 3. class 생성 : MainEx01
 */
/*
 * 인터페이스
 * 1. 인터페이스의 멤버는 상수, 추상메서드, default 메서드, static 메서드만 가능함
 * 2. 인터페이스의 멤버의 접근제한자는 public 만 가능. 생략 가능
 *    상수 : public static final 만 가능함
 *    추상메서드 : public abstract
 *    default 메서드 : public. 구현부 가능 
 *    static 메서드 : public. 구현부 가능
 * 3. 객체화불가 => 구현클래스의 객체화로 객체화 가능
 * 4. 클래스와 인터페이스의 관계는 구현(implements)으로 표현함
 *    인터페이스를 구현한 클래스를 구현클래스라 함 
 * 5. 인터페이스간의 상속은 다중상속이 가능함. extends 예약어로 인터페이스간의 상속을 표현함   
 */
interface Printerable {
	int INK = 100; // 상수

	public void print(); // 추상메서드
}

interface Scannerable {
	void scan(); // 추상메서드
}

interface Faxable {
	String FAX_NO = "02-111-2222";

	void send(String no);

	void receive(String no);
}

interface Complexerable extends Printerable, Scannerable, Faxable {
}

//Complexerable 인터페이스를 구현한 구현 클래스
class Complexer implements Complexerable {
	int ink;

	Complexer() {
		this.ink = INK;
	}

	@Override
	public void print() {
		System.out.println("프린트로 출력합니다. 남은 잉크량:" + --ink);
	}

	@Override
	public void scan() {
		System.out.println("이미지를 스캔합니다.");
	}

	@Override
	public void send(String no) {
		System.out.println(FAX_NO + "에서 " + no + "로 FAX를 보냅니다.");
	}

	@Override
	public void receive(String no) {
		System.out.println(FAX_NO + "에서 " + no + "로 FAX를 받았습니다.");
	}
}

public class MainEx01 {
	public static void main(String[] args) {
		Complexer c = new Complexer();
		c.print();
		System.out.println("남은 잉크량:" + c.ink);
		System.out.println("초기 잉크량:" + c.INK);
		System.out.println("초기 잉크량:" + Complexer.INK);
		System.out.println("초기 잉크량:" + Complexerable.INK);
		System.out.println("초기 잉크량:" + Printerable.INK);
//		c.INK = 200; //상수값이므로 변경 불가
		System.out.println("FAX_NO:" + Complexer.FAX_NO);
		System.out.println("FAX_NO:" + Complexerable.FAX_NO);
		System.out.println("FAX_NO:" + Faxable.FAX_NO);
		c.scan();
		c.send("02-2222-3333");
		c.receive("02-2222-3333");
		System.out.println("Complexerable 참조형으로 참조 : ");
		if (c instanceof Complexerable) {
			Complexerable co = c; // 자동형변환가능
//			System.out.println("남은 잉크량:" + co.ink); //ink 멤버는 Complexer 클래스의 멤버임. 
			co.print();
			co.scan();
			co.send("02-2222-3333");
			co.receive("02-2222-3333");
		}
		System.out.println("Printerable 참조형으로 참조 : ");
		if (c instanceof Printerable) {
			Printerable p = c; // 자동형변환가능
//			System.out.println("남은 잉크량:" + p.ink); //ink 멤버는 Complexer 클래스의 멤버임. 
			p.print();
//			p.scan(); //Scannerable 의 멤버임
//			p.send("02-2222-3333");  // Faxable 의 멤버임
//			p.receive("02-2222-3333"); // Faxable 의 멤버임
		}
		System.out.println("Scannerable 참조형으로 참조 : ");
		if (c instanceof Scannerable) {
			Scannerable s = c; // 자동형변환가능
//			System.out.println("남은 잉크량:" + s.ink); // ink 멤버는 Complexer 클래스의 멤버임. 
//			s.print(); // Printerable의 멤버임
			s.scan(); // Scannerable 의 멤버임
//			s.send("02-2222-3333");  // Faxable 의 멤버임
//			s.receive("02-2222-3333"); // Faxable 의 멤버임
		}
		System.out.println("Faxable 참조형으로 참조 : ");
		if (c instanceof Faxable) {
			Faxable f = c; // 자동형변환가능
//			System.out.println("남은 잉크량:" + f.ink); // ink 멤버는 Complexer 클래스의 멤버임. 
//			f.print(); // Printerable 의 멤버임
//			f.scan(); // Scannerable 의 멤버임
			f.send("02-2222-3333"); // Faxable 의 멤버임
			f.receive("02-2222-3333"); // Faxable 의 멤버임
		}
	}
}