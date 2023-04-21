package 일반_수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_2745 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		String n = st.nextToken();
		int b = Integer.parseInt(st.nextToken());

		int result = 0;
		for (int i = 0; i < n.length(); i++) {
			int num = n.charAt(i);
			if (num >= 65 && num <= 90) num -= 55;
			else num = Character.getNumericValue(num);
			result += num * Math.pow(b, n.length() - 1 - i);
		}

		System.out.print(result);
	}

}
