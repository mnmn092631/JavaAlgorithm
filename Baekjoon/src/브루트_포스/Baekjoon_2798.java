package 브루트_포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_2798 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			arr[i] = num;
		}

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > m) continue;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] > m) continue;
				for (int k = j + 1; k < arr.length; k++) {
					int sum = arr[i] + arr[j] + arr[k];
					if (sum > m) continue;
					if (sum > max) max = sum;
				}
			}
		}

		System.out.print(max);
	}

}
