package 스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_9012 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int t = Integer.parseInt(br.readLine());

		for (int i = 0; i < t; i++) {
			String str = br.readLine();
			String result = "YES";

			char[] arr = new char[50];
			int idx = 0;
			for (int j = 0; j < str.length(); j++) {
				char c = str.charAt(j);
				if (c == '(') {
					arr[idx] = c;
					idx++;
					continue;
				}
				idx--;
				if (idx < 0) break;
			}
			
			if (idx != 0) result = "NO";
			sb.append(result).append("\n");
		}

		System.out.print(sb);
	}

}
