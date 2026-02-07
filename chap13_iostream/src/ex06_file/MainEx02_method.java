
package ex06_file;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

/*
 * File 클래스의 주요 메서드
 *  - String[] list() : 하위 파일 목록 리턴
 *  - String getAbsolutePath() : 절대 경로 리턴
 *  - boolean mkdir() : 폴더 생성. 한단계 폴더만 생성
 *  - boolean mkdirs() : 폴더 생성. 여러단계 폴더 생성
 *  - boolean createNewFile() : 파일 생성. IOException 예외처리 필수. 
 *  - String getName() : 파일 이름 리턴
 *  - long length()  : 파일의 크기. 바이트단위로 리턴
 *  - boolean renameTo(File f) : 현재파일을 f 파일로 변경 
 *  - long lastModified() : 파일 최종 수정일자 밀리초로 리턴
 *  - boolean delete() : 파일 삭제
 *  - boolean exist() : 파일 존재 여부
 *  - boolean isDirectory() : 디렉토리 여부
 *  - boolean isFile()  : 파일 여부
 *  - boolean isHidden() : 숨긴파일 여부
 */
public class MainEx02_method {
	public static void main(String[] args) throws IOException {
		File f1 = new File("c:/temp1"); // temp1 폴더(파일)이 없음
		// f1.getAbsolutePath() : 절대 경로
		// f1.mkdir() : 폴더 생성
		System.out.printf("%s폴더 생성:%b\n", f1.getAbsolutePath(), f1.mkdir());
		File f2 = new File("c:/temp1/test.txt"); // 파일없음.
		// f2.createNewFile() :파일 생성
		System.out.printf("%s 파일 생성:%b\n", f2.getAbsolutePath(), f2.createNewFile());
		System.out.printf("파일 이름:%s,파일크기:%d\n", f2.getName(), f2.length());
		File f3 = new File("c:/temp1/test2.txt");
		if (f3.exists()) {
			System.out.println(f3.getName() + "파일은 존재함");
		} else {
			System.out.println(f3.getName() + "파일은 없음");
		}
		// f2.renameTo(f3) : f2 파일을 f3파일로 변경.
		System.out.printf("%s->%s 이름변경:%b\n", f2.getName(), f3.getName(), f2.renameTo(f3));
		System.out.println("파일의 최종 수정시간:" + f3.lastModified());
		String lastday = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(f3.lastModified());
		System.out.printf("%s파일의 최종 수정 시간:%s\n", f3.getName(), lastday);
		System.out.printf("%s 파일 삭제:%b\n", f3.getName(), f3.delete());
	}
}
