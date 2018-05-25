package SmithaTest;

import java.util.Arrays;

public class SameCharsInBothHalves {

	public void sameChars(String s) {

		int i = 0, j = s.length() - 1;
		boolean isSame = false;
		int mid = i + j / 2;
		char[] a1 = new char[mid+1];
		char[] a2 = new char[s.length()-1-mid];

		for (i = 0; i <= mid; i++) {
			a1[i] = s.charAt(i);
		}
		i = 0;
		for (j = mid+1; j < s.length(); j++) {
			a2[i++] = s.charAt(j);
		}

		Arrays.sort(a1);
		Arrays.sort(a2);
		
		isSame=Arrays.equals(a1, a2);
		
		if(isSame) {
			System.out.println("Two halves of the string are equal");
		}else {
			System.out.println("Two halves are not equal");
		}
	}

	public static void main(String[] args) {

		String s = "smiims";
		SameCharsInBothHalves sameCharsInBothHalves = new SameCharsInBothHalves();
		sameCharsInBothHalves.sameChars(s);
	}

}
