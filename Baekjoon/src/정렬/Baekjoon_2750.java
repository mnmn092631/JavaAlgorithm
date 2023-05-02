package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon_2750 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());
			arr[i]=num;
		}
		
		Arrays.sort(arr);
		
		for(int num : arr) sb.append(num).append("\n");
		
		System.out.print(sb);
	}

}
