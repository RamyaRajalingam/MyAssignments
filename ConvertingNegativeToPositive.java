package week1.day2;

public class ConvertingNegativeToPositive {
	
	public static void main(String[] args) {
		int number = -18;
		if (number<0) {
			
			number = (number * -1);
			System.out.println("Correspnding Positive Number: "+number);
		}
		else {
			System.out.println("It is a PositiveNumber");
		}
		
		
	}

}
