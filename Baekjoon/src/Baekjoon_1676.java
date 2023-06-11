import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_1676 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int count = 0;

		for (int i = 0; i <= n; i += 5) {
			if(i == 0) continue;
			if (i % 125 == 0) count += 3;
			else if (i % 25 == 0) count += 2;
			else if (i % 5 == 0) count++;
		}
		System.out.print(count);
	}
	
}