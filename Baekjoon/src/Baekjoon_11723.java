import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_11723 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		boolean[] s = new boolean[21];
		int m = Integer.parseInt(br.readLine());

		for (int i = 0; i < m; i++) {
			String str = br.readLine();

			switch (str.charAt(1)) {
			case 'd': {
				int num = Integer.parseInt(str.split(" ")[1]);
				s[num] = true;
				break;
			}

			case 'e': {
				int num = Integer.parseInt(str.split(" ")[1]);
				s[num] = false;
				break;
			}

			case 'h': {
				int num = Integer.parseInt(str.split(" ")[1]);
				if (s[num]) sb.append("1\n");
				else sb.append("0\n");
				break;
			}

			case 'o': {
				int num = Integer.parseInt(str.split(" ")[1]);
				if (s[num]) s[num] = false;
				else s[num] = true;
				break;
			}

			case 'l': {
				for(int j = 1; j < 21; j++) {
					s[j] = true;
				}
				break;
			}

			case 'm': {
				s = new boolean[21];
				break;
			}
			}

		}
		
		System.out.print(sb);
	}

}
