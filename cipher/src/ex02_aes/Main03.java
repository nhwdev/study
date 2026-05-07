package ex02_aes;

public class Main03 {
    public static void main(String[] args) {
        String key = "abc123";
        CipherUtil.encryptFile("plain1.txt", "cipher.sec", key);
    }
}
