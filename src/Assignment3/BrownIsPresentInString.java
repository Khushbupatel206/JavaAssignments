package Assignment3;

public class BrownIsPresentInString {

	public static void main(String[] args) {
		//  Write a program to check “brown” is present in the string: A brown fox ran away fast
		
		String s = "A brown fox ran away fast";
		
		if(s.contains("brown")) {
			System.out.println("brown is present in string");
		}else {
			System.out.println("brown is not present in string");
		}

	}

}
