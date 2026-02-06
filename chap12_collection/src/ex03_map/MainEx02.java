package ex03_map;

import java.util.HashMap;
import java.util.Map;

/* - Map 의 주요메서드 2 
 * size() : 요소갯수. (key,value) 쌍인 객체의 갯수
 * 값 get(Key) : key 값을 매개변수로 입력하면, key 에 해당하는 value 값을 리턴.
 *               key 값이 없는 경우 null 리턴
 * 값 remove(Key) : key 값을 매개변수로 입력하면, Map.Entry객체를 제거하고, value 값을 리턴
 *                  key 값이 없는 경우 null 리턴
 *              
 * Map.Entry<K,V> : (key,value)쌍인 객체의 자료형                          
 *      K getKey()   : (key,value)쌍인 객체 중 key 값 리턴
 *      V getValue() : (key,value)쌍인 객체 중 value 값 리턴
 *      
 * Value 값으로 Key 값 조회 방법은 없다.     
 */
public class MainEx02 {
	public static void main(String[] args) {
		String[] names = { "홍길동", "김삿갓", "이몽룡", "김삿갓" };
		int[] nums = { 1234, 4567, 2350, 9870 };
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < names.length; i++) {
			map.put(names[i], nums[i]);
		}
		System.out.println("map 요소의 갯수:" + map.size());
		System.out.println("홍길동의 전화번호:" + map.get("홍길동"));
		System.out.println("홍길순의 전화번호:" + map.get("홍길순"));
		System.out.println("홍길동의 정보 제거하기");
		System.out.println("제거된 전화번호:" + map.remove("홍길동"));
		System.out.println("map 요소의 갯수:" + map.size());
		System.out.println(map);
		System.out.println("홍길순의 정보 제거하기");
		System.out.println("제거된 전화번호:" + map.remove("홍길순"));
		System.out.println("map 요소의 갯수:" + map.size());
		System.out.println(map);
		System.out.println("keySet() 메서드를 이용하여 전체 정보 조회하기");
		for (String k : map.keySet()) {
			System.out.println("이름:" + k + "=" + map.get(k));
		}
		System.out.println("entrySet() 메서드를 이용하여 전체 정보 조회하기");
		for (Map.Entry<String, Integer> m : map.entrySet()) {
			System.out.println("이름:" + m.getKey() + ",전화번호:" + m.getValue());
		}
		System.out.println("value값들만 조회하기");
		for (Integer v : map.values()) {
			System.out.println("전화번호:" + v);
		}
	}
}