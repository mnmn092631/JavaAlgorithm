package 심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2941 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] croatia = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };

		for (String alphabet : croatia) {
			str = str.replaceAll(alphabet, "*");
		}

		System.out.println(str.length());
	}

}
