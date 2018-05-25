package SmithaTest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RemoveCharsFromString {

	public void removeChars(String s1, String s2) {
		/*int i = 0, j = 0;
		char[] a1 = s1.toCharArray();
		char[] a2 = s2.toCharArray();
		System.out.println("The s2 string's character to be compared is: " + a2[j]);
		System.out.print("The output string is: ");
		for (i = 0; i < a1.length; i++) {
			if (a1[i] == a2[j]) {
				char temp = a1[i];
				System.out.println("the repeating char is : " + temp);
			}
		}
*/
		
		//Using Hashmap
		/*Map<Character,Integer> map= new HashMap<Character, Integer>();
		for(int i=0;i<s2.length();i++) {
			map.put(s2.charAt(i), 1);
		}
		StringBuilder sb= new StringBuilder();
		for(int i=0;i<s1.length();i++) {
			if(!map.containsKey(s1.charAt(i))) {
				sb.append(s1.charAt(i));
			}
		}
		System.out.println("The remaining string is : " + sb.toString());*/
		
		//Using hashset
		Set<Character> set = new HashSet<>();
		for(int i=0;i<s2.length();i++) {
			set.add(s2.charAt(i));
		}
		
		StringBuilder sb= new StringBuilder();
		for(int i=0;i<s1.length();i++) {
			if(!set.contains(s1.charAt(i))) {
				sb.append(s1.charAt(i));
			}
		}
		System.out.println("The remaining string is : " + sb.toString());
	}

	public static void main(String[] args) {

		String s1 = "abcdef";
		String s2 = "ef";

		RemoveCharsFromString removeCharsFromString = new RemoveCharsFromString();
		removeCharsFromString.removeChars(s1, s2);
	}

}
