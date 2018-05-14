package SmithaTest;


public class RemoveThreeRepeatingChars {

	public void removeThreeRepeatingChars(String s) {
		
		int i=0,j=0;
		while(i<s.length()-2) {
			for(j=i;j<i+3;j++) {
				if(s.charAt(i)!=s.charAt(j)) {
					System.out.println(s.charAt(i));
					i++;
					break;
				}
			}
			i=j;
			
		}
		
		//return s.toString();
		
		//int i=0,j=s.length()-1;
			/*for(i=0;i<s.length();i++) {
				for(j=i+1;j<s.length();j++) {
					if(s.charAt(i)== s.charAt(j) && s.charAt(i)== s.charAt(j+1)) {
						i+=3;
						j+=3;
						
					}else {
						j=i+2;
						//i+=3;
						System.out.print(s.charAt(j));
					}
				}
			}*/
		

		
	}

	public static void main(String[] args) {

		String s = "aaabbbaaababb";
		RemoveThreeRepeatingChars removeThreeRepeatingChars = new RemoveThreeRepeatingChars();
		removeThreeRepeatingChars.removeThreeRepeatingChars(s);
	}

}
