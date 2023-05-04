package 집합과_맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Baekjoon_1269 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		HashSet<Integer> set = new HashSet<>();

		int numA = Integer.parseInt(st.nextToken());
		int numB = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < numA; i++) {
			int a = Integer.parseInt(st.nextToken());
			set.add(a);
		}

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < numB; i++) {
			int b = Integer.parseInt(st.nextToken());
			if (set.contains(b)) set.remove(b);
			else set.add(b);
		}
		
		System.out.print(set.size());
	}

}
