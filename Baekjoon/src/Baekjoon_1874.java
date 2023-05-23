import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Baekjoon_1874 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		int max = 0;

		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());
			
			for (int j = max + 1; j <= num; j++) {
				stack.add(j);
				sb.append("+").append("\n");
			}
			
			if (num > max) max = num;
			
			while (!stack.empty()) {
				if (stack.peek() != num) break;
				stack.pop();
				sb.append("-").append("\n");
			}
		}
		
		System.out.print(stack.size() > 0 ? "NO" : sb);
	}

}
