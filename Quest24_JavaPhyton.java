package Assignment10;

public class Quest24_JavaPhyton {

	public static void main(String[] args) {
	
		String word = "We study java not python java";
		int counterJava = 0;
		int counterPython = 0;
		String java = "java";
		String python = "python";

		for (int i = 0; i <= word.length() - java.length(); i++) {
			if (word.substring(i, i + java.length()).equals(java)) {
				counterJava++;
			}
		}

		for (int i = 0; i <= word.length() - python.length(); i++) {
			if (word.substring(i, i + python.length()).equals(python)) {
				counterPython++;
			}
		}
		
		if (counterJava == counterPython) {
			System.out.println(true);
		} else {
			System.out.println(false);
	}

}}
