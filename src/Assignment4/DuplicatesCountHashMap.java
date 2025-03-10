package Assignment4;

import java.util.HashMap;
import java.util.Set;

public class DuplicatesCountHashMap {

	public static void main(String[] args) {
		//  Find duplicate characters with their occurrences count using HashMap. 
		
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		 
        //Converting given string to char array
		String inputString = "JavaJavaJava";
        char[] strArray = inputString.toCharArray();
 
        for (char c : strArray)
        {
            if(charCountMap.containsKey(c))
            {
               
                charCountMap.put(c, charCountMap.get(c)+1);
            }
            else
            {
                charCountMap.put(c, 1);
            }
        }
 
        Set<Character> charsInString = charCountMap.keySet();
 
        System.out.println("Duplicate Characters In -- "+inputString);
 
        for (Character ch : charsInString)
        {
            if(charCountMap.get(ch) > 1)
            {
                System.out.println(ch +" : "+ charCountMap.get(ch));
            }
        }
    }
}

    
       