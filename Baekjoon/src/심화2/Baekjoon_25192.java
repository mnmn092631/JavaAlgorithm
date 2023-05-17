package 심화2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Baekjoon_25192 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		HashSet<String> users = new HashSet<>();
		int count = 0;

		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			if (str.equals("ENTER")) {
				users.clear();
				continue;
			}
			if (!users.contains(str)) {
				count++;
				users.add(str);
			}
		}

		System.out.print(count);
	}

}
