package june_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Baekjoon_1966 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int t = Integer.parseInt(br.readLine());

		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());

			st = new StringTokenizer(br.readLine());
			ArrayList<int[]> que = new ArrayList<>();
			for (int j = 0; j < n; j++) {
				que.add(new int[] { j, Integer.parseInt(st.nextToken()) });
			}

			int count = 0;
			while (!que.isEmpty()) {
				int[] doc = que.get(0);
				boolean isMax = true;
				for (int j = 1; j < que.size(); j++) {
					int[] com = que.get(j);
					if (com[1] > doc[1]) {
						int idx = 0;
						while (idx < j) {
							que.add(que.remove(0));
							idx++;
						}
						isMax = false;
						break;
					}
				}

				if (isMax) {
					int removeIdx = que.remove(0)[0];
					count++;
					if (removeIdx == m)
						break;
				}
			}
			sb.append(count).append("\n");
		}
		System.out.print(sb);
	}
}