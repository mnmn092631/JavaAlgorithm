package 심화2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon_2108 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());

		int[] arr = new int[n];
		int[] countArr = new int[8001];
		int sum = 0;
		int mode = 0;

		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());
			arr[i] = num;
			sum += num;
			countArr[4000 + num] += 1;
		}

		Arrays.sort(arr);
		int max = Integer.MIN_VALUE;
		boolean flag = false;
		for (int i : arr) {
			if (mode == i) continue;

			if (countArr[4000 + i] > max) {
				max = countArr[4000 + i];
				mode = i;
				flag = true;
			} else if (countArr[4000 + i] == max && mode != i && flag) {
				mode = i;
				flag = false;
			}
		}

		sb.append(Math.round((double) sum / n)).append("\n").append(arr[(n - 1) / 2]).append("\n").append(mode)
				.append("\n").append(arr[arr.length - 1] - arr[0]);
		System.out.print(sb);
	}

}
