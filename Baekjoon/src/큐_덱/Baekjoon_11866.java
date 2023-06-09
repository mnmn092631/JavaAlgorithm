package 큐_덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_11866 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		sb.append("<");

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		int[] que = new int[n];
		for (int i = 1; i <= n; i++) {
			que[i - 1] = i;
		}

		int idx = 0;
		int count = 0;
		int delCount = 0;

		while (delCount < n) {
			while(que[idx] == -1) {
				idx = (idx + 1) % n;
			}
			if (count != k - 1) {
				count++;
				idx = (idx + 1) % n;
				continue;
			}
			sb.append(que[idx]).append(", ");
			que[idx] = -1;
			idx = (idx + 1) % n;
			delCount++;
			count = 0;
		}

		sb.delete(sb.length() - 2, sb.length() + 1);
		sb.append(">");
		System.out.print(sb);
	}

}
