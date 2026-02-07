package ex07_properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/*
 * Properties 클래스
 *  - HashTable의 하위 클래스. Map 객체
 *    <String,String> 클래스임 => 제네릭 표현 불가
 *  - 주요 메서드
 *     load(FileInputStream) : 파일에서 key=value 의 데이터를 Map 객체로 로드.
 *     store(FileOutputStream,String ) : Properties 객체의 내용을 FileOutputStream의 파일의 내용으로 저장
 *                                       String 의 내용은 주석으로 첫줄에 출력됨.
 *  properties 파일
 *   - 환경설정에서 사용되는 파일.
 *   - #으로 시작하는 이후의 내용은 주석임.                                
 */
public class MainEx01 {
	public static void main(String[] args) throws IOException {
		Properties pr = new Properties();
		FileInputStream fis = new FileInputStream("a.properties");
		pr.load(fis); // a.properties 파일을 읽어서 왼쪽은 Key, 오른쪽은 Value 로 저장
		System.out.println(pr);
		pr.put("kor", "80");
		pr.put("eng", "90");
		pr.put("math", "85");
		System.out.println(pr);
		pr.store(new FileOutputStream("b.properties"), "#save");
	}
}
