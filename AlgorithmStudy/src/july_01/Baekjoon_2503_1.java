package july_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_2503_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());

		boolean[] arr = new boolean[988];
		int count = 504;
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (i == j) continue;
				for (int k = 1; k <= 9; k++) {
					if (i == k || j == k) continue;
					arr[i * 100 + j * 10 + k] = true;
				}
			}
		}

		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());
			String numStr = st.nextToken();
			int s = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			for (int i = 123; i < 988; i++) {
				if (!arr[i]) continue;

				String num = Integer.toString(i);
				int numS = 0;
				int numB = 0;

				for (int j = 0; j < 3; j++) {
					if (numStr.charAt(j) == num.charAt(j)) numS++;
					else {
						for (int k = 0; k < 3; k++) {
							if (j == k) continue;
							if (numStr.charAt(j) == num.charAt(k)) numB++;
						}
					}
				}
				
				if (numS != s || numB != b) {
					arr[i] = false;
					count--;
				}
			}
		}

		System.out.print(count);
	}

}
