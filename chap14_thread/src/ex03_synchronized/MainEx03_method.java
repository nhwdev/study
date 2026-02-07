package ex03_synchronized;

/*
 * 동기화 메서드 방식
 * 1. 메서드를 동기화영역으로 사용
 * 2. 메서드의 선언부에 synchronized 예약어 사용
 * 3. 동기화 메서드도 공유객체의 메서드여야함. 
 * 
 * 메서드가 동기화된 클래스
 * StringBuffer(동기화) StringBuilder
 * Vector(동기화)       ArrayList
 * HashTable(동기화)    HashMap
 */
public class MainEx03_method {
	public static void main(String[] args) {
		Printer prt = new Printer(); // 공유객체
		PrintThread3 t1 = new PrintThread3(prt, 'A');
		PrintThread3 t2 = new PrintThread3(prt, 'B');
		PrintThread3 t3 = new PrintThread3(prt, 'C');
		t1.start();t2.start();t3.start();
	}
}

class PrintThread3 extends Thread {
	Printer prt;
	char ch;

	PrintThread3(Printer prt, char ch) {
		this.prt = prt;
		this.ch = ch;
	}

	public void run() {
		for (int i = 0; i < 20; i++) {
			prt.printChar(ch);
		}
	}
}

class Printer { // 공유객체
	public synchronized void printChar(char ch) { // 동기화메서드.
		for (int i = 0; i < 80; i++)
			System.out.print(ch);
		System.out.println();
	}
}