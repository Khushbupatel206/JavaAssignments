package Assignment4;

import java.util.Hashtable;
import java.util.Map;

public class KeysOfHashTable {

	public static void main(String[] args) {
		//  Get Set view of keys from HashTable.
		
		Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
		ht.put(1,"Jon");
		ht.put(2,"Tars");
		ht.put(4,"Yug");
		ht.put(8,"Tree");
		
		System.out.println(ht);
		
		for(Map.Entry<Integer, String> i : ht.entrySet()) {
			System.out.println("Keys are: "+i.getKey());
			
		}

	}

}
