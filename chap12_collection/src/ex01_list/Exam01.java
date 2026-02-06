package ex01_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * 화면에서 정수를 입력받아. 입력받은 숫자의 합계,평균, 중간값 출력하기
 * 999 숫자가 입력된 경우 입력 종료.
 * 
 * 합계 : 전체 숫자의 합
 * 평균 : 합계/입력숫자의갯수
 * 중간값 : 정렬하기. 
 *         갯수가 홀수 : 가운데 인덱스 값       1 2 3 4 5 => 3 
 *         갯수가 짝수 : 가운데 2개 값의 평균.  1 2 3 4 => 2.5
 */
public class Exam01 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요(종료:999)");
		int sum = 0;
		while (true) {
			int num = scan.nextInt();
			if (num == 999)
				break;
			list.add(num);
			sum += num;
		}
		System.out.println(list + "=> 합계:" + sum);
		System.out.println(list + "=> 평균:" + (double) sum / list.size());
		List<Integer> list2 = new ArrayList<>(list);
		Collections.sort(list2);
		int midx = list.size() / 2; // 5/2=>2, 4/2=2
		if (list.size() % 2 == 0) { // 갯수가 짝수
			double median = (list2.get(midx - 1) + list2.get(midx)) / 2.0;
			System.out.println(list2 + "=> 중간값:" + median);
		} else { // 갯수가 홀수
			System.out.println(list2 + "=> 중간값:" + list2.get(midx));
		}
	}
}