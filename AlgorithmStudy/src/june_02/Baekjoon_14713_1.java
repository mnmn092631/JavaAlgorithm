package june_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_14713_1 {

	public static String isPossible(int n, String[][] arr, String[] l) {
		int[] idx = new int[n];
		for (int i = 0; i < l.length; i++) {
			String word = l[i];
			boolean flag = false;
			for (int j = 0; j < n; j++) {
				if (idx[j] == arr[j].length) continue;
				if (word.equals(arr[j][idx[j]])) {
					idx[j]++;
					flag = true;
					break;
				}
			}
			if (!flag) return "Impossible";
		}
		return "Possible";
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int wordCount = 0;
		String[][] arr = new String[n][];
		for (int i = 0; i < n; i++) {
			arr[i] = br.readLine().split(" ");
			wordCount += arr[i].length;
		}
		String[] l = br.readLine().split(" ");
		
		if (l.length != wordCount) System.out.print("Impossible");
		else System.out.print(isPossible(n, arr, l));
	}

}
