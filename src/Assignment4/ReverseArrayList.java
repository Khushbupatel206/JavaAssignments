package Assignment4;

import java.util.ArrayList;

public class ReverseArrayList {

	public static void main(String[] args) {
		// Reverse an Arraylist. 
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(38);
		al.add(23);
		al.add(45);
		al.add(50);
		al.add(56);
		
		System.out.println(al.size());
		System.out.println("ArrayList before reversed --> "+al);
		
		//al.reversed();
		System.out.println("Reversed ArrayList --> " + al.reversed());
	System.out.println("**************************");
	
		ArrayList<String> loc = new ArrayList<String>();
		
		loc.add("India");
		loc.add("Canada");
		loc.add("UK");
		loc.add("USA");
		
		System.out.println("list of location is : " +loc);
		for(String i:loc) {
			System.out.println(i);
		}
		
		System.out.println("Reversed list is : "+loc.reversed());
		for(String i:loc) {
			System.out.println(i);
		}
	}

}
