package june_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2477 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int k = Integer.parseInt(br.readLine());

		int[] max = new int[2];
		int[] idx = new int[2];
		int[] arr = new int[6];
		for (int i = 0; i < 6; i++) {
			int num = Integer.parseInt(br.readLine().split(" ")[1]);
			if (num > max[i % 2]) {
				max[i % 2] = num;
				idx[i % 2] = i;
			}
			arr[i] = num;
		}

		int big = max[0] * max[1];
		int small = arr[(idx[0] + 3) % 6] * arr[(idx[1] + 3) % 6];
		System.out.print(k * (big - small));
	}

}
