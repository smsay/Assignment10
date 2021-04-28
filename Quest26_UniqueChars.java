package Assignment10;

public class Quest26_UniqueChars {

	public static void main(String[] args) {
		
		String word = "mamama";
		uniqueChars(word);

	}

	private static void uniqueChars(String word) {
		
		String newWord = "";
		for (int i = 0; i < word.length(); i++) {
			for (int j = 0; j < word.length(); j++) {
				if (word.charAt(i) == word.charAt(j)) {
					if (newWord.contains(word.charAt(i) + "")) {
						continue;
					}

					newWord += word.charAt(i);
				}
			}
		}

		System.out.println(newWord);

	}

}
