package june_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_9095 {

	public static int getCount(int num) {
		if (num < 3) return num;
		else if (num == 3) return 4;
		else return getCount(num - 1) + getCount(num - 2) + getCount(num - 3);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			int num = Integer.parseInt(br.readLine());
			sb.append(getCount(num)).append("\n");
		}
		
		System.out.print(sb);
	}

}
