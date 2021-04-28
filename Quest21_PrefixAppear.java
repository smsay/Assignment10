package Assignment10;

public class Quest21_PrefixAppear {

	public static void main(String[] args) {
		
		String str = "abXYabc";
		int limit = 2;
		int count = 0;
		boolean flag = false;

		String appear=str.substring(0, limit);

		for (int i = 0; i < str.length(); i++) {
			if (str.contains(appear)) {
				flag = true;
				count++;
				str = str.replaceFirst(appear, "");
			}
		}
		System.out.println(flag +"\n" + appear + " appears " + count+" times");

		
	}
	
}
