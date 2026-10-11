package ex02_preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * 교수테이블에서 학과별 교수의 목록 출력하기
 * 	출력컬럼 : 교수번호, 이름, 직급, 급여, 보너스, 부서코드, 입사일
 */
public class Exam01 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/gdjdb", "gduser", "4986");
		// Statement > PreparedStatement : SQL구문실행객체
		PreparedStatement pstmt1 = conn.prepareStatement // 중복이 없는 NULL이 아닌 "deptno"의 값을 호출
		("select distinct deptno from professor where deptno is not null");
		PreparedStatement pstmt2 = conn.prepareStatement("select * from professor where deptno = ?");
		ResultSet rs1 = pstmt1.executeQuery();
		while (rs1.next()) {
			int deptno = rs1.getInt(1); // 부서코드 1개
			pstmt2.setInt(1, deptno); // 1번째 '?'에 값을 설정
			System.out.println("=====" + deptno);
			ResultSet rs2 = pstmt2.executeQuery();
			while (rs2.next()) {
				System.out.printf("교수번호: %s, 이름: %s, 직급: %s, 급여: %d, 보너스: %d, 부서코드: %d, 입사일: %s\n", rs2.getString("no"),
						rs2.getString("name"),
						rs2.getString("position"),
						rs2.getInt("salary"),
						rs2.getInt("bonus"),
						rs2.getInt("deptno"),
						rs2.getDate("hiredate"));
			}
		}
	}
}