package SmithaTest;

import java.util.ArrayList;

public class RemoveElementFromArray {
	public static void main(String[] args) {
		ArrayList<String> remove = new ArrayList<String>();
	      remove.clear();
	      remove.add(0, "0");
	      remove.add(1, "1");
	      remove.add(2, "2");
	      System.out.println("Array before removing an element"+remove);
	      remove.remove(1);
	      remove.remove("0");
	      System.out.println("Array after removing an element"+remove);
	   }
}
