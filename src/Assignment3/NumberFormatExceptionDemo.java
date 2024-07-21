package Assignment3;

import java.util.Scanner;

public class NumberFormatExceptionDemo {

	public static void main(String[] args) {
		//. Write a program to throw NumberFormatException and handle it appropriately with a proper
		//message.
		//If you pass invalid input to parseInt(str), this exception will be thrown
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		String num = sc.next();
		//int num2 = sc.nextInt();
		
		try {
		int a = Integer.parseInt(num); // NumberFormatExceptionDemo
		System.out.println(a);
		}
		catch(Exception E){
			System.out.println("Pleas Enter number instead string OR Char ");
		}
		
	}
}


