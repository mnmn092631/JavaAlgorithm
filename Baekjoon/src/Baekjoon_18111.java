import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_18111 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		int[] arr = new int[n * m];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				arr[i * m + j] = Integer.parseInt(st.nextToken());
				if (arr[i * m + j] < min) min = arr[i * m + j];
				if (arr[i * m + j] > max) max = arr[i * m + j];
			}
		}

		int minSec = Integer.MAX_VALUE;
		int height = max;
		for (int i = max; i >= min; i--) {
			int sec = 0;
			int inven = b;
			for (int j = 0; j < n * m; j++) {
				if (arr[j] > i) {
					sec += (arr[j] - i) * 2;
					inven += arr[j] - i;
				} else if (arr[j] < i) {
					sec += (i - arr[j]);
					inven -= i - arr[j];
				}
			}
			if (inven < 0) continue;
			if (sec < minSec) {
				minSec = sec;
				height = i;
			}
		}

		System.out.print(minSec + " " + height);
	}

}
