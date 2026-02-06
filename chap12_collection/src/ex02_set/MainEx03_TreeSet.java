package ex02_set;

import java.util.Set;
import java.util.TreeSet;

/*
 * TreeSet : 중복불가. 정렬됨
 *  중복검증 : 정렬관련메서드(compareTo(),compare())의 리턴값이 0인경우 중복인식
 */
public class MainEx03_TreeSet {
	public static void main(String[] args) {
		Set<String> set = new TreeSet<>();
		set.add("abc");set.add("align");set.add("bat");
		set.add("azz");set.add("aZZ");
		set.add("car");set.add("Car");
		System.out.println(set); // 정렬되어 출력.
		// 대소문자 상관없이 정렬
		Set<String> set2 = new TreeSet<>((s1, s2) -> s1.compareToIgnoreCase(s2));
		// "car".compareToIgnoreCase("Car") => 0 리턴. TreeSet에서는 중복객체로 인식
		// set2 : abc,align,azz,bat,car
		set2.add("abc");set2.add("align");set2.add("bat");
		set2.add("azz");set2.add("aZZ");
		set2.add("car");set2.add("Car");
		System.out.println(set2);
		Set<String> set3 = new TreeSet<>((s1, s2) -> 0);
		set3.add("abc");set3.add("align");set3.add("bat");
		set3.add("azz");set3.add("aZZ");
		set3.add("car");set3.add("Car");
		System.out.println(set3); // 정렬되어 출력.
	}
}