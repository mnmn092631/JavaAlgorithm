import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2577 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());

		int[] counts = new int[10];
		int multiple = a * b * c;
		while (multiple > 0) {
			int num = multiple % 10;
			counts[num] += 1;
			multiple /= 10;
		}

		for (int count : counts) {
			sb.append(count).append("\n");
		}

		System.out.print(sb);
	}

}
