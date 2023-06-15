import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_11047 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] line1 = br.readLine().split(" ");
		int n = Integer.parseInt(line1[0]);
		int k = Integer.parseInt(line1[1]);

		int[] coins = new int[n];
		for (int i = 0; i < n; i++) {
			coins[i] = Integer.parseInt(br.readLine());
		}

		int totalCount = 0;
		for (int i = n - 1; i >= 0; i--) {
			if (coins[i] > k) continue;
			int count = k / coins[i];
			k -= coins[i] * count;
			totalCount += count;
			if (k == 0) break;
		}

		System.out.print(totalCount);
	}

}
