package 약수_배수와_소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2581 {
	public static boolean isPrime(int num) {
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) return false;
		}
		return true;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		int min = 0;

		for (int i = m; i <= n; i++) {
			if (i == 1) continue;
			if (isPrime(i)) {
				sum += i;
				if (min == 0) min = i;
			}
		}

		if (sum != 0) System.out.print(sum + "\n" + min);
		else System.out.print(-1);
	}

}
