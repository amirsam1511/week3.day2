package week3.day2.assignment4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		
		//Created an Array list and added values in it
		List<Integer>list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,7,6,8));
		////Sorted the list using collections
		Collections.sort(list);
		//Print the sorted list
		System.out.println(list);
		//Get the size of list
		int size = list.size();
		// Iterate using for loop to find the missing number in list and printed it
		for (int i = list.get(0); i < size; i++) {
			if(i != list.get(i-1)) {
				System.out.println("Missing Element in Array is " + i);	
				break;
		}

	}
	}
}
