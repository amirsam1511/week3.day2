package week3.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		//Declared and initialized a String literal
		String test = "I am a software tester";
		//Split the string and declare it as an Array
		String[] array = test.split(" ");
		String reversedString = "";
		//Iterate from 0 to array.length
		for (int i = 0; i < array.length; i++) 
		{
			//Store the array value in another string
			String word = array[i];
			//check only even words using mod operator
			if(i%2!=0) {
				String reverseWord = "";
				//Iterate from word.length -1 to 0 and decrement it to find the reverse of even nos
				for (int j = word.length() - 1; j >= 0; j--) {
					reverseWord = reverseWord + word.charAt(j);
				}
				reversedString = reversedString + reverseWord + " ";
			}
			else {
				//if odd print the words as it is including with concat " "
				reversedString = reversedString + word + " ";
			}
		}
		// Displaying the string after reverse
		System.out.print("Reversed string : " + reversedString);
	}

}