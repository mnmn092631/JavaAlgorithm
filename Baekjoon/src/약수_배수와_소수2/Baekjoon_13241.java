package 약수_배수와_소수2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_13241 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());

		long max = Math.max(a, b);
		long min = a + b - max;
		long rem = max % min;

		while (rem > 0) {
			max = min;
			min = rem;
			rem = max % min;
		}

		System.out.print(a * b / min);
	}

}
