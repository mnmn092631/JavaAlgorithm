package 이차원_배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_2738 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[][] matrix = new int[n][m];

		for (int i = 0; i < n * 2; i++) {
			st = new StringTokenizer(br.readLine());

			for (int j = 0; j < m; j++) {
				matrix[i % n][j] += Integer.parseInt(st.nextToken());
				if (i >= n)
					sb.append(matrix[i % n][j]).append(" ");
			}

			if (i >= n)
				sb.append("\n");
		}

		System.out.print(sb);
	}

}
