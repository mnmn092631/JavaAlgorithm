package 이차원_배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_2563 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int count = Integer.parseInt(br.readLine());
		boolean[][] paper = new boolean[100][100];
		int area = 0;
		
		for(int i = 0; i < count; i ++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken()) - 1;
			int y = Integer.parseInt(st.nextToken()) - 1;
			
			for(int j = x; j < x + 10; j++) {
				for(int k = y; k < y + 10; k++) {
					if(paper[j][k]) continue; 
					paper[j][k] = true;
					area++;
				}
			}
		}
		
		System.out.print(area);
	}

}
