package june_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Baekjoon_14713 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String result = "Impossible";

		int n = Integer.parseInt(br.readLine());

		String[][] arr = new String[n][];
		for (int i = 0; i < n; i++) {
			arr[i] = br.readLine().split(" ");
		}

		String[] l = br.readLine().split(" ");
		Queue<String> que = new LinkedList<>();
		for (String word : l) {
			que.offer(word);
		}

		int[] idx = new int[n];
		for (int i = 0; i < l.length; i++) {
			String word = que.peek();
			for (int j = 0; j < n; j++) {
				if (idx[j] == arr[j].length) continue;
				if (word.equals(arr[j][idx[j]])) {
					que.poll();
					idx[j]++;
					break;
				}
			}
		}

		if (que.isEmpty()) result = "Possible";
		for (int i = 0; i < idx.length; i++) {
			if(idx[i] != arr[i].length) {
				result = "Impossible";
				break;
			}
		}
		System.out.print(result);
	}

}
