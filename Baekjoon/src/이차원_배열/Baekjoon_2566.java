package 이차원_배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_2566 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int max = Integer.MIN_VALUE, row = 0, col = 0;

		for (int i = 1; i <= 9; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= 9; j++) {
				int num = Integer.parseInt(st.nextToken());
				if (num > max) {
					max = num;
					row = i;
					col = j;
				}
			}
		}

		sb.append(max).append("\n").append(row).append(" ").append(col);
		System.out.print(sb);
	}

}
