package 브루트_포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_1436 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int num = 665;

		while (n > 0) {
			num++;
			if (Integer.toString(num).indexOf("666") != -1) n -= 1;
		}
		
		System.out.print(num);
	}

}
