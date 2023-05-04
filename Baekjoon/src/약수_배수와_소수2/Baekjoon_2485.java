package 약수_배수와_소수2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2485 {
	public static int getGCD(int max, int min) {
		if (min == 0) return max;
		int rem = max % min;
		if (rem == 0) return min;
		else return getGCD(min, rem);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] street = new int[n];
		int gcd = 0;

		for (int i = 0; i < n; i++) {
			street[i] = Integer.parseInt(br.readLine());
		}

		for (int i = 1; i < street.length; i++) {
			int dif = street[i] - street[i - 1];
			gcd = getGCD(dif, gcd);
		}

		System.out.print((street[n - 1] - street[0]) / gcd + 1 - street.length);
	}

}
