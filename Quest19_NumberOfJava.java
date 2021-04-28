package Assignment10;

public class Quest19_NumberOfJava {

	public static void main(String[] args) {
		
		String str="javaxjavaxxjavaxx";
		int count=0;
		for(int i=0;i<str.length()-3;i++) {
			if(str.substring(i,i+4).equals("java")) {
				count++;
			}
			
		}System.out.println(count);

	}

}
