package 심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_4344 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int c = Integer.parseInt(br.readLine());

		for (int i = 0; i < c; i++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int[] arr = new int[n];
			int sum = 0;
			int count = 0;

			for (int j = 0; j < n; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
				sum += arr[j];
			}

			double avg = (double) sum / n;
			for (int score : arr) {
				if (score > avg)
					count++;
			}

			double result = (double) count / n * 100;
			sb.append(String.format("%.3f", result)).append("%").append("\n");
		}

		System.out.print(sb);
	}
}
