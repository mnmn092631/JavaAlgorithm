package 집합과_맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Baekjoon_1620 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		HashMap<Integer, String> map1 = new HashMap<>();
		HashMap<String, Integer> map2 = new HashMap<>();

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		for (int i = 1; i <= n; i++) {
			String str = br.readLine();
			map1.put(i, str);
			map2.put(str, i);
		}

		for (int i = 0; i < m; i++) {
			String str = br.readLine();
			try {
				int key = Integer.parseInt(str);
				sb.append(map1.get(key)).append("\n");
			} catch (NumberFormatException e) {
				sb.append(map2.get(str)).append("\n");
			}
		}

		System.out.print(sb);
	}

}
