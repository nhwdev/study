package ex02_aes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

// usercipher 테이블의 email을 복호화 하기
public class Exam02 {
    public static void main(String[] args) throws IOException {
        String url = "jdbc:mariadb://localhost:3306/springdb"; // DB 정보에 맞게 수정
        String user = "user"; // DB 사용자
        String password = "4986";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ID를 입력하세요.");
        String userId = br.readLine();

        String selectSql = "SELECT email FROM usercipher WHERE userid=?";
// 1. Connection과 PreparedStatement만 자원 선언에 넣습니다.
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement selectStmt = connection.prepareStatement(selectSql)) {

            // 2. 쿼리를 실행하기 전에 물음표(?)를 먼저 채웁니다. (매우 중요!)
            selectStmt.setString(1, userId);

            // 3. 그 다음 결과를 받아옵니다.
            try (ResultSet rs = selectStmt.executeQuery()) {
                if(rs.next()) {
                    String encryptedEmail = rs.getString("email");

                    if (encryptedEmail == null) {
                        System.out.println("이메일이 존재하지 않습니다.");
                        return;
                    }

                    // 4. 암호화할 때 썼던 동일한 키(myKey)로 복호화합니다.
                    String decryptedEmail = CipherUtil.decrypt(encryptedEmail, CipherUtil.makehash(userId));

                    System.out.println("[" + userId + "]의 이메일 복호화: " + decryptedEmail);
                } else {
                    System.out.println("해당 ID를 찾을 수 없습니다.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
