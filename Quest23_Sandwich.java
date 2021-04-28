package Assignment10;

public class Quest23_Sandwich {

	public static void main(String[] args) {
		
		String str="xxbreadjambreadyy";
		int first=str.indexOf("bread");
		int second=str.indexOf("bread",first+5);
	    String something=str.substring(first+5,second);
		System.out.println(something);

	}

}
