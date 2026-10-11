package ex04_method;

/*
 * InterrputedException 예외 발생 : interrupt() 메서드
 * 
 * 스레드에서 사용되는 주요 메서드
 * 1. start() : 스택을 병렬화. run() 메서드 호출
 *              new() 상태 -> Runnable 상태로 변경
 * 2. run() : 스레드가 실행하는 메서드. 오버라이딩 필요.
 *            실행중인 상태 : Running 상태             
 * 3. setDaemon(boolean) : 데몬스레드로 설정. new 상태에서 설정해야함.    
 * 4. sleep(밀리초) : 밀리초 동안 대기 상태
 * 5. setPriority(1~10) : 우선 순위 설정
 * 6. join() : 스레드가 종료할때 까지 메서드가 대기.
 * 7. interrupt() : 대기중인 스레드에 InterruptedException 예외 발생시킴. 
 * 8. yield() : Running 상태에서 Runnable 상태로 변경        
 * 9. stop() : Running 상태에서 종료상태 변경. 스레드 강제 종료. 사용하지 않도록 권장.
 */
class InterruptThread extends Thread {
	public void run() {
		System.out.println("자고 있습니다. 깨우지 마세요");
		try {
			sleep(1000000); // 예외발생시 sleep 에서 빠짐
		} catch (InterruptedException e) {
			System.out.println("왜 깨우니?");
			e.printStackTrace();
		}
	}
}

public class MainEx03_interrupt {
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new InterruptThread();
		t1.start();
		Thread.sleep(2000); // 2초
		t1.interrupt(); // t1이 sleep 중인 경우 InterruptedException을 발생시킴
	}
}