package Assignment2;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		/*
		 * Find the sum of digits
			Example:
			int n = 1234;
			output: 10 		
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num : ");
		int num = sc.nextInt();
		int sum = 0;
		
		while(num>0) {
			sum = sum +num%10;
			num = num/10;
		}
		System.out.println("Sum of digits in number is " + sum);
	}

}
