package 일반_수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2720 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int[] coin = { 25, 10, 5, 1 };
		int t = Integer.parseInt(br.readLine());

		for (int i = 0; i < t; i++) {
			int c = Integer.parseInt(br.readLine());
			for (int j = 0; j < coin.length; j++) {
				sb.append(c / coin[j]).append(" ");
				c %= coin[j];
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}

}
