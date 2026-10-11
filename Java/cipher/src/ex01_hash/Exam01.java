package ex01_hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.sql.*;
import java.util.Set;

// 테이블 생성: CREATE TABLE usercipher SELECT * FROM useraccount
// 비밀번호 컬럼 크기 변경: ALTER TABLE usercipher MODIFY COLUMN PASSWORD VARCHAR(300)
// usercipher에 userid를 기본키로 지정: ALTER TABLE usercipher ADD CONSTRAINT PRIMARY KEY(userid)
// useraccount 테이블을 읽어서, usercipher 테이브르이 password를 SHA-256 알고리즘의 해쉬값으로 저장하기
public class Exam01 {

    private static String getSha256(String plainText) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hash = md.digest(plainText.getBytes());
        // 변환된 16진수 문자열을 효율적으로 쌓아두기 위한 그릇 생성
        StringBuilder hexString = new StringBuilder();

        for (byte b : hash) {
            // 1. 0xff & b: 바이트(8비트) 데이터를 32비트 정수로 변환하면서
            //    음수일 경우 발생할 수 있는 비트 간섭을 방지 (부호 비트 제거)
            // 2. Integer.toHexString: 정수를 16진수 소문자 문자열로 변환 (예: 10 -> "a", 255 -> "ff")
            String hex = Integer.toHexString(0xff & b); // 0xff: 1111 1111 ? 순수한 데이터만 남기기 위한 마스크 작업
            // 16진수는 2자리(00~ff)가 한 세트인데, 값이 15 이하이면 한 자리("0"~"f")만 나옴
            // 이 경우 앞에 '0'을 붙여서 항상 2자리를 유지하도록 맞춤 (자릿수 패딩)
            if (hex.length() == 1) hexString.append('0');
            // 최종적으로 변환된 16진수 문자열을 StringBuilder에 추가
            hexString.append(hex);
        }
        // 결과: hexString.toString()을 호출하면 "5e884898da28..." 같은 64글자 해시 완성
        return hexString.toString();
    }

    public static  void main(String[] args) {
        String url = "jdbc:mariadb://localhost:3306/springdb"; // DB 정보에 맞게 수정
        String user = "user"; // DB 사용자
        String password = "4986"; // DB 암호

        String selectSql = "SELECT userid, password FROM useraccount";
        String insertSql = "INSERT INTO usercipher (userid, password) VALUES (?, ?)";

        try (
                Connection conn = DriverManager.getConnection(url, user, password);
                PreparedStatement selectStmt = conn.prepareStatement(selectSql);
                ResultSet rs = selectStmt.executeQuery();
                PreparedStatement insertStmt = conn.prepareStatement(insertSql)
        ) {
            while (rs.next()) {
                String userId = rs.getString("userid");
                String plainPassword = rs.getString("password");

                // 1. 암호화 수행
                String hashedPassword = getSha256(plainPassword);

                // 2. usercipher 테이블에 저장
                insertStmt.setString(1, userId);
                insertStmt.setString(2, hashedPassword);
                try {
                    insertStmt.executeUpdate();
                    System.out.println("User [" + userId + "] 의 비밀번호가 해싱되어 저장되었습니다.");
                } catch (SQLException e) {
                    if (e.getErrorCode() == 1062) { // 1062는 MariaDB 중복 에러 코드
                        System.err.println("User [" + userId + "] 는 이미 존재하여 건너뜁니다.");
                    } else {
                        throw e;
                    }
                }
            }

        } catch (SQLException | NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
