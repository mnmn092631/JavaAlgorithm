import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_1475 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] n = br.readLine().toCharArray();
		int[] count = new int[8 + 1];

		for (char c : n) {
			int i = Character.getNumericValue(c);
			if (i == 9) count[6]++;
			else count[i]++;
		}

		count[6] = (int) Math.ceil((double) count[6] / 2);

		int result = 0;
		for (int num : count) {
			if (num > result) result = num;
		}

		System.out.print(result);
	}

}
