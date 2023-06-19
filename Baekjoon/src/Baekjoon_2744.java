import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2744 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		char[] str = br.readLine().toCharArray();
		
		for(int i = 0; i < str.length; i++) {
			if (str[i] < 91) sb.append((char)(str[i] + 32));
			else sb.append((char)(str[i] - 32));
		}
		
		System.out.print(sb);
	}

}
