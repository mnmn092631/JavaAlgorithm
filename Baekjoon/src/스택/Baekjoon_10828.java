package 스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_10828 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int size = 0;
		int top = -1;

		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			int num = 0;
			if (str.charAt(1) == 'u') {
				st = new StringTokenizer(str);
				str = st.nextToken();
				num = Integer.parseInt(st.nextToken());
			}

			if (str.equals("push")) {
				arr[size] = num;
				top = num;
				size++;
				continue;
			}
			else if (str.equals("pop")) {
				if (size > 0) {
					size--;
					sb.append(arr[size]);
					top = size == 0 ? -1 : arr[size - 1];
				}
				else sb.append(-1);
			} 
			else if (str.equals("size")) sb.append(size);
			else if (str.equals("empty")) sb.append(size == 0 ? 1 : 0);
			else if (str.equals("top")) sb.append(top);
			sb.append("\n");
		}

		System.out.print(sb);
	}

}
