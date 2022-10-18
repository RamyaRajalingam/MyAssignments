package week3.day2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {
public static void main(String[] args) {		
		
//		Declare a String as PayPal India
	String text="PayPal India";

//		Convert it into a character array
		char[] chararray = text.toCharArray(); 
	

//		Declare a Set as charSet for Character
			Set<Character> CharSet=new HashSet<Character>();

//		Declare a Set as dupCharSet for duplicate Character
			Set<Character> dupCharSet=new HashSet<Character>();

//		Iterate character array and add it into charSet
			for(Character add:chararray){
			//CharSet.add(add);
			if(!CharSet.add(add));{
			dupCharSet.add(add);
			}
			}
// Remove duplicates and spaces - Print the character
			if(dupCharSet.remove(' ')) {
		System.out.println("After Removing duplicates and spaces :" +dupCharSet);
			}
	}
}
	
