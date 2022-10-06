package week1.day2;
import java.util.Arrays; 

public class SecondLargestUsingArrays {
	
	public static void main(String[] args) {
	
		    int[] numbers = {12,8,6,4,45,75,88};
			int length = numbers.length;
			//System.out.println(length);
			Arrays.sort(numbers);
			System.out.println("second largest number is " + numbers[numbers.length-2]);	
			
	}

}

// if i put index no -2 showing error need to know how to resolve

