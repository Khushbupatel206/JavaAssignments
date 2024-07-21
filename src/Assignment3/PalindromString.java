package Assignment3;

public class PalindromString {

	public static void main(String[] args) {
		// Write a program to check if a given string is a palindrome or not.
		// Palindrome example: trurt 
		
		String s = "trurt";
		String rev =" ";
		System.out.println("String before reverse : "+ s);
		
		char arr[] = s.toCharArray();
		
		for(int i=arr.length-1; i>=0;i--) {
			rev = rev+arr[i];
			
		}
		
		System.out.println("String after reverse is " + rev);
		
		if(s.equals(rev)) {
			System.out.println("String is palindrom");
		}
		else {
			System.out.println("String is not palindrom");
		}

	}

}
