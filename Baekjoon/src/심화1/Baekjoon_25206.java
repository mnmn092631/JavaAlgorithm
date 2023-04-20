package 심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_25206 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		double totalSum = 0.0;
		double scoreSum = 0.0;

		for (int i = 0; i < 20; i++) {
			st = new StringTokenizer(br.readLine());
			st.nextToken();
			double score = Double.parseDouble(st.nextToken());
			String grade = st.nextToken();
			
			if (grade.equals("P"))
				continue;

			if (grade.equals("A+")) {
				totalSum += (4.5 * score);
			} else if (grade.equals("A0")) {
				totalSum += (4.0 * score);
			} else if (grade.equals("B+")) {
				totalSum += (3.5 * score);
			} else if (grade.equals("B0")) {
				totalSum += (3.0 * score);
			} else if (grade.equals("C+")) {
				totalSum += (2.5 * score);
			} else if (grade.equals("C0")) {
				totalSum += (2.0 * score);
			} else if (grade.equals("D+")) {
				totalSum += (1.5 * score);
			} else if (grade.equals("D0")) {
				totalSum += score;
			}

			scoreSum += score;
		}
		
		System.out.print(totalSum / scoreSum);
	}

}
