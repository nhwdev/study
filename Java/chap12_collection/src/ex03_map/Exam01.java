package ex03_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * 1. 대한민국:서울,캐나다:오타와,영국:런던을 저장하는 HashMap 객체 생성하기
 * 2. 화면에서 나라이름을 입력받아서 수도 출력하기
 *    등록된 나라가 아닌 경우 "등록되지 않은 나라입니다." 메세지 출력.
 *    "종료" 문자가 입력될때 까지 계속 입력받기
 * 3. 등록된 나라가 아닌경우. 수도를 입력받아 map 에 등록하기
 * 4. 프로그램 종료전 등록된 내용을 출력하기 
 */
public class Exam01 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("대한민국", "서울");
		map.put("캐나다", "오타와");
		map.put("영국", "런던");
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("나라이름을 입력하세요(종료:종료)");
			String n = scan.next();
			if (n.equals("종료"))
				break;
			String c = map.get(n);
			if (c != null)
				System.out.println(n + "의 수도:" + c);
			else {
				System.out.println("등록되지 않는 나라입니다.");
				System.out.println(n + "나라의 수도를 입력하세요");
				c = scan.next();
				map.put(n, c);
			}
		}
		System.out.println("등록된 정보:" + map.entrySet());
		System.out.println("등록된 나라:" + map.keySet());
		System.out.println("등록된 수도:" + map.values());
	}
}