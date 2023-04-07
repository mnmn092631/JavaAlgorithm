package 반복문;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjoon_8393 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int sum = 0;
		
		for(int i = 1; i <= num; i++) sum += i;
		
		System.out.print(sum);
	}

}
