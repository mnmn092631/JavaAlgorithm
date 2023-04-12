package 일차원_배열;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjoon_3052 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[10];
		
		for(int i = 0; i < 10; i++) {
			arr[i] = Integer.parseInt(br.readLine()) % 42;
		}
		
		int count = 10;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					count--;
					break;
				}
			}
		}
		
		System.out.print(count);
	}

}
