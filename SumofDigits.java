package week1.day2;

//import jdk.internal.misc.FileSystemOption;

public class SumofDigits {
	
	public static void main(String[] args) {
		int number=269;
		int total=0;
		int remainder;
		System.out.println("The given number is "+number);
		
	while (number>0) 
	{
		remainder=number%10;
		System.out.println(remainder);
		total= total+remainder;
	
		number= number/10;
		System.out.println(number);
				
	}
		System.out.println("The sum of digits "+total);
		
		
	}

}
