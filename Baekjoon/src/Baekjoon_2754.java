import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2754 {

	public static float getSocre(char[] grade) {
		float score = 0.0F;

		switch (grade[0]) {
		case 'A': {
			score += 4;
			break;
		}
		case 'B': {
			score += 3;
			break;
		}
		case 'C': {
			score += 2;
			break;
		}
		case 'D': {
			score += 1;
			break;
		}
		}

		switch (grade[1]) {
		case '+': {
			score += 0.3F;
			break;
		}
		case '-': {
			score -= 0.3F;
			break;
		}
		}

		return score;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] grade = br.readLine().toCharArray();

		if (grade[0] == 'F') System.out.print(0.0);
		else System.out.print(getSocre(grade));
	}
}
