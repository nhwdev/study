package ex03_map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Map 인터페이스 
 *  - (key,value) 쌍인 객체들의 모임
 *  - key 는 중복불가
 *  - 구현클래스
 *    HashMap  : (key,value)의 쌍인 객체. 순서모름.
 *    HashTable: (key,value)의 쌍인 객체. 순서모름. 이전 클래스
 *    TreeMap  : (key,value)의 쌍인 객체. key 기준 정렬됨
 *  - 주요메서드
 *    put(key,value) : map 객체에 데이터 추가. 
 *                     key 가 존재하는 경우 value 값 수정 
 *    Set keySet() : key 값들만 조회                 
 *    Collection values() : value 값들만 조회
 *    Set<Map.Entry<K,V>> entrySet() : (key,value) 쌍인 객체들로 조회
 *    
 *  - Map.Entry<K,V> : (key,value) 쌍인 객체의 자료형
 *                     Map 인터페이스의 내부인터페이스형      
 */
public class MainEx01 {
	public static void main(String[] args) {
		String[] names = { "홍길동", "김삿갓", "이몽룡", "김삿갓" };
		int[] nums = { 1234, 4567, 2350, 9870 };
		Map<String, Integer> map = new HashMap<>();
		// map = {"홍길동"=1234,"김삿갓"=9870,"이몽룡"=2350}
		for (int i = 0; i < names.length; i++) {
			map.put(names[i], nums[i]); // 객체 추가,수정
		}
		System.out.println(map);

		System.out.println("key값들만 조회하기");
		Set<String> keySet = map.keySet();
		for (String k : keySet)
			System.out.print(k + ",");
		System.out.println();
		System.out.println(keySet);

		System.out.println("value 값들만 조회");
		Collection<Integer> values = map.values();
		System.out.println(values);

		System.out.println("key:value 쌍인 값들 조회");
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		System.out.println(entrySet);
	}
}