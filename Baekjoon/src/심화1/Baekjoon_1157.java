package 심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Baekjoon_1157 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().toUpperCase();
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i = 0; i < str.length(); i++) {
			char alphabet = str.charAt(i);
			if(map.containsKey(alphabet)) {
				map.put(alphabet, map.get(alphabet) + 1);
			}else {
				map.put(alphabet, 1);
			}
		}
		
		int max = Integer.MIN_VALUE;
		for(int num : map.values()) {
			if(num > max) max = num;
		}
		
		char result = ' ';
		for(char key : map.keySet()) {
			if(map.get(key) == max) {
				if(result == ' ') {
					result = key;
				} else result = '?';
			}
		}
		
		System.out.print(result);
	}

}
