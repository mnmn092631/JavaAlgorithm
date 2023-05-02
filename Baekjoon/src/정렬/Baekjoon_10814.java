package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon_10814 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		String[][] list = new String[n][2];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			list[i][0] = st.nextToken();
			list[i][1] = st.nextToken();
		}
		
		Arrays.sort(list, (a, b) -> a[0].equals(b[0])? 0 : Integer.parseInt(a[0]) - Integer.parseInt(b[0]));
		
		for(String[] mem : list) {
			sb.append(mem[0]).append(" ").append(mem[1]).append("\n");
		}
		
		System.out.print(sb);
	}

}
