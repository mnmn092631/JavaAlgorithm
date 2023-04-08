package 반복문;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjoon_2439 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			for(int j = n - i; j > 1; j--) {
				sb.append(" ");
			}
			for(int k = 0; k <= i; k++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		
		System.out.print(sb);
	}

}
