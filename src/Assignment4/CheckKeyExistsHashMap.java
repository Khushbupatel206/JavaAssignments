package Assignment4;

import java.util.HashMap;
import java.util.Map;

public class CheckKeyExistsHashMap {

	public static void main(String[] args) {
		//  Check if a particular key exists in HashMap. 
		
		HashMap<String, Object> map = new HashMap<String,Object>();
		map.put("Bradford", "L3Z");
		map.put("Etobicoke", "M9V");
		map.put("Brampton", "L4T");
		
		System.out.println(map);
		
		System.out.println("Contains Key Vaughan ? : "+map.containsKey("Vaughan")); // false
	    System.out.println("Contains Value L3Z ? : "+map.containsValue("L3Z")); //true
	    System.out.println("Contains Key Bradford ? : "+map.containsKey("Bradford"));
		
	    //iterated 
	    System.out.println("************");
	    for(Map.Entry<String,Object> i:map.entrySet()) {
	    	System.out.println(i.getKey()+" : " + i.getValue());
	    }
		

	}

}
