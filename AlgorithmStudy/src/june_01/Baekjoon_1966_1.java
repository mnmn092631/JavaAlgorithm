package june_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon_1966_1 {

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
			Queue<int[]> que = new LinkedList<>();
			int[] sortedArr = new int[n];
			for (int j = 0; j < n; j++) {
				int num = Integer.parseInt(st.nextToken());
				que.add(new int[] { j, num });
				sortedArr[j] = num;
			}
			Arrays.sort(sortedArr);

			int count = 0;
			int idx = n - 1;
			while (!que.isEmpty()) {
				int[] doc = que.poll();
				if (doc[1] != sortedArr[idx]) {
					que.offer(doc);
					continue;
				}
				count++;
				idx--;
				if (doc[0] == m) break;
			}
			sb.append(count).append("\n");
		}
		System.out.print(sb);
	}
	
}