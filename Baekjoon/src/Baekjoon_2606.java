import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon_2606 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());
		int t = Integer.parseInt(br.readLine());

		boolean[][] graph = new boolean[n + 1][n + 1];
		while (t-- > 0) {
			st = new StringTokenizer(br.readLine());
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());

			graph[from][to] = true;
			graph[to][from] = true;
		}

		boolean[] visited = new boolean[n + 1];
		Queue<Integer> que = new LinkedList<>();
		que.add(1);
		visited[1] = true;
		int count = 0;
		while (!que.isEmpty()) {
			int v = que.poll();

			for (int i = 1; i <= n; i++) {
				if (graph[v][i] && !visited[i]) {
					que.add(i);
					visited[i] = true;
					count++;
				}
			}
		}

		System.out.print(count);
	}

}
