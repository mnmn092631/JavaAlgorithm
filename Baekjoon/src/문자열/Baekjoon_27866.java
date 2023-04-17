package 문자열;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjoon_27866 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		int i = Integer.parseInt(br.readLine());

		System.out.print(s.charAt(i - 1));
	}
	
}
