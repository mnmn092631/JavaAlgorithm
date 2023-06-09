import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_10845 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());

		int[] que = new int[10000];
		int front = 0;
		int back = 0;
		int size = 0;

		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			switch (str.charAt(1)) {
			case 'u':
				que[back] = Integer.parseInt(str.split(" ")[1]);
				back++;
				size++;
				break;
			case 'o':
				if (size == 0) sb.append("-1\n");
				else {
					sb.append(que[front]).append("\n");
					front++;
					size--;
				}
				break;
			case 'i':
				sb.append(size).append("\n");
				break;
			case 'm':
				if (size == 0) sb.append("1\n");
				else sb.append("0\n");
				break;
			case 'r':
				if (size == 0) sb.append("-1\n");
				else sb.append(que[front]).append("\n");
				break;
			case 'a':
				if (size == 0) sb.append("-1\n");
				else sb.append(que[back - 1]).append("\n");
			}
		}

		System.out.print(sb);
	}

}
