package 심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2444 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(br.readLine());

		for (int i = 0; i < num; i++) {
			for (int j = i; j < num - 1; j++) {
				sb.append(" ");
			}
			for (int k = 0; k <= i * 2; k++) {
				sb.append("*");
			}
			sb.append("\n");
		}

		for (int i = num - 1; i > 0; i--) {
			for (int j = i - 1; j < num - 1; j++) {
				sb.append(" ");
			}
			for (int k = 0; k < i * 2 - 1; k++) {
				sb.append("*");
			}
			sb.append("\n");
		}

		System.out.print(sb);
	}

}
