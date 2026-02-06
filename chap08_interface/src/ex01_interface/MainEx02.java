package ex01_interface;

/*
 * 리턴 타입으로 사용되는 인터페이스
 */
class Lazerzet implements Printerable {
	String name = "레이저젯";

	@Override
	public void print() {
		System.out.println("레이저 프린터로 프린트 합니다.");
	}
}

class Inkzet implements Printerable {
	String name = "잉크젯";

	@Override
	public void print() {
		System.out.println("잉크젯 프린터로 프린트 합니다.");
	}
}

class PrinterManager {
	public static Printerable getPrint(String type) {
		if (type.equals("INK"))
			return new Inkzet();
		else
			return new Lazerzet();
	}
}

public class MainEx02 {
	public static void main(String[] args) {
		Printerable p = PrinterManager.getPrint("INK");
		p.print();
		p = PrinterManager.getPrint("LAZER");
		p.print();
	}
}