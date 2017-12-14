package org.naic.brouhard.test;

import java.util.Arrays;


public class NAIC_EX {
	
	//Boolean variable for the return value of the anagram
	public static boolean  out = false; 
						
				
	public static void main(String[] args) {
		
		//Check of there are less than 2 arguments
		try {
				if (args.length < 2) throw new Exception();
		}
		catch (Exception e) {
					System.out.println(e + " There must be two arguments");
					System.exit(1);
		}


		//Check if there are more than 2 arguments
		try {
				if (args.length > 2)throw new IllegalArgumentException();
		}
		catch (IllegalArgumentException e) {
					System.out.println(e + " There only needs to be two arguments");
					System.exit(1);
		}
		
		
		//If there are exactly 2 arguments
		if(args.length == 2){
			
			//Pass in the arguments into to my anagram checker then print out if the 
			//2 arguments are an anagram of each other
			
			out = anagramChecker(args[0],args[1]);
		
			System.out.println(out);

		}
	}
	public static boolean anagramChecker(String string1, String string2){
			
			//Get rid of any white spaces if the string is a sentence
			string1 = string1.replaceAll("\\s", "");
			string2 = string2.replaceAll("\\s", "");
			
			
			//Change the string to an array of chars to better handle
			char[] str1 = string1.toCharArray();
			char[] str2 = string2.toCharArray();
			
			
			//Sort the array so if they are anagrams then the arrays will be
			//identical and return true, if the sorted arrays are not identical
			//then the strings are not anagrams and therefore return false.
			Arrays.sort(str1);
			Arrays.sort(str2);
			if(Arrays.equals(str1, str2)){
				
				return true;
			}
			else{
			
				return false;
			}
			
		}

	
}