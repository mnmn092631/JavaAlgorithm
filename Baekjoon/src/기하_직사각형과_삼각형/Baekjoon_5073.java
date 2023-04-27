package 기하_직사각형과_삼각형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_5073 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		while (true) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());

			if ((a + b + c) == 0) break;

			int max = Math.max(a, Math.max(b, c));
			int sumT = a + b + c - max;
			
			if(max >= sumT) sb.append("Invalid").append("\n");
			else if(a == b && b == c) sb.append("Equilateral").append("\n");
			else if(a == b || a == c || b == c) sb.append("Isosceles").append("\n");
			else sb.append("Scalene").append("\n");
		}
		System.out.print(sb);
	}

}
