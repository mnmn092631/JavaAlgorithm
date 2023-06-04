package june_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Baekjoon_25918 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		char[] str = br.readLine().toCharArray();

		int maxDep = 1;
		Stack<Character> stack = new Stack<>();
		int dep = 0;
		for (int i = 0; i < n; i++) {
			if (!stack.empty() && stack.peek() != str[i]) {
				stack.pop();
				if (dep > maxDep) maxDep = dep;
				dep--;
				continue;
			}
			stack.add(str[i]);
			dep++;
		}

		if (stack.isEmpty()) System.out.print(maxDep);
		else System.out.print(-1);
	}

}
