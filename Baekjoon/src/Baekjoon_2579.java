import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2579 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		int[] steps = new int[t + 1];

		for (int i = 1; i < t + 1; i++) {
			steps[i] = Integer.parseInt(br.readLine());
		}

		int[] scores = new int[t + 1];
		scores[1] = steps[1];
		if (t >= 2) scores[2] = scores[1] + steps[2];
		if (t >= 3) {
			for (int i = 3; i < t + 1; i++) {
				scores[i] = Math.max(steps[i] + steps[i - 1] + scores[i - 3], scores[i - 2] + steps[i]);
			}
		}

		System.out.print(scores[t]);
	}

}