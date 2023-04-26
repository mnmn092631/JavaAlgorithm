package 약수_배수와_소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_2501 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int result = 0;

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) k--;
			if (k == 0) {
				result = i;
				break;
			}
		}

		System.out.print(result);
	}

}
