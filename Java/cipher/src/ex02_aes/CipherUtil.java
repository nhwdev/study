package ex02_aes;

import java.io.*;
import java.security.*;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.*;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class CipherUtil {
    // 암호화/복호화 과정에서 사용할 랜덤 키를 임시 저장하는 변수
    private static byte[] randomKey;

    // 초기화 벡터(IV): CBC 모드 암호화 시 첫 블록의 변조를 위해 필요한 16바이트 난수값
    private final static byte[] iv = new byte[]{
            (byte) 0x8E, 0x12, 0x39, (byte) 0x90, 0x07, 0x72, 0x6F, (byte) 0x5A,
            (byte) 0x8E, 0x12, 0x39, (byte) 0x90, 0x07, 0x72, 0x6F, (byte) 0x5A};

    // 실제 암복호화 기능을 수행하는 엔진 객체
    static Cipher cipher;

    static {
        try {
            /*
             * AES: 사용할 알고리즘 (고급 암호화 표준)
             * CBC: 블록 암호화 모드. 이전 블록의 암호 결과가 다음 블록에 영향을 줌 (IV 필수)
             * PKCS5Padding: 데이터가 블록 크기(16바이트)에 모자랄 때 부족한 만큼 숫자로 채우는 방식
             */
            cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 128비트(16바이트) 크기의 랜덤한 AES 비밀키를 자동 생성하는 함수
    public static byte[] getRandomKey(String algo) throws NoSuchAlgorithmException {
        KeyGenerator keyGen = KeyGenerator.getInstance(algo);
        keyGen.init(128);
        SecretKey key = keyGen.generateKey();
        return key.getEncoded(); // 키의 바이트 배열 반환
    }

    // [문자열 암호화] 랜덤키 생성 -> 평문을 암호화하여 16진수 문자열로 반환
    public static String encrypt(String plain) {
        byte[] cipherMsg = new byte[1024];
        try {
            randomKey = getRandomKey("AES"); // 매번 새로운 키 생성
            Key key = new SecretKeySpec(randomKey, "AES"); // 바이트를 AES 키 객체로 변환
            AlgorithmParameterSpec paramSpec = new IvParameterSpec(iv); // IV 설정

            cipher.init(Cipher.ENCRYPT_MODE, key, paramSpec); // 암호화 모드로 엔진 가동
            cipherMsg = cipher.doFinal(plain.getBytes()); // 평문을 바이트로 바꿔 암호화 실행
        } catch (Exception e) {
            e.printStackTrace();
        }
        return byteToHex(cipherMsg).trim(); // 바이트 암호문을 사람이 읽게 16진수 텍스트로 변환
    }

    // [문자열 복호화] 저장된 randomKey를 이용해 16진수 암호문을 원래 평문으로 복구
    public static String decrypt(String cipherMsg) {
        byte[] plainMsg = new byte[1024];
        try {
            Key key = new SecretKeySpec(randomKey, "AES");
            AlgorithmParameterSpec paramSpec = new IvParameterSpec(iv);

            cipher.init(Cipher.DECRYPT_MODE, key, paramSpec); // 복호화 모드로 엔진 가동
            // 16진수 텍스트를 다시 바이트로 바꾼 뒤 복호화 실행
            plainMsg = cipher.doFinal(hexToByte(cipherMsg.trim()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new String(plainMsg).trim(); // 복구된 바이트를 다시 문자열로 변환
    }

    // 바이트 배열 데이터를 우리가 읽을 수 있는 16진수 대문자 문자열로 변환
    private static String byteToHex(byte[] cipherMsg) {
        if (cipherMsg == null) return null;
        String str = "";
        for (byte b : cipherMsg) {
            str += String.format("%02X", b); // 1바이트를 2자리 16진수로 변환
        }
        return str;
    }

    // 16진수 문자열을 다시 원래의 바이트 배열(컴퓨터 데이터)로 복구
    private static byte[] hexToByte(String str) {
        if (str == null || str.length() < 2) return null;
        int len = str.length() / 2;
        byte[] buf = new byte[len];
        for (int i = 0; i < len; i++) {
            // 2글자씩 잘라서 16진수 숫자로 변환 후 바이트 배열에 담음
            buf[i] = (byte) Integer.parseInt(str.substring(i * 2, i * 2 + 2), 16);
        }
        return buf;
    }

    // 입력받은 키 문자열이 16바이트보다 짧으면 'A'부터 채워 강제로 16자리를 만드는 함수
    private static byte[] makeKey(String key) {
        int len = key.length();
        char ch = 'A';
        for (int i = len; i < 16; i++) {
            key += ch++;
        }
        return key.substring(0, 16).getBytes(); // 딱 16바이트만 잘라서 반환
    }

    //==============================================================================
    // [사용자 키 기반 암호화] 사용자가 지정한 문자열 키를 사용해 암호화
    public static String encrypt(String plain1, String key) {
        byte[] cipherMsg = new byte[1024];
        try {
            Key genKey = new SecretKeySpec(makeKey(key), "AES");
            AlgorithmParameterSpec paramSpec = new IvParameterSpec(iv);
            cipher.init(Cipher.ENCRYPT_MODE, genKey, paramSpec);
            cipherMsg = cipher.doFinal(plain1.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return byteToHex(cipherMsg);
    }

    // [사용자 키 기반 복호화] 사용자가 지정한 문자열 키를 사용해 복호화
    public static String decrypt(String cipher1, String key) {
        byte[] plainMsg = new byte[1024];
        try {
            Key genKey = new SecretKeySpec(makeKey(key), "AES");
            AlgorithmParameterSpec paramSpec = new IvParameterSpec(iv);
            cipher.init(Cipher.DECRYPT_MODE, genKey, paramSpec);
            plainMsg = cipher.doFinal(hexToByte(cipher1.trim()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new String(plainMsg).trim();
    }

    //==============================================================================
    // [파일 암호화] 원본 파일을 읽어 암호화한 후 다른 파일로 저장 (키를 파일로 백업함)
    public static void encryptFile(String plainFile, String cipherFile, String strkey) {
        // plainFile: 암호화 대상이 되는 파일의 이름
        // cipherFile: 결과 파일. 암호화된 파일의 이름
        try {
            getKey(strkey); // 사용자의 키로 SecretKey 객체를 만들어 파일(key.ser)로 저장
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("key.ser"));
            Key key = (Key) ois.readObject(); // 저장했던 키 객체를 다시 읽어옴
            ois.close();

            AlgorithmParameterSpec paramSpec = new IvParameterSpec(iv);
            cipher.init(Cipher.ENCRYPT_MODE, key, paramSpec);

            FileInputStream fis = new FileInputStream(plainFile);   // 읽을 파일
            FileOutputStream fos = new FileOutputStream(cipherFile); // 쓸 파일
            // 필터 스트림: 데이터를 쓰는 동시에 실시간으로 암호화 처리
            CipherOutputStream cos = new CipherOutputStream(fos, cipher); // 암호화되는 스트림
            byte[] buf = new byte[1024];
            int len;
            while ((len = fis.read(buf)) != -1) {
                cos.write(buf, 0, len); // 원본 읽어서 암호화 통로로 흘려보냄
            }
            fis.close();
            cos.flush();
            fos.flush();
            cos.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 사용자의 키 문자열을 기반으로 암호화 키 객체를 생성하여 파일(.ser)로 물리적 저장
    private static void getKey(String key) throws Exception {
        Key genkey = new SecretKeySpec(makeKey(key), "AES");
        ObjectOutputStream out =
                new ObjectOutputStream(new FileOutputStream("key.ser"));
        out.writeObject(genkey); // 자바 객체 자체를 파일로 저장(직렬화)
        out.flush();
        out.close();
    }

    // [파일 복호화] 암호화된 파일을 읽어 다시 평문 파일로 복구 (key.ser 파일 필요)
    public static void decryptFile(String cipherFile, String plainFile, String strkey) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("key.ser"));
            Key key = (Key) ois.readObject(); // 암호화 시 저장한 키 객체 로드
            ois.close();

            AlgorithmParameterSpec paramSpec = new IvParameterSpec(iv);
            cipher.init(Cipher.DECRYPT_MODE, key, paramSpec); // 복호화 모드

            FileInputStream fis = new FileInputStream(cipherFile); // 암호화 된 파일 읽기
            FileOutputStream fos = new FileOutputStream(plainFile); // 복호화 된 파일에 열기
            CipherOutputStream cos = new CipherOutputStream(fos, cipher); // 복호화 하여 파일에 저장

            byte[] buf = new byte[1024];
            int len;
            while ((len = fis.read(buf)) != -1) {
                cos.write(buf, 0, len); // 암호화된 데이터 읽어서 복호화 통로로 보냄
            }
            fis.close();
            cos.flush();
            fos.flush();
            cos.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // [SHA-256 해시] 단방향 암호화. 복호화가 불가능한 고유 지문값(64자) 생성
    public static String makehash(String userid) throws Exception {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] plain = userid.getBytes();
        byte[] hash = md.digest(plain); // 해싱 수행
        return byteToHex(hash); // 16진수 문자열로 반환
    }
}