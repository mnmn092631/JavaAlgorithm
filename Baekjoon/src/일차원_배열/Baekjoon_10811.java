package 일차원_배열;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_10811 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = i + 1;
		}
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			for(int j = 0; j <= (b - a) / 2; j++) {
				int temp = arr[a + j - 1];
				arr[a + j - 1] = arr[b - j - 1];
				arr[b - j - 1] = temp;
			}
		}
		
		for(int num : arr) {
			sb.append(num).append(" ");
		}
		
		System.out.print(sb);
	}

}
