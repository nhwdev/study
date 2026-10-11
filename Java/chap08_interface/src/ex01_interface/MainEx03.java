package ex01_interface;

/*
 * 매개변수로 사용되는 인터페이스
 */
class Unit {
	int hp;
	final int MAX;

	Unit(int hp) {
		this.hp = hp;
		MAX = hp;
	}
}

interface Repairable {
}

class Tank extends Unit implements Repairable {
	Tank() {
		super(150);
	}

	public String toString() {
		return "Tank";
	}
}

class Marine extends Unit {
	Marine() {
		super(60);
	}

	public String toString() {
		return "Marine";
	}
}

class SCV extends Unit implements Repairable {
	SCV() {
		super(100);
	}

	void repair(Repairable r) { // 수리 기능. Repairable의 구현클래스의 객체만 가능
		if (r instanceof Unit) {
			Unit u = (Unit) r;
			System.out.println(r.toString() + "수리완료. hp=" + u.hp);
		}
	}

	public String toString() {
		return "SCV";
	}
}

class A implements Repairable {
}

public class MainEx03 {
	public static void main(String[] args) {
		Tank t = new Tank();
		Marine m = new Marine(); // Repairable 형으로 형변환 불가.
		SCV s = new SCV();
		s.repair(t);
//		s.repair(m); //repair 대상 아님
		s.repair(s);
		A a = new A();
		s.repair(a);
	}
}