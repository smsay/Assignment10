package Assignment10;

public class Quest22_Html {

	public static void main(String[] args) {
		
		
                String html="<!DOCTYPE html><html><head><title>Java</title></head><body><p id=\"myid\"></p></body></html>";

		if(!html.contains("html")) {
			System.out.println("invalid input!");
		}else {
		int start= html.indexOf('"');
		int fin= html.indexOf('"', start+1);

		String output=html.substring(start+1,fin);
		System.out.println(output);
	}}

}
