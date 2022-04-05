package week3.day2;

public class CharOccurance {

	public static void main(String[] args) {
		//Declared and initialized a String literal
		String str  = "welcome to chennai";
		//Declared and initialized a count variable to count the number of occurrences
		int count = 0;
		//Converted string to CharArray
		char[] charArray = str.toCharArray();
		System.out.println(charArray);
		// Iterate from 0 to Array length and added a condition for multiple occurrences 
		for (int i = 0; i < charArray.length; i++) {
			if(charArray[i] == 'e') {
				//Increment the count if occurrence is present
				count++;
			}
		}
		System.out.println(count);
	}

}
