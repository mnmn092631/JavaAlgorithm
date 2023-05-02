package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon_1181 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		String[] arr = new String[n];

		for (int i = 0; i < n; i++) {
			arr[i] = br.readLine();
		}

		Arrays.sort(arr, (a, b) -> a.length() == b.length() ? a.compareTo(b) : a.length() - b.length());

		for (int i = 0; i < arr.length; i++) {
			if (i > 0 && arr[i].equals(arr[i - 1])) continue;
			sb.append(arr[i]).append("\n");
		}

		System.out.print(sb);
	}

}
