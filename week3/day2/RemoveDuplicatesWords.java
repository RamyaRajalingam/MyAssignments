package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesWords {
	public static void main(String[] args) 
	{
		//Declare String text as input
		String text = "We learn java basics as part of java sessions in java week1";
		//Split the String based on white spaces and save as String Array
		String[] Array=text.split(" ");
		//Create a empty Set 
		Set<String> words=new HashSet<String>();
		//Iterate the String array and add each word into Set
		for(int i=0;i<Array.length;i++) {
			words.add(Array[i]);
		}
		System.out.println(words);
	}
}
