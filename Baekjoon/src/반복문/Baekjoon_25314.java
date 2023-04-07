package 반복문;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjoon_25314 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine()) / 4;
		
		for(int i = 0; i < n; i++) sb.append("long ");
		sb.append("int");
		
		System.out.print(sb);
	}

}
