package Assignment10;

public class Quest20_Factorial {

	public static void main(String[] args) {
		
		int num=5;
		int fact=1;
		if (num<0) {
			System.out.println(num+" is a negative number,can not calculated");
		}else{for(int i=1;i<=num;i++) {
			fact*=i;
		}System.out.println(num+"!="+fact);
		}
		

	}

}
