package june_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Baekjoon_9935 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String str = br.readLine();
		Stack<Character> stack = new Stack<>();
		char[] s = br.readLine().toCharArray();

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			stack.push(c);

			if (c == s[s.length - 1] && stack.size() >= s.length) {
				for (int j = 0; j < s.length; j++) {
					char preC = stack.pop();
					if (preC != s[s.length - 1 - j]) {
						stack.push(preC);
						for (int k = j - 1; k >= 0; k--) {
							stack.push(s[s.length - 1 - k]);
						}
						break;
					}
				}
			}
		}

		if (stack.size() == 0) {
			sb.append("ALURF");
		} else {
			while (!stack.empty()) {
				sb.append(stack.pop());
			}
		}
		System.out.print(sb.reverse());
	}

}
