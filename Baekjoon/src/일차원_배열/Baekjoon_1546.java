package 일차원_배열;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_1546 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int max = Integer.MIN_VALUE;
		int sum = 0;
		int n = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			
			sum += num;
			max = Math.max(max, num);
		}
		
		System.out.print((double)sum * 100 / max / n);
	}

}
