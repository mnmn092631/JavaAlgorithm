package 집합과_맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Baekjoon_7785 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		TreeSet<String> set = new TreeSet<>();

		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			String status = st.nextToken();
			if (status.equals("enter")) set.add(name);
			else set.remove(name);
		}

		Iterator<String> iter = set.descendingIterator();
		while (iter.hasNext()) {
			sb.append(iter.next()).append("\n");
		}

		System.out.print(sb);

	}

}
