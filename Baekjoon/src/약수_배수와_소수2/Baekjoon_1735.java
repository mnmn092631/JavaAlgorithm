package 약수_배수와_소수2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_1735 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		StringTokenizer st = new StringTokenizer(br.readLine());
		int a1 = Integer.parseInt(st.nextToken());
		int b1 = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		int a2 = Integer.parseInt(st.nextToken());
		int b2 = Integer.parseInt(st.nextToken());

		int resultB = b1 * b2;
		int resultA = a1 * b2 + a2 * b1;

		int max = Math.max(resultA, resultB);
		int min = resultA + resultB - max;
		int rem = max % min;

		while (rem > 0) {
			max = min;
			min = rem;
			rem = max % min;
		}

		sb.append(resultA / min).append(" ").append(resultB / min);
		System.out.print(sb);
	}

}
