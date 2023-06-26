package july_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_1913 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		int find = Integer.parseInt(br.readLine());

		int[][] arr = new int[n][n];

		int i = 0;
		int j = 0;
		int num = n * n;
		int di = 3;
		int next = n - 2;
		int findI = 0;
		int findJ = 0;
		while (num > 0) {
			if (num == find) {
				findI = i;
				findJ = j;
			}
			
			arr[i][j] = num--;
			
			if (i == j && i > n / 2) di = 1;
			else if (i + j == n - 1) {
				if (i > n / 2) di = 2;
				else di = 4;
			} else if (num == next * next) {
				next -= 2;
				di = 3;
			}

			switch (di) {
			case 1:	i--;	break;
			case 2:	j++;	break;
			case 3:	i++;	break;
			case 4:	j--;	break;
			}
		}

		for (int[] row : arr) {
			for (int num1 : row) {
				sb.append(num1).append(" ");
			}
			sb.append("\n");
		}
		
		sb.append(findI + 1).append(" ").append(findJ + 1);
		System.out.print(sb);
	}
	
}