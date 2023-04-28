package 브루트_포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2231 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int result = 0;

		for (int i = 1; i < n; i++) {
			int sum = i;
			String strN = Integer.toString(i);
			
			for(int j = 0; j < strN.length(); j++) {
				sum += Character.getNumericValue(strN.charAt(j));
			}
			
			if(n == sum) {
				result = i;
				break;
			}
		}
		
		System.out.print(result);
	}

}
