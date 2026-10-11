package test0120;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
파일 두개의 이름을 콘솔에서 입력받아 파일의 내용이 같은지  비교하는 프로그램을
작성하기

[결과]
첫번째 파일 이름을 입력하세요>>noname.txt
두번째 파일 이름을 입력하세요>>noname2.txt
noname.txt와 noname2.txt를 비교합니다.
noname.txt와noname2.txt파일은 같은 내용의 파일입니다.
noname.txt파일의 크기 :70
noname2.txt파일의 크기 :70
*/

public class Test03 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String file1 = br.readLine();
		String file2 = br.readLine();
		FileInputStream br1 = new FileInputStream("src/test0120/" + file1);
		FileInputStream br2 = new FileInputStream("src/test0120/" + file2);
		byte[] buf1 = new byte[1024];
		byte[] buf2 = new byte[1024];
		int sizeSum1 = 0;
		int sizeSum2 = 0;
		System.out.println(file1 + "와 " + file2 + "를 비교합니다.");
		while (true) {
			int len1 = br1.read(buf1);
			int len2 = br2.read(buf2);

			if (len1 != -1) {
				sizeSum1 += len1;
			}
			if (len2 != -1) {
				sizeSum2 += len2;
			}

			if (len1 != len2) {
				System.out.println(file1 + "와 " + file2 + "는 다른 내용의 파일입니다.");
				break;
			}
			if (len1 == -1) {
				System.out.println(file1 + "와 " + file2 + "는 같은 내용의 파일입니다.");
				break;
			}

			for (int i = 0; i < len1; i++) {
				if (buf1[i] != buf2[i]) {
					System.out.println(file1 + "와 " + file2 + "는 다른 내용의 파일입니다.");
					System.out.println(file1 + "의 파일의 크기: " + sizeSum1);
					System.out.println(file2 + "의 파일의 크기: " + sizeSum2);
					return;
				}
			}
		}
		System.out.println(file1 + "의 파일의 크기: " + sizeSum1);
		System.out.println(file2 + "의 파일의 크기: " + sizeSum2);
		br.close();
		br1.close();
		br2.close();
	}
}
