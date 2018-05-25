package SmithaTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FrequencyOfChars {

	public void frequencyOfChars(String s) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {
			if (!map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), 1);
			} else {
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			}
		}

		int count = 0, maxCount = 0;
		char ch;

		System.out.println("The frequency of all the characters is: ");
		for (Entry<Character, Integer> e : map.entrySet()) {
			count = e.getValue();
			ch = e.getKey();
			System.out.println("character : " + ch + "  it's count : " + count);

			if (count > maxCount) {
				maxCount = count;
			}
			
		}
		System.out.println("maximum count is: " + maxCount);

	}

	public static void main(String[] args) {

		String s = "xyyz";
		FrequencyOfChars frequencyOfChars = new FrequencyOfChars();
		frequencyOfChars.frequencyOfChars(s);
	}

}
