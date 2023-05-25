package 스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_4949 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		while (true) {
			String str = br.readLine();
			if (str.equals(".")) break;

			String result = "no";
			char[] arr = new char[100];
			int idx = 0;
			int size = 0;
			while (true) {
				char c = str.charAt(idx++);
				if (c == '.') break;

				if (c == '(' || c == '[') {
					arr[size++] = (c == '(' ? ')' : ']');
				}
				else if (c == ')' || c == ']') {
					if(size > 0) {
						if(arr[size - 1] != c) break;
						size--;
					}
					else if (size < 1) {
						size -= 1;
						break;
					}
				}
			}
			
			if (size == 0) result = "yes";
			sb.append(result).append("\n");
		}
		
		System.out.print(sb);
	}

}
