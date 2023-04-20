package 이차원_배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_10798 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String[] arr = new String[5];
		int max = 0;

		for (int i = 0; i < 5; i++) {
			arr[i] = br.readLine();
			if (arr[i].length() > max) max = arr[i].length();
		}

		for (int i = 0; i < max; i++) {
			for (int j = 0; j < 5; j++) {
				if (arr[j].length() <= i) continue;
				sb.append(arr[j].charAt(i));
			}
		}

		System.out.print(sb);
	}

}
