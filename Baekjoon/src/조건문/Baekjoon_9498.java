package 조건문;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjoon_9498 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int score = Integer.parseInt(br.readLine());
		char result = 'F';
		
		if(score >= 90) result = 'A';
		else if(score >= 80) result = 'B';
		else if(score >= 70) result = 'C';
		else if(score >= 60) result = 'D';
		
		System.out.print(result);
	}

}
