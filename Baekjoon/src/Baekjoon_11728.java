import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_11728 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[] a = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}

		int[] b = new int[m];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			b[i] = Integer.parseInt(st.nextToken());
		}

		int idx1 = 0;
		int idx2 = 0;
		while (true) {
			if (a[idx1] < b[idx2]) sb.append(a[idx1++]).append(" ");
			else sb.append(b[idx2++]).append(" ");
			
			if (idx1 == n) {
				for (int i = idx2; i < m; i++) {
					sb.append(b[i]).append(" ");
				}
				break;
			} else if (idx2 == m) {
				for (int i = idx1; i < n; i++) {
					sb.append(a[i]).append(" ");
				}
				break;
			}
		}

		System.out.print(sb);
	}

}
