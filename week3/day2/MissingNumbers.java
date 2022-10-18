package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class MissingNumbers{
	
	public static void main(String[] args) {
		int[] data = {1,2,4,5,6,7,8,9,9,6,10};
		Set<Integer> missingno=new HashSet<Integer>();
		//Remove the duplicates using Set
		for(Integer series:data)
			missingno.add(series);
		//Make sure the set is in the ascending order
		System.out.println("Input Number is " +missingno);
		//Iterate from the starting number and verify the next number is + 1
		int i=1;	
			for(Integer number:missingno)	
			{
			if(number!=i) {
			System.out.println("Missing Number is " +i);
			break;
			}		
			i=i+1;
			}}}
