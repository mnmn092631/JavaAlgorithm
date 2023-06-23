import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_11726 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] cases = new int[1001];
		int n = Integer.parseInt(br.readLine());

		cases[1] = 1;
		cases[2] = 2;

		for (int i = 3; i <= n; i++) {
			cases[i] = (cases[i - 1] + cases[i - 2]) % 10007;
		}

		System.out.print(cases[n]);
	}

}
