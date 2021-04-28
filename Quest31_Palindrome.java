package Assignment10;

import utility.StringUtility;

public class Quest31_Palindrome {

	public static void main(String[] args) {
	
		System.out.println(isPalindrome("anna"));
		System.out.println(isPalindrome("annay"));

	}

	public static boolean isPalindrome(String str) {
		
		String result="";
	    for(int i=str.length()-1;i>=0;i--) {
	    	result+=str.charAt(i);
	    }
	    boolean isPalindrome=result.equalsIgnoreCase(str);
		return isPalindrome;
	}
}
