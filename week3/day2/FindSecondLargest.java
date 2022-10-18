package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {
	public static void main(String[] args) {

		// Here is the input
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		//Declare the set and add to the set
		Set<Integer> secondno=new TreeSet<Integer>();
		for(int i=0;i<data.length;i++)
		{
			secondno.add(data[i]);
		}
		//Convert to list
		List<Integer> convert=new ArrayList<Integer>(secondno);
		//print
		System.out.println("The Input number are " +secondno);
		System.out.println("Total Count of Numbers are " +convert.size());
		System.out.println("The Second Largest Number is " +convert.get(4));
		
}}
