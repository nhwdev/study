package ex01_hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.Set;

public class Main01 {
    public static void main(String[] args) throws NoSuchAlgorithmException, IOException {
        byte[] plain = null;
        byte[] hash = null;
        Set<String> algorithms = Security.getAlgorithms("MessageDigest");
        System.out.println(algorithms);
        String[] algo = new String[]{"MD5", "SHA-1", "SHA-256", "SHA-512"};
        System.out.println("해쉬값을 구할 문자열을 입력하세요.");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        plain = str.getBytes();

        for (String al : algo) {
            MessageDigest md = MessageDigest.getInstance(al);
            hash = md.digest(plain);
            System.out.println(al + "해쉬값 크기: " + hash.length * 8 + "bits");
            System.out.print("해쉬값: ");
            for (byte b : hash) {
                System.out.printf("%02X", b);
            }
            System.out.println();
        }
    }
}