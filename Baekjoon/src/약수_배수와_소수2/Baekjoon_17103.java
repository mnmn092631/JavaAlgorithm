package 약수_배수와_소수2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_17103 {
	public static boolean[] notPrime = new boolean[1000001];

	public static void getPrime() {
		notPrime[0] = notPrime[1] = true;
		for (int i = 2; i <= Math.sqrt(1000001); i++) {
			if (notPrime[i])
				continue;
			for (int j = i * i; j < 1000001; j += i) {
				notPrime[j] = true;
			}
		}
	}

	public static int getCount(int num) {
		int count = 0;
		int a = num;
		int b = num;

		if (num != 2 && num % 2 == 0) {
			a -= 1;
			b += 1;
		}

		while (a >= 2) {
			if (!notPrime[a] && !notPrime[b]) count++;
			a -= 2;
			b += 2;
		}

		return count;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		getPrime();
		int t = Integer.parseInt(br.readLine());

		for (int i = 0; i < t; i++) {
			int num = Integer.parseInt(br.readLine());
			sb.append(getCount(num / 2)).append("\n");
		}

		System.out.print(sb);
	}

}
