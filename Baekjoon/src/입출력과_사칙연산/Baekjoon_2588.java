package 입출력과_사칙연산;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjoon_2588 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());
		
		int hd = num2 / 100;
		int td = (num2 - (hd * 100)) / 10;
		int ud = (num2 - (hd * 100) - (td * 10));
		
		System.out.println(num1 * ud);
		System.out.println(num1 * td);
		System.out.println(num1 * hd);
		System.out.println(num1 * num2);
	}

}
