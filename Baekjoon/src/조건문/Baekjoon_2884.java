package 조건문;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_2884 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int hour = Integer.parseInt(st.nextToken());
		int min = Integer.parseInt(st.nextToken()) - 45;
		
		if(min < 0) {
			min += 60;
			
			if(hour == 0) hour = 23;
			else hour--;
		}
		
		sb.append(hour).append(" ").append(min);
		System.out.print(sb);
	}

}
