import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_11724 {
	public static boolean[][] graph;
	public static boolean[] check;

	public static void DFS(int n) {
		check[n] = true;

		for (int i = 1; i < graph.length; i++) {
			if (graph[n][i] && !check[i]) DFS(i);
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		graph = new boolean[n + 1][n + 1];
		check = new boolean[n + 1];
		while (m-- > 0) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			graph[x][y] = graph[y][x] = true;
		}

		int idx = 0;
		int count = 0;
		while (idx++ < n) {
			if(!check[idx]) {
				 DFS(idx);
				 count++;
			}
		}
		
		System.out.print(count);
	}

}
