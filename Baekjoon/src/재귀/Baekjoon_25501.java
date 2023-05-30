package 재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_25501 {
	public static int count = 0;

	public static int Palindrome(String s, int l, int r) {
		count++;
		if (l >= r) return 1;
		else if (s.charAt(l) != s.charAt(r)) return 0;
		else return Palindrome(s, l + 1, r - 1);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());

		for (int i = 0; i < t; i++) {
			String str = br.readLine();
			count = 0;
			sb.append(Palindrome(str, 0, str.length() - 1)).append(" ").append(count).append("\n");
		}
		
		System.out.print(sb);
	}
}
