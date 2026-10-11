package ex04_filterstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
 * 예외발생한 내용을 error.log 파일에 출력하기
 * error.log파일의 내용을 계속 추가하기
 * 
 * [파일의 출력형식]
 * 2026-01-19 15:22:15 => For input String:"a" 
 */
public class Exam02_PrintStream {
	public static void main(String[] args) throws FileNotFoundException {
		try {
			String str = "a";
			System.out.println(Integer.parseInt(str));
		} catch (NumberFormatException e) {
			PrintStream ps = new PrintStream(new FileOutputStream("error.log", true));
			/*
			 * SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			 * ps.println(sf.format(new Date()) + "=>" +e.getMessage() );
			 */
			LocalDateTime now = LocalDateTime.now();
			DateTimeFormatter fm = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
			ps.println(now.format(fm) + "=>" + e.getMessage());
			e.printStackTrace(ps);
			ps.close();
		}
	}
}