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
		
		boolean[] check = new boolean[n];
		int idx = 0;
		int count = 0;
		int delCount = 0;
		while (delCount < n) {
			while(check[idx]) {
				idx = (idx + 1) % n;
			}
			if (count != k - 1) {
				count++;
				idx = (idx + 1) % n;
				continue;
			}
			sb.append(idx + 1).append(", ");
			check[idx] = true;
			idx = (idx + 1) % n;
			delCount++;
			count = 0;
		}

		sb.delete(sb.length() - 2, sb.length() + 1);
		sb.append(">");
		System.out.print(sb);
	}

}
