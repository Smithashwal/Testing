package SmithaTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class RepeatVowels {

	@SuppressWarnings("unlikely-arg-type")
	public void repeatedVowels(String s) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for (int i = 0; i < s.length(); i++) {
			if (!map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), 1);
			} else {
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			}
		}
		@SuppressWarnings("unused")
		int count = 0;
		for (Entry<Character, Integer> e : map.entrySet()) {
			if (e.getValue() > 1) {
				count++;
			}
			
			if (e.getKey().equals('a') || e.getKey().equals('A') || e.getKey().equals('e') || e.getKey().equals('E')
					|| e.getKey().equals('i') || e.getKey().equals('I') || e.getKey().equals('o')
					|| e.getKey().equals('O') || e.getKey().equals('u') || e.getKey().equals('U')) {
				System.out.println("The key is: " + e.getKey()+ " It's value is: " + e.getValue());
			}
		}

	}

	public static void main(String[] args) {

		String s = "AAAAAASMIII";
		RepeatVowels repeatVowels = new RepeatVowels();
		repeatVowels.repeatedVowels(s);
	}

}
