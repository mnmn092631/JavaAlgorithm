import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_1463 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] minCount = new int[1000000 + 1];
		minCount[1] = 0;
		minCount[2] = 1;
		minCount[3] = 1;

		int num = Integer.parseInt(br.readLine());

		for (int i = 4; i < num + 1; i++) {
			int count = minCount[i - 1] + 1;
			if (i % 3 == 0 && minCount[i / 3] + 1 < count)
				count = minCount[i / 3] + 1;
			if (i % 2 == 0 && minCount[i / 2] + 1 < count)
				count = minCount[i / 2] + 1;
			minCount[i] = count;
		}

		System.out.print(minCount[num]);
	}

}
