package ex01_connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/*
 * jdbctest1 테이블에 데이터 추가하기
 * 
 */
public class MainEx03_update {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/gdjdb", "gduser", "4986");
		Statement stmt = conn.createStatement();
		String sql = "insert into jdbctest1 values(1, '홍길동')";
		int result = stmt.executeUpdate(sql);
		System.out.println("result=" + result);
		ResultSet rs = stmt.executeQuery("select * from jdbctest1");
		while(rs.next()) {
			System.out.print("번호: " + rs.getString(1));
			System.out.println(", 이름: " + rs.getString(2));
		}
	}
}
