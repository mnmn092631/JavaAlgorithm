package june_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_25918_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		char[] str = br.readLine().toCharArray();

		int maxDep = 1;
		int dep = 0;
		for (int i = 0; i < n; i++) {
			if (str[i] == '(') dep++;
			else dep--;
			if (Math.abs(dep) > maxDep) maxDep = Math.abs(dep);
		}

		if (dep == 0) System.out.print(maxDep);
		else System.out.print(-1);
	}

}
