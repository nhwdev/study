package ex03_synchronized;

// 동기화 되지 않은 경우
class PrintThread1 extends Thread {
	char ch;

	PrintThread1(char ch) {
		this.ch = ch;
	}

	public void run() {
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 80; j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}

/*
 * BBBCCCCCCCCCCCCCCCCCAAAAAAAAAAAABBBBBBBBBBB
 */
public class MainEx01_non_synchronized {
	public static void main(String[] args) {
		PrintThread1 t1 = new PrintThread1('A'); //
		PrintThread1 t2 = new PrintThread1('B'); // r
		PrintThread1 t3 = new PrintThread1('C'); //
		t1.start();
		t2.start();
		t3.start();
	}
}