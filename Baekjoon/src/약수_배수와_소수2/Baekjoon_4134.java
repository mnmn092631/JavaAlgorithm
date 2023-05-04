package 약수_배수와_소수2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_4134 {
	public static boolean isPrime(long num) {
		if (num == 0 || num == 1) return false;
		for (long i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) return false;
		}
		return true;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());

		for (int i = 0; i < t; i++) {
			long n = Long.parseLong(br.readLine());
			for (long j = n;; j++) {
				if (isPrime(j)) {
					sb.append(j).append("\n");
					break;
				}
			}
		}

		System.out.print(sb);
	}

}
