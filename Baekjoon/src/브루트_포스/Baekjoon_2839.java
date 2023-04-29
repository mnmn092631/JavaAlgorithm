package 브루트_포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2839 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int result = 0;
		
		for(int i = 0; i <= n/3; i++) {
			for(int j = 0; j <= n/5; j++) {
				if(n - 5 * j - 3 * i == 0) {
					result = i + j;
					break;
				}
			}
			if(result != 0) break;
		}
		
		System.out.print(result == 0 ? -1 : result);
	}

}
