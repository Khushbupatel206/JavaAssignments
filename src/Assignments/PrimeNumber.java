package Assignments;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num to print prime numbers: ");
		int num = sc.nextInt();

		int total = 0;
		int count = 1;
		
		for(int i=1;i<=num;i++) {
			count =0;
			for(int j=2;j<=i-1;j++) 
			{	
			if(i%j==0) {
				count++;
				break;
			}
			
		}
		if(count == 0) {
			System.out.println(i + " ");
			total = total +1;
		}
		
	} System.out.println("Total prime numbers between 1 to " + num + " is = " + total);

}
}
