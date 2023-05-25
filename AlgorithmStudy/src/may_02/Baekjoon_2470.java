package may_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon_2470 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr);

		int min = Integer.MAX_VALUE;
		int[] result = new int[2];
		for (int i = 0; i < arr.length; i++) {
			int idx = Arrays.binarySearch(arr, 0 - arr[i]);

			if (idx < 0) idx = (idx + 1) * -1;
			
			for(int j = 0; j < 2; j++) {
				idx = idx - j;
				if (idx < 0 || idx >= arr.length || i == idx) continue;
				
				int com = Math.abs(arr[i] + arr[idx]);
				if (com < min) {
					min = com;
					result[0] = arr[i];
					result[1] = arr[idx];
				}
			}
		}

		Arrays.sort(result);
		sb.append(result[0]).append(" ").append(result[1]);
		System.out.print(sb);
	}

}
