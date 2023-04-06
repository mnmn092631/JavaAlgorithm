package 조건문;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_2525 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int hour = Integer.parseInt(st.nextToken());
		int min = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(br.readLine());
		
		int totalMin = hour * 60 + min + n;
		
		hour = (totalMin / 60) % 24;
		min = totalMin % 60;
		
		sb.append(hour).append(" ").append(min);
		System.out.print(sb);
	}

}
