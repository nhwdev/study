package ex03_map;

import java.util.TreeMap;

/*
 * TreeMap : key 값을 기준으로 정렬됨
 */
public class MainEx04_TreeMap {
	public static void main(String[] args) {
		TreeMap<String, Book> map = new TreeMap<>();
		map.put("홍길동전", new Book("홍길동전", "허균", 10000));
		map.put("춘향전", new Book("춘향전", "미상", 5000));
		map.put("구운몽", new Book("구운몽", "김만중", 15000));
		System.out.println(map);
		System.out.println("첫번째 key:" + map.firstKey());
		System.out.println("첫번째 entry:" + map.firstEntry());
		System.out.println("마지막 key:" + map.lastKey());
		System.out.println("마지막 entry:" + map.lastEntry());
		System.out.println("춘향전 앞의 book :" + map.lowerEntry("춘향전"));
		System.out.println("춘향전 뒤의 book :" + map.higherEntry("춘향전"));
		System.out.println("춘향 앞쪽의 book :" + map.floorEntry("춘향"));
		System.out.println("춘향 뒤쪽의 book :" + map.ceilingEntry("춘향"));
	}
}