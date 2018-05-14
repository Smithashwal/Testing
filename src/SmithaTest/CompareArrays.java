package SmithaTest;

import java.util.Arrays;

public class CompareArrays {

	public void compareArrays(int[] a1, int[] a2, int[] a3) {
		System.out.println("Is array 1 equal to array 2? " + Arrays.equals(a1, a2));
		System.out.println("Is array 1 equal to array 3? " + Arrays.equals(a1, a3));
	}

	public static void main(String[] args) {
		int[] a1 = { 1, 2, 3, 4, 5, 6 };
		int[] a2 = { 1, 2, 3, 4, 5, 6 };
		int[] a3 = { 1, 2, 3, 4 };
		CompareArrays compareArrays = new CompareArrays();
		compareArrays.compareArrays(a1, a2, a3);

	}
}
