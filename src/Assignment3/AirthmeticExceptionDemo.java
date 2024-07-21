package Assignment3;

import java.util.Scanner;

public class AirthmeticExceptionDemo {

	static void division() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers");
		int num1 =sc.nextInt();
		int num2 =sc.nextInt();
		
		System.out.println(num1/num2);
	}
	public static void main(String[] args) {
		// Write a program where a method declares that it throws ArithmeticException.
        
		try {
			division();
		}
		catch(Exception e) {
			System.out.println("AirthmeticExpetion is thrown, Please enter a correct number");
		}
		
	}

}
