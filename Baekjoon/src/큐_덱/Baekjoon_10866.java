package 큐_덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Baekjoon_10866 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());

		List<Integer> deque = new ArrayList<>();
		int size = 0;

		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			char c = str.charAt(1);
			if (c == 'u') {
				int num = Integer.parseInt(str.split(" ")[1]);
				if (str.charAt(5) == 'f') deque.add(0, num);
				else deque.add(num);
				size++;
			} else if (c == 'o') {
				if (size == 0) {
					sb.append("-1\n");
					continue;
				}
				if (str.charAt(4) == 'f') sb.append(deque.remove(0));
				else sb.append(deque.remove(size - 1));
				sb.append("\n");
				size--;
			}
			else if (c == 'i') sb.append(size).append("\n");
			else if (c == 'm') {
				if (size == 0) sb.append("1\n");
				else sb.append("0\n");
			} 
			else if (c == 'r') {
				if (size == 0) sb.append("-1\n");
				else sb.append(deque.get(0)).append("\n");
			} 
			else if (c == 'a') {
				if (size == 0) sb.append("-1\n");
				else sb.append(deque.get(size - 1)).append("\n");
			}
		}
		
		System.out.print(sb);
	}

}
