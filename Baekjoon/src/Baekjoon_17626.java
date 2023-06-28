import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_17626 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int[] nums = new int[50000 + 1];
		for (int i = 1; i <= n; i++) {
			if ((long) i * i <= n) nums[i * i] = 1;
			for (int j = 1; i + j * j <= n; j++) {
				if (nums[i + j * j] == 0) nums[i + j * j] = nums[i] + 1;
				else nums[i + j * j] = Math.min(nums[i + j * j], nums[i] + 1);
			}
		}

		System.out.print(nums[n]);
	}

}
