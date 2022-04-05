package week3.day2.assignment4;

import java.util.LinkedList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		//Created a linked list
		List<Integer> list1 = new LinkedList<Integer>();
		//Added values in a list
		list1.add(3);
		list1.add(2);
		list1.add(11);
		list1.add(4);
		list1.add(6);
		list1.add(7);
		
		//Created another linked list
		List<Integer> list2 = new LinkedList<Integer>();
		//Added values in a list
		list2.add(1);
		list2.add(2);
		list2.add(8);
		list2.add(4);
		list2.add(9);
		list2.add(7);
		
		//Retains the elements which are common in both lists
		list1.retainAll(list2);
		//Print the 1st list
		System.out.println(list1);

	}

}
