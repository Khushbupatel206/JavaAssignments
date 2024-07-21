package Assignment4;

import java.util.ArrayList;
import java.util.HashSet;

public class CopyHashSettoObjectArray {

	public static void main(String[] args) {
		//Copy all elements of a HashSet to an Object array. 
		
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(34);
		hs.add(12);
		hs.add(15);
		hs.add(23);
		
		System.out.println("HashSet element list is : "+hs);

		System.out.println("-----------");
		
		ArrayList<Object> obj = new ArrayList<Object>(hs);
		System.out.println("Hashset elemennts copied to object type of Arraylist is "+ obj);
		//obj.addAll(hs);
		
		System.out.println("-----------");
		obj.add(20);
		obj.add(1);
		System.out.println("Added 2 more elements to object arraylist is : " +obj);
	}

}
