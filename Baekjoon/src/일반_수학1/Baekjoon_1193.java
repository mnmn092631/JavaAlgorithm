package 일반_수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_1193 {

	public static int getNum(int num, int mid) {
		while (num > mid * 2 - 1) {
			num -= mid * 2 - 1;
			mid += 2;
		}
		if (num > mid)
			num = 2 * mid - num;
		return num;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());

		sb.append(getNum(n, 1)).append("/").append(getNum(n, 2));
		System.out.print(sb);
	}

}
