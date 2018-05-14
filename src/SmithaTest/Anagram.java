package SmithaTest;

import java.util.Arrays;

public class Anagram {

	public void isAnagram(String s1, String s2) {
		boolean status = false;
		if (s1.length() != s2.length()) {
			System.out.println("Not an anagram");
		} else {
			char[] a1 = s1.toLowerCase().toCharArray();
			char[] a2 = s2.toLowerCase().toCharArray();

			Arrays.sort(a1);
			Arrays.sort(a2);

			status = Arrays.equals(a1, a2);
		}
		if (status) {
			System.out.println(s1 + " and " + s2 + " are anagrams");
		} else {
			System.out.println(s1 + " and " + s2 + " are not anagrams");
		}

	}

	public static void main(String[] args) {

		String s1 = "LISTEN";
		String s2 = "SILENT";

		Anagram anagram = new Anagram();
		anagram.isAnagram(s1, s2);
	}

}
