package 큐_덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Baekjoon_11866 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		sb.append("<");

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <=n; i++) {
			list.add(i);
		}

		int idx = k - 1;
		while (n > 1) {
			sb.append(list.remove(idx)).append(", ");
			idx = (idx + k - 1) % --n;
		}

		sb.append(list.get(0)).append(">");
		System.out.print(sb);
	}

}