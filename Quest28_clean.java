package Assignment10;

public class Quest28_clean {

	public static void main(String[] args) {
		
		clean("he said bla bla bla","bla");

	}

	public static void clean(String text,String badWord) {
	
		for (int i = 0; i <= text.length() - badWord.length(); i++) {
			if (text.substring(i, i + badWord.length()).equals(badWord)) {
				text = text.replace(text.substring(i, i + badWord.length()), "");
			}
		}
		System.out.println(text);
		
	}
}
