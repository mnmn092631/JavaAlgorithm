import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_9461 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int t = Integer.parseInt(br.readLine());

		long[] cases = new long[101];
		cases[1] = 1;
		cases[2] = 1;
		cases[3] = 1;
		cases[4] = 2;
		cases[5] = 2;
		for (int i = 6; i <= 100; i++) {
			cases[i] = cases[i - 5] + cases[i - 1];
		}
		while (t-- > 0) {
			int num = Integer.parseInt(br.readLine());
			sb.append(cases[num]).append("\n");
		}
		
		System.out.print(sb);
	}

}
