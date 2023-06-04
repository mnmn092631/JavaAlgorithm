package june_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_25918_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		char[] stack = br.readLine().toCharArray();

		int maxDep = 1;
		int top = 0;
		for (int i = 0; i < n; i++) {
			if (top != i) stack[top] = stack[i];
			if (top > 0 && stack[top - 1] != stack[i]) {
				if (top > maxDep) maxDep = top;
				top--;
				continue;
			}
			top++;
		}

		if (top == 0) System.out.print(maxDep);
		else System.out.print(-1);
	}

}
