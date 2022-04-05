package week3.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		//Declared and initialized 2 String literals
		String text1 = "stops";
		String text2 = "potss";
		//Get the length of both strings
		int length1 = text1.length();
		int length2 = text2.length();
		//Verify if both length are same
		if(length1 == length2) {
			System.out.println("String Length are same");
		}
		//Converted the string to Char Array
		char[] charArray1 = text1.toCharArray();
		char[] charArray2 = text2.toCharArray();
		//Sort the charArrays
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		//Check if both the arrays are equal then print Anagram else Not a Anagram
		if(Arrays.equals(charArray1, charArray2)) {
			System.out.println("Both the strings are Anagram");
		}
		else {
			System.out.println("Both the strings are not Angram");
		}
	}

}
