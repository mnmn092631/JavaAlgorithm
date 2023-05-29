package june_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_6603 {
	public static StringBuilder sb = new StringBuilder();
	public static int arr[];

	public static void recur(int check, int dep, boolean[] checkArr) {
		if (dep - check > checkArr.length - 6) return;
		if (check == 6) {
			for (int i = 0; i < checkArr.length; i++) {
				if (checkArr[i]) sb.append(arr[i]).append(" ");
			}
			sb.append("\n");
			return;
		} else {
			checkArr[dep] = true;
			recur(check + 1, dep + 1, checkArr);
			checkArr[dep] = false;
			recur(check, dep + 1, checkArr);
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			String[] input = br.readLine().split(" ");
			int k = Integer.parseInt(input[0]);
			if (k == 0) break;

			arr = new int[k];
			for (int i = 1; i < input.length; i++) {
				arr[i - 1] = Integer.parseInt(input[i]);
			}
			recur(0, 0, new boolean[k]);
			sb.append("\n");
		}

		System.out.print(sb);
	}

}
