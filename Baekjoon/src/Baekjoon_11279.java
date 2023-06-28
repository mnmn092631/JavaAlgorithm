import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Baekjoon_11279 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());
		while (n-- > 0) {
			int num = Integer.parseInt(br.readLine());
			if (num == 0) {
				if (que.isEmpty()) sb.append("0\n");
				else sb.append(que.remove()).append("\n");
			} else que.offer(num);
		}

		System.out.print(sb);
	}

}
