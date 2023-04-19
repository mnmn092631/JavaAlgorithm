package 심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_10988 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		System.out.print(isPalin(str));
	}
	
	public static int isPalin(String str) {
		for(int i = 0; i < str.length() / 2; i++) {
			if(str.charAt(i) != str.charAt(str.length() - i - 1)) {
				return 0;
			}
		}
		return 1;
	}

}
