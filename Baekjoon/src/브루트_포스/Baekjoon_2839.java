package 브루트_포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2839 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int result = 0;

		while (n > 0) {
			if (n % 5 == 0) {
				result += n / 5;
				break;
			}

			result++;
			n -= 3;
		}

		System.out.print(n >= 0 ? result : -1);
	}

}
