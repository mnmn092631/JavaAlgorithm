import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_1789 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());

		int count = 0;
		for (long i = 1; i <= n; i++) {
			n -= i;
			count++;
		}

		System.out.print(count);
	}

}
