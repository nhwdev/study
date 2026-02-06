package ex04_math;

/*
 * Math 클래스 : 수치계산 기능
 * - final클래스
 * - 생성자의 접근제한자가 private : 객체 생성 불가
 *   => 모든 멤버가 static 인 클래스 멤버.
 * - 두개의 상수
 *    Math.PI : 원주율
 *    Math.E : 자연로그  
 */
public class MainEx01 {
	public static void main(String[] args) {
		// 절대값 : abs()
		System.out.println(Math.abs(5));
		System.out.println(Math.abs(-5));
		System.out.println(Math.abs(3.14));
		System.out.println(Math.abs(-3.14));
		// 근사정수 : 가까운 정수
		// ceil : 큰 근사정수
		System.out.println(Math.ceil(5.4)); // 6.0
		System.out.println(Math.ceil(-5.4));// -5.0
		// floor : 작은 근사정수
		System.out.println(Math.floor(5.4)); // 5.0
		System.out.println(Math.floor(-5.4));// -6.0
		// rint : 근사정수
		System.out.println(Math.rint(5.4)); // 5.0
		System.out.println(Math.rint(-5.4));// -5.0

		// 큰값(max),작은값(min)
		System.out.println(Math.max(5, 4));
		System.out.println(Math.max(5.3, 5.4));
		System.out.println(Math.min(5, 4));
		System.out.println(Math.min(5.3, 5.4));

		// round : 반올림
		System.out.println(Math.round(5.4));
		System.out.println(Math.round(5.5));

		// random : 난수. 임의의 수. 0 <= x < 1.0
		System.out.println(Math.random());

		// 삼각함수 : sin, cos, tan
		// 단위 : Radians임. Degrees 단위 아님
		System.out.println(Math.sin(Math.PI / 2)); // 90도
		System.out.println(Math.cos(Math.PI / 3)); // 60도
		System.out.println(Math.tan(Math.PI / 4)); // 45도
		System.out.println(Math.toDegrees(Math.PI / 2)); // 라디안 => Degress로 변경
		System.out.println(Math.toRadians(180)); // 라디안 <= Degress로 변경
		System.out.println(Math.sin(Math.toRadians(90))); // 90도

		// log 함수
		System.out.println(Math.log(Math.E));

		// 제곱근
		System.out.println(Math.sqrt(25)); // 5.0

		// 제곱
		System.out.println(Math.pow(5, 3)); // 5*5*5
	}
}