package SmithaTest;

public class VowelsInString {

	public void vowelsInString(String s) {
		int vowels=0,consonants=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='a'|| ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U') {
				vowels++;
			}else {
				consonants++;
			}
		}
		System.out.println("Vowels :" + vowels);
		System.out.println("consonants: " + consonants);
		
	}
	
	public static void main(String[] args) {

		String s= "AEIOU";
		VowelsInString vs= new VowelsInString();
		vs.vowelsInString(s);
		
	}

}
