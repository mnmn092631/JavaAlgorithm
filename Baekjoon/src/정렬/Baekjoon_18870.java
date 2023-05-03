package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Baekjoon_18870 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());

		int[] arr = new int[n];
		TreeSet<Integer> set = new TreeSet<>();

		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			arr[i] = num;
			set.add(num);
		}

		List<Integer> list = List.copyOf(set);
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < list.size(); i++) {
			map.put(list.get(i), i);
		}

		for (int i = 0; i < arr.length; i++) {
			sb.append(map.get(arr[i])).append(" ");
		}

		System.out.print(sb);
	}

}