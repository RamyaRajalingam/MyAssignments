package week1.day2;
//import java.util.Arrays; 

public class IntersectionArrays {
	
	public static void main(String[] args) {
		int[] number1= {4,6,2,5,9,7};
		int[] number2= {3,6,9,1,8,5,7};
		int length1= number1.length;
		int length2=number2.length;
		
		for(int i=0;i<length1;i++) {
			
			for (int j=0;j<length2;j++) {
				
			if (number1[i]==number2[j]) {
			//Arrays.sort(number1[i]);
				System.out.println(number1[i]);
			}
			
			}	}	
		}}
	
//1. Need to know how to sort the result array and print in single line 
//2. what is the use of //import java.util.Arrays;  stmt