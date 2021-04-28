package Assignment10;

public class Quest16_JavaAppears {

	public static void main(String[] args) {
		
		String str="javaxxx";
	//	String str="xjavaxx";
	//	String str="xxjavaxx";
		
		if(str.length()<4) {
			System.out.println("invalid");
		}else {
			if(str.indexOf("java")==0||str.indexOf("java")==1) {
				System.out.println(true);
				}else {
					System.out.println(false);
				}
			
		}
		

	}

}
