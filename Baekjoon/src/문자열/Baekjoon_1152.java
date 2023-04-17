package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_1152 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		
		int count = 0;
		for(String s : str) {
			if(s.trim().equals("")) continue;
			count++;
		}

		System.out.print(count);
	}

}
