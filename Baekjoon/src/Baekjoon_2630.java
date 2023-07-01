import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_2630 {
	public static boolean[][] paper;
	public static int countBlue = 0;
	public static int countWhite = 0;

	public static void cutPaper(int startI, int startJ, int len, int dep) {
		boolean isWhite = paper[startI][startJ];
		boolean isSame = true;
		for (int i = startI; i < startI + len; i++) {
			for (int j = startJ; j < startJ + len; j++) {
				if (paper[i][j] != isWhite) {
					isSame = false;
					break;
				}
			}
			if (!isSame) break;
		}

		if (isSame) {
			if (isWhite) countWhite += 1;
			else countBlue += 1;
		} else {
			cutPaper(startI, startJ, len / 2, dep + 1);
			cutPaper(startI, startJ + len / 2, len / 2, dep + 1);
			cutPaper(startI + len / 2, startJ, len / 2, dep + 1);
			cutPaper(startI + len / 2, startJ + len / 2, len / 2, dep + 1);
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());

		paper = new boolean[n][n];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				if (st.nextToken().equals("1")) continue;
				else paper[i][j] = true;
			}
		}

		cutPaper(0, 0, n, 1);

		System.out.println(countWhite);
		System.out.println(countBlue);
	}

}
