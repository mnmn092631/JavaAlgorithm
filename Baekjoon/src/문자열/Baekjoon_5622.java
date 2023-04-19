package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_5622 {
	public static int time = 0;

	public static void addTime(int alphabet) {
		if (alphabet < 68) time += 3;
		else if (alphabet < 71) time += 4;
		else if (alphabet < 74) time += 5;
		else if (alphabet < 77) time += 6;
		else if (alphabet < 80) time += 7;
		else if (alphabet < 84) time += 8;
		else if (alphabet < 87) time += 9;
		else time += 10;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		for (int i = 0; i < str.length(); i++) {
			addTime(str.charAt(i));
		}

		System.out.print(time);
	}

}
