package july_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2503 {
	public static String[] strs;

	public static boolean check(String num) {
		for (int i = 0; i < strs.length; i++) {
			String[] strI = strs[i].split(" ");
			String numStr = strI[0];
			int s = Integer.parseInt(strI[1]);
			int b = Integer.parseInt(strI[2]);

			for (int j = 0; j < 3; j++) {
				if (numStr.charAt(j) == num.charAt(j)) s--;
				else {
					for (int k = 0; k < 3; k++) {
						if (j == k) continue;
						if (numStr.charAt(j) == num.charAt(k)) b--;
					}
				}
			}
			if (s != 0 || b != 0) return false;
		}
		return true;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());

		strs = new String[n];
		for (int i = 0; i < n; i++) {
			strs[i] = br.readLine();
		}

		int count = 0;
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (i == j) continue;
				for (int k = 1; k <= 9; k++) {
					if (i == k || j == k) continue;
					String num = Integer.toString(i * 100 + j * 10 + k);
					if (check(num)) count++;
				}
			}
		}
		
		System.out.print(count);
	}

}
