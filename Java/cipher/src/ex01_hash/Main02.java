package ex01_hash;

import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.*;

/*
 * 콘솔에서 아이디, 비밀번호 입력받기
 * usercipher 테이블 조회하기
 *  - 아이디가 없으면 아이디 없음 출력
 *  - 비밀번호 오류 : 비밀번호 틀림
 *  - 일치 : 반갑습니다. username님 출력
 */
public class Main02 {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mariadb://localhost:3306/springdb";
        String user = "user";
        String password = "4986";
        Connection conn = DriverManager.getConnection(url, user, password);
        PreparedStatement pstmt = conn.prepareStatement("SELECT password, username FROM usercipher WHERE userid=?");
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw.write("아이디와 비밀번호를 입력하세요.");
        bw.newLine();
        bw.flush();
        bw.write("아이디: ");
        bw.flush();
        String id = br.readLine();
        bw.write("비밀번호: ");
        bw.flush();
        String pw = br.readLine();
        pstmt.setString(1, id);
        ResultSet rs = pstmt.executeQuery();
        if(rs.next()){
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            StringBuilder hashPassword = new StringBuilder();
            byte[] plain = pw.getBytes();
            byte[] hash = md.digest(plain);
            for(byte b : hash) hashPassword.append(String.format("%02x", b));
            if (rs.getString("password").equals(hashPassword.toString())) {
                System.out.println("반갑습니다. " + rs.getString("username") + "님");
            } else {
                System.out.println("비밀번호를 확인하세요.");
            }
        } else {
            System.out.println("아이디를 확인하세요.");
        }
        bw.close();
        br.close();
    }
}
