package week3.day2.assignment4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		
		//Created an Array list and added values in it
		List<Integer>list = new ArrayList<Integer>(Arrays.asList(14,12,13,11,15,14,18,16,17,19,18,17,20));
		
		//Created a Hashset to verify if duplicated values are present
		Set<Integer> set = new HashSet<Integer>();
		
		//Iterate using for each loop and compared the set with the list to print the duplicated values in list
		for (Integer integer : list) {
			if(set.add(integer) == false)
			System.out.println(integer);
		}
	}

}
