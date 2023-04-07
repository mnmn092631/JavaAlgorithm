package 반복문;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjoon_2739 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= 9; i++) {
			sb.append(num).append(" * ").append(i).append(" = ").append(num * i).append("\n");
		}
		
		System.out.print(sb);
	}

}
