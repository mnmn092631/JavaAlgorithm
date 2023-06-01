package june_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon_6603_2 {
	public static StringBuilder sb = new StringBuilder();
	public static String arr[];
	public static boolean checkArr[];

	public static void recur(int check, int dep) {
		if (dep - check > checkArr.length - 6) return;
		if (check == 6) {
			for (int i = 0; i < checkArr.length; i++) {
				if (checkArr[i]) sb.append(arr[i]).append(" ");
			}
			sb.append("\n");
			return;
		} else {
			checkArr[dep] = true;
			recur(check + 1, dep + 1);
			checkArr[dep] = false;
			recur(check, dep + 1);
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			String[] input = br.readLine().split(" ");
			int k = Integer.parseInt(input[0]);
			if (k == 0) break;

			arr = Arrays.copyOfRange(input, 1, k + 1);
			checkArr = new boolean[k];
			recur(0, 0);
			sb.append("\n");
		}

		System.out.print(sb);
	}

}
