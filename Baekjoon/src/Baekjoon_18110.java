import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon_18110 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int delNum = (int) Math.round(n * 0.15);

		int[] diffs = new int[n];
		for (int i = 0; i < n; i++) {
			diffs[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(diffs);
		
		double sum = 0;
		for(int i = delNum; i < n - delNum; i++) {
			sum += diffs[i];
		}
		System.out.print((int) Math.round(sum / (n - 2 * delNum)));
	}

}
