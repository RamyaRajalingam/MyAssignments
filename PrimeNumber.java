package week1.day2;

public class PrimeNumber {	
public static void main(String[] args) {
	

	int input=11;
	boolean isprime= true;
	for (int i=2;i<input-1;i++) 
	{
				
		if (input%i==0) {
		isprime=false;
		System.out.println(input+" is not a Prime no");
		break;
		}}
		
		if (isprime) {
			System.out.println(input+" is a prime number");
			
	}	
		
}

}

