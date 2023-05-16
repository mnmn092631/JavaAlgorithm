import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2447 {

	public static String star(int i, int j, int n) {
		if (n == 1) return "*";
		if (i >= n / 3 && i <= n / 3 * 2 - 1 && j >= n / 3 && j <= n / 3 * 2 - 1) return " ";
		return star(i % (n / 3), j % (n / 3), n / 3);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				sb.append(star(i, j, n));
			}
			sb.append("\n");
		}
		
		System.out.print(sb);
	}

}
