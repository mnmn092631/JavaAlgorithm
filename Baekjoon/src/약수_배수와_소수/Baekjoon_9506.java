package 약수_배수와_소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class Baekjoon_9506 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		while (true) {
			int n = Integer.parseInt(br.readLine());
			if (n == -1)
				break;

			ArrayList<Integer> list = new ArrayList<>();
			int sum = 0;
			for (int i = 1; i < n; i++) {
				if (n % i == 0) {
					sum += i;
					list.add(i);
				}
			}

			sb.append(n).append(" ");
			if (n == sum) {
				sb.append("= ");
				Iterator<Integer> iter = list.iterator();
				while (iter.hasNext()) {
					sb.append(iter.next());
					if (iter.hasNext())
						sb.append(" + ");
				}
				sb.append("\n");
			} else
				sb.append("is NOT perfect.\n");

		}
		System.out.print(sb);
	}

}
