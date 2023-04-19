package 심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_3003 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int[] chess = { 1, 1, 2, 2, 2, 8 };
		for(int num : chess) {
			sb.append(num - Integer.parseInt(st.nextToken())).append(" ");
		}
		
		System.out.print(sb);
	}

}
