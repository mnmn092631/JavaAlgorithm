package 일차원_배열;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjoon_5597 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean[] arr = new boolean[30];
		
		for(int i = 0; i < 28; i++) {
			int n = Integer.parseInt(br.readLine());
			
			arr[n - 1] = true;
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == false) System.out.println(i + 1);
		}
	}

}
