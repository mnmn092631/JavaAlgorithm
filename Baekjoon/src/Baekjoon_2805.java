import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon_2805 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr);
		int low = 0;
		int high = arr[n - 1] - 1;
		int mid = 0;
		while (low <= high) {
			mid = (low + high) / 2;
			long midVal = 0;
			for (int i = 0; i < n; i++) {
				if (arr[i] < mid) continue;
				midVal += arr[i] - mid;
			}
			if (midVal < m) high = mid - 1;
			else if (midVal >= m) low = mid + 1;
		}

		System.out.print(high);
	}
}
