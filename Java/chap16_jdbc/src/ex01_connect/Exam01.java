package ex01_connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Exam01 {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/gdjdb", "gduser", "4986");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from professor");
		while (rs.next()) {
			System.out.print("번호: " + rs.getString("no"));
			System.out.print(", 이름: " + rs.getString("name"));
			System.out.print(", ID: " + rs.getString("id"));
			System.out.print(", 입사일: " + rs.getString("hiredate"));
			System.out.print(", 급여: " + rs.getString("salary"));
			System.out.print(", 보너스: " + rs.getString("salary"));
			System.out.println(", 학과코드: " + rs.getString("deptno"));
		}
	}
}
