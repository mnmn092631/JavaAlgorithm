package 심화2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Baekjoon_20920 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		HashMap<String, Integer> words = new HashMap<>();
		ArrayList<String> result = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			String word = br.readLine();
			if (word.length() < m)
				continue;

			if (words.containsKey(word)) {
				words.put(word, words.get(word) + 1);
			}
			else {
				words.put(word, 1);
				result.add(word);
			}
		}

		Collections.sort(result, (str1, str2) -> {
			if (words.get(str1) == words.get(str2)) {
				if (str1.length() == str2.length()) {
					return str1.compareTo(str2);
				}
				return str2.length() - str1.length();
			}
			return words.get(str2) - words.get(str1);
		});

		for (int i = 0; i < result.size(); i++) {
			sb.append(result.get(i)).append("\n");
		}
		System.out.print(sb);
	}
	
}
