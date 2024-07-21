package Assignment3;

import java.util.HashMap;
import java.util.Map;

public class PrintEachChar {
    
	public static void getCharCount(String str) {
		char strArray[] = str.replace(" ","").toLowerCase().toCharArray(); 
		
		HashMap<Character, Integer> charMap = new HashMap<>();
		
		
		for(char c:strArray) {
			if(charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c)+1);
			}
			else {
				charMap.put(c,1);
			}
			
			
		}System.out.println(charMap);
	}
	
	
	public static void main(String[] args) {
		//Write a program to print the occurrence of each character in the String
		// “DevLabs Alliance Training”
		
		//String s ="DevLabs Alliance Training";
		getCharCount("DevLabs Alliance Training");
	
		
		
		
	}

}
