package 큐_덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon_11866 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		Queue<Integer> que = new LinkedList<>();
		for(int i = 1; i <= n; i++) {
			que.add(i);
		}
		
		int count = 1;
		while(!que.isEmpty()) {
			int p = que.poll();
			if(count != k) {
				que.offer(p);
				count++;
				continue;
			}
			sb.append(p).append(", ");
			count = 1;
		}
		
		sb.delete(sb.length() - 2, sb.length() + 1);
		sb.append(">");
		System.out.print(sb);
	}

}
