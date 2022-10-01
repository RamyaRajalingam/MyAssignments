package week1.day1;

//Factorial Assignment

public class MainMethod {
	public static void main(String[] args) {
		
		int input = 5;
		int fact=1;	
		
		for (int i = input; i >=1; i--) {
				
			fact=fact*i;
			
		}
		System.out.println("Output:"+ "5*4*3*2*1=" + fact);
	} 

}
