package Assignment10;

public class Quest30_at3 {

	public static void main(String[] args) {
		System.out.println(at3("longword","foo"));
	}

	public static String at3(String a,String b) {
		return(a.substring(0, 3).concat(b).concat(a.substring(3, a.length())));
	}
}
