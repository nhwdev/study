package ex02_aes;

import java.sql.*;

/*
 * 1. usercipher 테이블의 email 컬럼의 크기를 2000으로 변경하기: ALTER TABLE usercipher MODIFY COLUMN email VARCHAR(2000)
 * 2. key userid의 해시값(SHA-256)의 16자리로 설정하기
 *
 * useraccount 테이블의 email을 읽어서 usercipher 테이블에 암호화 하여 저장
 */
public class Exam01 {
    public static void main(String[] args) {
        String url = "jdbc:mariadb://localhost:3306/springdb"; // DB 정보에 맞게 수정
        String user = "user"; // DB 사용자
        String password = "4986";

        String selectSql = "SELECT userid, email FROM useraccount";
        String updateSql = "Update usercipher SET email = ? WHERE userid = ?";

        try(Connection connection = DriverManager.getConnection(url,user,password);
            PreparedStatement selectStmt = connection.prepareStatement(selectSql);
            ResultSet rs = selectStmt.executeQuery();
            PreparedStatement updateStmt = connection.prepareStatement(updateSql)
        ){
            int count = 0;
            while(rs.next()) {
                String userId = rs.getString("userid");
                String plainEmail = rs.getString("email");

                if (plainEmail == null) continue; // 이메일이 없으면 패스

                String encryptedEmail = CipherUtil.encrypt(plainEmail, CipherUtil.makehash(userId));

                updateStmt.setString(1, encryptedEmail);
                updateStmt.setString(2, userId);

                int result = updateStmt.executeUpdate();

                // 만약 업데이트된 행이 없다면(해당 유저가 usercipher에 없다면) 새로 INSERT 해야 할 수도 있습니다.
                if (result == 0) {
                    System.out.println("[" + userId + "]가 usercipher 테이블에 없어 저장을 건너뛰었습니다.");
                } else {
                    System.out.println("[" + userId + "]의 이메일 암호화: " + encryptedEmail);
                    count++;
                }
            }System.out.println("총 " + count + "건의 이메일 암호화 처리가 완료되었습니다.");
        } catch (SQLException e){
            e.printStackTrace();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
