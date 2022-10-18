package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicateNumbers {
	public static void main(String[] args) {
		//Input Data
		Integer[] data = {4,3,6,8,29,1,2,4,7,8};
		//Create Set
		Set<Integer> duplicateno=new HashSet<Integer>();
		
		// Add every element into Set -Find Duplicates
		for (Integer number:data) 
			if(duplicateno.contains(number))
			{
				duplicateno.remove(number);
				System.out.println("The duplicateno in the series is " +number);
			}
			else
			{
				duplicateno.add(number);
			}
	}
			
}
