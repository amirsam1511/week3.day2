package week3.day2.assignment4;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		//Created LinkedHashSet and added the values in it
		Set<String> names = new LinkedHashSet<String>();
		names.add("We");
		names.add("learn");
		names.add("java");
		names.add("basics");
		names.add("as");
		names.add("part");
		names.add("of");
		names.add("java");
		names.add("sessions");
		names.add("in");
		names.add("java");
		names.add("week1");
		
		//Iterate using for each loop to remove the duplicates and print it
		for (String string : names) {
			System.out.print(string + " ");
			
		}

	}

}
