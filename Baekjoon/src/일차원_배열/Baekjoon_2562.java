package 일차원_배열;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjoon_2562 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int max = Integer.MIN_VALUE;
		int idx = 0;
		
		for(int i = 0; i < 9; i++) {
			int num = Integer.parseInt(br.readLine());
			
			if(num > max) {
				max = num;
				idx = i + 1;
			}
		}
		
		System.out.print(max + "\n" + idx);
	}

}
