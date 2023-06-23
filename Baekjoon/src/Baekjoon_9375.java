import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Baekjoon_9375 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			Map<String, Integer> map = new HashMap<>();
			while (n-- > 0) {
				String cate = br.readLine().split(" ")[1];
				if (map.containsKey(cate)) map.put(cate, map.get(cate) + 1);
				else map.put(cate, 1);
			}
			int result = 1;
			for (int num : map.values()) {
				result *= (num + 1);
			}
			sb.append(result - 1).append("\n");
		}

		System.out.print(sb);
	}

}
