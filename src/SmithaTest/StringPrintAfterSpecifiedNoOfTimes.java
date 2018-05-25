package SmithaTest;

public class StringPrintAfterSpecifiedNoOfTimes {

	public void StringPrint(String s, char c, int count) {
		int number = 0, i = 0;

		for (i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c) {
				number++;
			}

			if (number == count)
				break;
		}
		

		for (i = i+1; i < s.length(); i++) {
			System.out.print(s.charAt(i));
		}

	}

	public static void main(String[] args) {

		String s = "This is demo string";
		char c = 'i';
		int count = 3;
		StringPrintAfterSpecifiedNoOfTimes stringPrintAfterSpecifiedNoOfTimes = new StringPrintAfterSpecifiedNoOfTimes();
		stringPrintAfterSpecifiedNoOfTimes.StringPrint(s, c, count);
	}

}
