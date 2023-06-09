import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_15829 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int l = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		long result = 0L;
		long pow = 1L;
		int m = 1234567891;
		for (int i = 0; i < l; i++) {
			int n = str.charAt(i) - 96;
			result = (result + (n * pow % m)) % m;
			pow = pow * 31 % m;
		}
		System.out.print(result);
	}

}
