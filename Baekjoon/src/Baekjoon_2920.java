import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_2920 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		boolean isAscending = true;
		boolean isDescending = true;

		for (int i = 1; i < 9; i++) {
			int num = Integer.parseInt(st.nextToken());
			if (num != i) isAscending = false;
			if (num != 9 - i) isDescending = false;
		}

		if (isAscending) System.out.print("ascending");
		else if (isDescending) System.out.print("descending");
		else System.out.print("mixed");
	}

}
