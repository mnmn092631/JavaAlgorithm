import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_1003 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int[] countZero = new int[41];
		int[] countOne = new int[41];

		countZero[0] = 1;
		countOne[1] = 1;

		for (int i = 2; i < 41; i++) {
			countZero[i] = countZero[i - 1] + countZero[i - 2];
			countOne[i] = countOne[i - 1] + countOne[i - 2];
		}

		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			sb.append(countZero[n]).append(" ").append(countOne[n]).append("\n");
		}

		System.out.print(sb);
	}

}
