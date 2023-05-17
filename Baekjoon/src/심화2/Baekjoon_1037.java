package 심화2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_1037 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < t; i++) {
			int num = Integer.parseInt(st.nextToken());
			max = num > max ? num : max;
			min = num < min ? num : min;
		}

		System.out.print(max * min);
	}

}
