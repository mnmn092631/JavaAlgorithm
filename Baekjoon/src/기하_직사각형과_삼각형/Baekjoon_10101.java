package 기하_직사각형과_삼각형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_10101 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int sum = a + b + c;

		if (sum != 180) System.out.print("Error");
		else if (a == b && b == c) System.out.print("Equilateral");
		else if (a == b || a == c || b == c) System.out.print("Isosceles");
		else System.out.print("Scalene");
	}

}
