package SmithaTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeArray {
	
	public void mergearray(String[] a, String[] b) {
		List<String> list = new ArrayList<String>(Arrays.asList(a));
	      list.addAll(Arrays.asList(b));
	      Object[] c = list.toArray();
	      System.out.println(Arrays.toString(c));
	}

	public static void main(String args[]) {
	      String a[] = { "A", "E", "I" };
	      String b[] = { "O", "U" };
	      MergeArray mergeArray= new MergeArray();
	      mergeArray.mergearray(a, b);
	   }
}
