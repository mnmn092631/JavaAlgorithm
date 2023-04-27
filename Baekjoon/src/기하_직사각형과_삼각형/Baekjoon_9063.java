package 기하_직사각형과_삼각형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_9063 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());
		int xMax = Integer.MIN_VALUE, xMin = Integer.MAX_VALUE, yMax = Integer.MIN_VALUE, yMin = Integer.MAX_VALUE;

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if (a > xMax) xMax = a;
			if (a < xMin) xMin = a;
			if (b > yMax) yMax = b;
			if (b < yMin) yMin = b;
		}
		System.out.print((xMax - xMin) * (yMax - yMin));
	}

}
