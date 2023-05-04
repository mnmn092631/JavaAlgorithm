package 약수_배수와_소수2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_1934 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int t = Integer.parseInt(br.readLine());

		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			int max = Math.max(a, b);
			int min = a + b - max;
			int rem = max % min;

			while (rem > 0) {
				max = min;
				min = rem;
				rem = max % min;
			}

			sb.append(a * b / min).append("\n");
		}

		System.out.print(sb);
	}

}
