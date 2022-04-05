package week3.day2;

public class FindTypes {

	public static void main(String[] args) {
		//Declared and initialized a String literal
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		//Declared and initialized a count variable to count the number of letter,spaces,number and special characters
		int letter = 0, space = 0, num= 0, specialChar = 0;
		//Converted the string to CharArray
		char[] charArray = test.toCharArray();
		System.out.println(charArray);
		//Iterate using for loop to charArray.length
		for (int i = 0; i < charArray.length; i++) {
			//Checked the charArray for letters and incremented the count
			if((charArray[i]>=65 && charArray[i]<=90)||(charArray[i]>=97 && charArray[i]<=122)) {
			letter++;	
			}
			//Checked the charArray for numbers and incremented the count
			else if(charArray[i]>=48 && charArray[i]<=57) {
				num++;
			}
			//Checked the charArray for space and incremented the count
			else if(charArray[i] == ' ') {
				space++;
			}
			//Checked the charArray for specialCharacter using if-else and incremented the count
			else {
				specialChar++;
			}
			
		}
		//Print the values
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharacter: " + specialChar);
	}

}
