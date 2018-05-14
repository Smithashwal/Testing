package SmithaTest;

public class ArrayRotation {

	public void leftRotateByOne(int[] a) {
		
		int i;
		int temp = a[0];
		for (i = 0; i < a.length-1; i++) {
			a[i] = a[i + 1];
			
		}
		a[i] = temp;
	}

	void leftRotate(int a[], int d) {
		int i;
		for (i = 0; i < d; i++)
			leftRotateByOne(a);
	}

	public void printArray(int[] a) {
		System.out.println("The array is: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
		ArrayRotation arrayRotation = new ArrayRotation();
		arrayRotation.leftRotate(a, 2);
		arrayRotation.printArray(a);
	}

}
