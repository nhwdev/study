package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// https://www.acmicpc.net/problem/1193
public class BOJ_1193 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int targetIndex = Integer.parseInt(br.readLine()); // 찾고 싶은 순번
		int diagonalEnd = 1; // 현재 대각선의 마지막 번호
		int diagonalNumber = 0; // 현재 대각선 번호 (1번째, 2번째...)
		int currentIndex = 1; // 전체 순번 카운트
		int diagonalStart = 0; // 현재 대각선 시작 번호
		// 몇 번째 대각선에 속하는지 찾기
		while (targetIndex >= currentIndex) {
			if (currentIndex == diagonalEnd) {
				diagonalStart = currentIndex; // 대각선 시작 위치 저장
				diagonalNumber++; // 다음 대각선
				diagonalEnd += diagonalNumber; // 마지막 번호 갱신
			}
			currentIndex++;
		}
		int positionInDiagonal = currentIndex - diagonalStart; // 대각선 내 위치
		int numeratorBase = diagonalNumber; // 분자 기본값
		// 홀수 대각선이면 위→아래 방향
		if (diagonalNumber % 2 == 1) {
			numeratorBase -= (positionInDiagonal - 1);
			bw.write(numeratorBase + "/" + positionInDiagonal);
		} else { // 짝수 대각선이면 아래→위 방향
			numeratorBase -= (positionInDiagonal - 1);
			bw.write(positionInDiagonal + "/" + numeratorBase);
		}
		bw.flush();
		bw.close();
		br.close();
	}
}