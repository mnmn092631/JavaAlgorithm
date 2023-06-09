import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_2420 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		long a = Integer.parseInt(st.nextToken());
		long b = Integer.parseInt(st.nextToken());
		long result = a - b;

		if (result < 0) result *= -1;

		System.out.print(result);
	}

}
