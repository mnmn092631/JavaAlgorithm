import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_1654 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int k = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());

		long[] arr = new long[k];
		long high = Integer.MIN_VALUE;
		for (int i = 0; i < k; i++) {
			arr[i] = Long.parseLong(br.readLine());
			if (arr[i] > high) high = arr[i];
		}

		long low = 1;
		while (low <= high) {
			long sum = 0;
			long mid = (low + high) / 2;
			for (int i = 0; i < k; i++) {
				sum += arr[i] / mid;
			}
			if (sum < n) high = mid - 1;
			else if (sum >= n) low = mid + 1;
		}

		System.out.print(high);
	}

}
