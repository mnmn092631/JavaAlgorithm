package 일반_수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_11005 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		int remain = n;
		while (remain > 0) {
			int result = remain % b;
			if (result > 9) sb.append((char) (result + 55));
			else sb.append(result);
			remain /= b;
		}

		System.out.print(sb.reverse());
	}

}
