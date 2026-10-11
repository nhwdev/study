package ex03_synchronized;

/* 동기화영역
 *   1. 동기화블럭  : lock 객체를 소유한 스레드만 동기화영역 실행 가능
 *   2. 동기화메서드 : 메서드를 동기화 영역으로 설정. 
 *   3. Thread 에 safe 하다 로 표현함
 *   
 * 동기화 블럭
 * 1. synchronized 예약어 사용
 * 2. lock 객체는 모든 스레드가 공유하는 유일한 객체여야함 (공유객체여야함)
 * 3. lock 은 객체만 가능함. 기본자료형 변수는 lock 으로 사용불가
 */
class PrintThread2 extends Thread {
	char ch;
	static Integer lock = 0; // 공유객체
//	static int lock = 0; //기본형 변수는 사용안됨

	PrintThread2(char ch) {
		this.ch = ch;
	}

	public void run() {
		for (int i = 0; i < 20; i++) { // i=0
			synchronized (lock) { // 동기화블럭. 동기화영역(임계영역)
				for (int j = 0; j < 80; j++) {
					System.out.print(ch);
				}
				System.out.println();
			} // 동기화블럭 종료
		}
	}
}

public class MainEx02_block {
	public static void main(String[] args) {
		PrintThread2 t1 = new PrintThread2('A'); // r
		PrintThread2 t2 = new PrintThread2('B'); //
		PrintThread2 t3 = new PrintThread2('C'); //
		t1.start();
		t2.start();
		t3.start();
	}
}