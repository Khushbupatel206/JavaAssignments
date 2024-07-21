package Assignment3;

import java.util.Arrays;

public class ConvertStringCharArray {

	public static void main(String[] args) {
		// Write a program to convert String to a character array and character array to String. 

		String s1 = "I am a Tester";
		
		char arr[] = s1.toCharArray();
		System.out.println("Converted for String to CharArray "+ Arrays.toString(arr));

		
	    
		System.out.println("*****************");
		System.out.println("Converting from charArray to String");
		
		String s2 = String.valueOf(arr);
		System.out.println("Coverted to String --> "+ s2);
		
	}

}
