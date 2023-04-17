package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon_10809 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int[] alphabet = new int[26];
		Arrays.fill(alphabet, -1);

		String str = br.readLine();

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			alphabet[c - 97] = str.indexOf(c);
		}

		for (int num : alphabet) {
			sb.append(num).append(" ");
		}
		
		System.out.print(sb);
	}

}
