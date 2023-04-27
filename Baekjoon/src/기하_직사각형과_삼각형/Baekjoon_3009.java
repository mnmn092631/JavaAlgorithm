package 기하_직사각형과_삼각형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Baekjoon_3009 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		ArrayList<Integer> listX = new ArrayList<>(2);
		ArrayList<Integer> listY = new ArrayList<>(2);

		for (int i = 0; i < 3; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

			if (!listX.contains(x)) listX.add(x);
			else listX.remove(listX.indexOf(x));

			if (!listY.contains(y)) listY.add(y);
			else listY.remove(listY.indexOf(y));
		}

		System.out.print(listX.get(0) + " " + listY.get(0));
	}

}
