package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

// https://www.acmicpc.net/problem/25206
public class BOJ_25206 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Map<String, Double> map = new HashMap<String, Double>();
		map.put("A+", 4.5);
		map.put("A0", 4.0);
		map.put("B+", 3.5);
		map.put("B0", 3.0);
		map.put("C+", 2.5);
		map.put("C0", 2.0);
		map.put("D+", 1.5);
		map.put("D0", 1.0);
		map.put("F", 0.0);
		double majorSum = 0;
		double tot = 0;
		for (int i = 0; i < 20; i++) {
			String[] str = br.readLine().split(" ");
			if (str[2].equals("P")) {
				continue;
			}
			double majorScore = Double.parseDouble(str[1]);
			majorSum += map.get(str[2]) * majorScore;
			tot += majorScore;
		}
		if (tot == 0) {
			bw.write("0.000000");
		} else {
			bw.write(String.format("%.6f", majorSum / tot));
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
