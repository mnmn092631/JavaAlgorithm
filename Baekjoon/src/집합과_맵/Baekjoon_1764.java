package 집합과_맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Baekjoon_1764 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		HashSet<String> set = new HashSet<>();
		TreeSet<String> result = new TreeSet<>();

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		for (int i = 0; i < n; i++) {
			set.add(br.readLine());
		}

		for (int i = 0; i < m; i++) {
			String str = br.readLine();
			if (set.contains(str)) {
				result.add(str);
			}
		}

		sb.append(result.size()).append("\n");
		for (String str : result) {
			sb.append(str).append("\n");
		}

		System.out.print(sb);
	}

}
