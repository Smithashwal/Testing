package SmithaTest;

public class MinMaxArray {
	
	public void minMaxArray(int[] a) {
		int small = a[0];
	      int large = a[0];
	      
	      for(int i = 1; i< a.length; i++) {
	         if(a[i] > large)
	        	 large = a[i];
	         else if (a[i] < small)
	        	 small = a[i];
	      } 
	      System.out.println("Largest Number is : " + large);
	      System.out.println("Smallest Number is : " + small);
	}

	public static void main(String[] args) {
	      int[] a = {8, 2, 7, 1, 4, 9, 5};
	      MinMaxArray minMaxArray=new MinMaxArray();
	      minMaxArray.minMaxArray(a);
	   }
}
