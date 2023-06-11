package june_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;

public class Baekjoon_5397 {

	public static void keylogger(char[] l, ListIterator<Character> iter) {
		for (char c : l) {
			switch (c) {
			case '<': {
				if (iter.hasPrevious())
					iter.previous();
				break;
			}
			case '>': {
				if (iter.hasNext())
					iter.next();
				break;
			}
			case '-': {
				if (iter.hasPrevious()) {
					iter.previous();
					iter.remove();
				}
				break;
			}
			default:
				iter.add(c);
				break;
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			char[] l = br.readLine().toCharArray();
			LinkedList<Character> list = new LinkedList<>();
			ListIterator<Character> iter = list.listIterator();

			keylogger(l, iter);

			for (char c : list) {
				sb.append(c);
			}
			sb.append("\n");
		}

		System.out.print(sb);
	}

}
