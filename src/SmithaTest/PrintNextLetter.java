package SmithaTest;

public class PrintNextLetter {

	public void printNextLetter(String s, int n) {
		
		for(int i=0;i<=s.length()-n;i++) {
			for(int j=i;j<i+n;j++) {
				System.out.print(s.charAt(j)+ " ");
			}
		}
			  /*for (int i = 0; i <= s.length() - n; i++) {
			   for (int j = i; j < i+n; j++) {
			    System.out.print(s.charAt(j) + " ");
			   }
			  }*/
		
		
		/*for(int i=0;i<=s.length()-n;i++) {
			for(int j=i;j<=s.length()-n;j++) {
				System.out.print(s.charAt(j)+ " ");
			}
		} //to get output by removing characters o/p=S M I T H M I T H I T H T H H */
		
		/*Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			while (i < d) {
				if (!map.containsKey(s.charAt(i))) {
					map.put(s.charAt(i), 1);
				}
				for (Entry<Character, Integer> e : map.entrySet()) {
				
					char ch1 = e.getKey().charValue();
					char ch2 = e.getKey().charValue();
					System.out.println(ch1 + ch2);
				}

			}
		}*/
	}
	
	public void print() {
		
	}

	public static void main(String[] args) {

		String s = "SMITHA";
		PrintNextLetter printNextLetter = new PrintNextLetter();
		printNextLetter.printNextLetter(s, 3);
	}

}
