package ex06_file;

import java.io.File;

/*
 * File 클래스
 *  - 파일 또는 폴더의 정보를 관리하는 클래스
 *  - 생성자
 *    new File(String filename) : filename 파일(폴더) 객체 생성 
 *    new File(String folder, String filename) : 상위경로, 파일(폴더)
 *  - 존재하지 않는 파일도 관리 가능   
 *  - 경로구분자
 *     윈도우 : \, /도 가능
 *     리눅스등 그외 : /
 */
public class MainEx01_File {
	public static void main(String[] args) {
		System.out.println("File.separator:" + File.separator);
		String filePath = "c:/";
		File f1 = new File(filePath); // c:\ 폴더관리
		String[] files = f1.list(); // f1.list() : f1의 하위파일(폴더)의 이름 목록
		for (String f : files) {
			File f2 = new File(filePath, f); // f2: (c:\,파일이름)
			if (f2.isDirectory()) // f2 파일이 폴더?
				System.out.printf("%s:디렉토리\n", f);
			else    // f2 파일이 폴더아닌 경우. 파일인경우
					// f2.length() : 파일의 크기. 바이트수
				System.out.printf("%s:파일(%,d byte)\n", f, f2.length());
		}
	}
}