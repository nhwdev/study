package ex01_connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * 1. 드라이버 다운로드 : mvnrepository.com
 * 2. mariadb-java-client-3.5.7.jar 다운받기
 * 3. chap16_jdbc 프로젝트 폴더에 mariadb-java-client-3.5.7.jar 복사 붙여넣기
 * 4. Classpath 설정하기 : Properties -> Libraries -> Classpath -> AddJars -> mariadb-java-client-3.5.7.jar  
 * 	  => mariadb-java-client-3.5.7.jar 파일을 사용 할 준비
 */
public class MainEx01 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1. 드라이버 클래스를 메로리에 로드하기
		// org.mariadb.jdbc.Driver 클래스를 메모리에 로드
		Class.forName("org.mariadb.jdbc.Driver");
		// 2. DB와 JAVA를 연결하는 연결객체 생성하기
		// jdbc:mariadb://localhost:3306/gdjdb
		// => 현재 컴퓨터의 3306포트에 mariadb의 gdjdb 데이터베이스 사용
		// gduser : 사용자 ID
		// 4986 : 사용자 PW
		Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/gdjdb", "gduser", "4986");
		System.out.println("데이터베이스 연결 성공");
		// 3. SQL 명령문 전달
		Statement stmt = conn.createStatement();
		// 4. SQL 문장을 실행
		// rs : student 테이블의 모든 정보 전달 받은 객체
		ResultSet rs = stmt.executeQuery("select * from student");
		/// boolean rs.next() : 한개의 레코드 리턴
		while (rs.next()) {
			// rs.getString("studno"): studno 컬럼의 값을 문자열로 리턴
			System.out.print("학번: " + rs.getString("studno"));
			System.out.print(", 이름: " + rs.getString("name"));
			System.out.print(", 학년: " + rs.getString("grade"));
			System.out.println(", 학과코드: " + rs.getString("major1"));
		}
		rs.close();
		stmt.close();
		conn.close();
	}
}
