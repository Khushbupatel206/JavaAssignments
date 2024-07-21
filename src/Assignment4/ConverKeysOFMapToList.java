package Assignment4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ConverKeysOFMapToList {

	public static void main(String[] args) {
		// Convert keys of a map to a list
		
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		
		map.put("abc", 1);
		map.put("xyz", 2);
		map.put("pqr", 3);
		
		System.out.println(map);

		System.out.println("*********");
		
		for(Map.Entry<String, Integer> i : map.entrySet()) {
			System.out.println("Keys is: "+i.getKey());
			
		}
		
		/*
		System.out.println("**********");
		Set<Entry<String,Integer>> set = map.entrySet();
		Iterator<Entry<String,Integer>> ir = set.iterator();
		while(ir.hasNext()) {
			System.out.println(ir.next()); 
		}*/
		
		
			
	}

}
