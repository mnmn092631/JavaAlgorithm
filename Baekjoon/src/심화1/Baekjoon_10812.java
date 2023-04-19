package 심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Baekjoon_10812 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(st.nextToken());
		ArrayList<Integer> basket = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			basket.add(i + 1);
		}

		int m = Integer.parseInt(st.nextToken());

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int begin = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int mid = Integer.parseInt(st.nextToken());

			if (begin == mid)
				continue;

			for (int j = 0; j <= end - mid; j++) {
				int num = basket.get(mid - 1 + j);
				basket.add(begin - 1 + j, num);
				basket.remove(mid + j);
			}
		}

		for (int i = 0; i < basket.size(); i++) {
			sb.append(basket.get(i)).append(" ");
		}

		System.out.print(sb);
	}

}
