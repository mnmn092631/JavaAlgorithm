package 스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_10773 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int k = Integer.parseInt(br.readLine());
		int[] arr = new int[k];
		int size = 0;
		int sum = 0;

		for (int i = 0; i < k; i++) {
			int n = Integer.parseInt(br.readLine());
			if (n == 0) {
				sum -= arr[--size];
				continue;
			}
			arr[size] = n;
			sum += n;
			size++;
		}

		System.out.print(sum);
	}

}
