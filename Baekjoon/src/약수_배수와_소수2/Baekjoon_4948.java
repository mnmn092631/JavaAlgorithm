package 약수_배수와_소수2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_4948 {
	public static boolean[] notPrime = new boolean[246913];
	public static int[] countArr = new int[246913];

	public static void getPrime() {
		notPrime[0] = notPrime[1] = true;
		for (int i = 2; i <= Math.sqrt(246913); i++) {
			if (notPrime[i]) continue;
			for (int j = i * i; j < 246913; j += i) {
				notPrime[j] = true;
			}
		}
	}

	public static void getCount() {
		int count = 0;
		for (int i = 2; i < 246913; i++) {
			if (!notPrime[i]) count++;
			countArr[i] = count;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		getPrime();
		getCount();

		while (true) {
			int n = Integer.parseInt(br.readLine());
			if (n == 0) break;

			sb.append(countArr[n * 2] - countArr[n]).append("\n");
		}

		System.out.print(sb);
	}

}
