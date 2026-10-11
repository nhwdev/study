package ex02_preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/*
 * PreparedStatement 인터페이스
 * 	- Statement 의 하위 인터페이스
 *  - SQL 문장을 미리 DataBase에 전송함. 번역 후 실행 준비 완료
 *  - 파라미터 값 전달 : ? 표시
 *  	executeUpdate(), excuteQuery() 실행 전에 반드시 파라미터값을 설정.
 *  - 보안 유리한 객체.
 */
public class MainEx01 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/gdjdb", "gduser", "4986");
		PreparedStatement pstmt = conn.prepareStatement
				("select * from student where grade = ?"); // DataBase에서 미리 번역하여 대기
		for (int i = 1; i <= 4; i++) {
			pstmt.setInt(1, i); // SQL 문장의 첫번째 ?의 값을 i 값을 대입
//			pstmt.setInt(1, "1학년"); // 오류발생
			System.out.printf("\n=====%d학년=====\n", i);
			ResultSet rs = pstmt.executeQuery(); // 미리 전달된 SQL(15라인) 실행
			while (rs.next()) {
				System.out.printf("학번: %7s, 이름: %-5s, 학년: %3d, 키: %5.2f, 몸무게: %5.2f, 학과코드: %-5s\n",
						rs.getString("studno"),
						rs.getString("name"),
						rs.getInt("grade"),
						rs.getDouble("height"),
						rs.getDouble("weight"),
						rs.getString("major1"));
			}
		}
	}
}
