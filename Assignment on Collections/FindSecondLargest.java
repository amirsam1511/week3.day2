package week3.day2.assignment4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {

		//Created an Array list and added values in it
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(3,2,11,4,6,7));
		
		//Sorted the list using collections
		Collections.sort(list);
		
		//Get the second largest number in list
		Integer integer = list.get(5-1);
		
		//Print it
		System.out.println("Second Largest Number is " + integer);
		
	}

}
