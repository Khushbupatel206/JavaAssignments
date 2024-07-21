package Assignment4;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

	public static void main(String[] args) {
		//Sort ArrayList of Strings alphabetically.  
		
		ArrayList<String> loc = new ArrayList<String>();
		
		loc.add("India");
		loc.add("Canada");
		loc.add("UK");
		loc.add("USA");
		
		System.out.println("list of locations before sorting is : " +loc);
		System.out.println("***************************");
		
		Collections.sort(loc);
		System.out.println("After using collections.sort sorting lis is : "+ loc);
		
		System.out.println("***************************");
		loc.sort(null);
		System.out.println("Sorted list using sort method : "+ loc);
	}

}
