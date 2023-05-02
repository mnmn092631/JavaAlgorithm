package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_1427 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String num = br.readLine();

		while (num.length() > 0) {
			char max = 0;
			for (int i = 0; i < num.length(); i++) {
				if (num.charAt(i) > max) max = num.charAt(i);
			}
			sb.append(max);
			num = num.replaceFirst(Character.toString(max), "");
		}

		System.out.print(sb);
	}

}
