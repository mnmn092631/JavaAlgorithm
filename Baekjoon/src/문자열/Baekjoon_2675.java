package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_2675 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int t = Integer.parseInt(br.readLine());

		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());

			int r = Integer.parseInt(st.nextToken());
			String[] strs = st.nextToken().split("");

			for (String str : strs) {
				sb.append(str.repeat(r));
			}

			sb.append("\n");
		}

		System.out.print(sb);
	}

}
