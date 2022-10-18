package week3.day2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {
	public static void main(String[] args) {
		// Declare a String array and add the Strings values as (HCL, Wipro,  Aspire Systems, CTS)		

		List<String> list=new ArrayList<String>();
		list.add("HCL");
		list.add("Wipro");
		list.add("Aspire Systems");
		list.add("CTS");

		
		// get the length of the array	
		
		System.out.println("Length of an array is" +list.size());
		// sort the array	
		Collections.sort(list);	
		
		// Iterate it in the reverse order
		Collections.reverse(list);
		
		// print the array
		System.out.println("Reverse Order is " +list);
			
		// Required Output: Wipro, HCL , CTS, Aspire Systems

		}

}
