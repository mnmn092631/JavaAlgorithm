package 일차원_배열;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_10807 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken()); 
		}
		
		int count = 0;
		int v = Integer.parseInt(br.readLine());
		
		for(int num : arr) {
			if(num == v) count++;
		}
		
		System.out.print(count);
	}

}
