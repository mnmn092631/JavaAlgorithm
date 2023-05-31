import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_1259 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String str;
		while (!(str = br.readLine()).equals("0")) {
			boolean isPalin = true;
			for (int i = 0; i < str.length() / 2; i++) {
				if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
					isPalin = false;
					break;
				}
			}
			if (isPalin) sb.append("yes").append("\n");
			else sb.append("no").append("\n");
		}
		
		System.out.print(sb);
	}

}
