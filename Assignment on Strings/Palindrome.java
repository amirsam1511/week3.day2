package week3.day2;

public class Palindrome {

	public static void main(String[] args) {
		//Declared and initialized a String literal
		String original = "madam";
		//print the original
		System.out.println(original);
		String reverse = "";
		//Iterate from original length -1 to 0 to capture the reverse
		for (int i =original.length()-1;i>=0; i--) {
			reverse = reverse + original.charAt(i);
		}
		//print the reverse
		System.out.println(reverse);
		//Check if both the string matches then palindrome else not a palindrome
		if(original.equals(reverse)) {
			System.out.println("It is a Palindrome");
		}
		else {
			System.out.println("It is not a Palindorme");
		}
	}
	
	

}
