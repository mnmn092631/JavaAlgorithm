package 심화2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Baekjoon_26069 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());
		HashSet<String> rabbit = new HashSet<>();
		rabbit.add("ChongChong");

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String str1 = st.nextToken();
			String str2 = st.nextToken();

			if (rabbit.contains(str1)) rabbit.add(str2);
			else if (rabbit.contains(str2)) rabbit.add(str1);
		}
		
		System.out.print(rabbit.size());
	}

}
