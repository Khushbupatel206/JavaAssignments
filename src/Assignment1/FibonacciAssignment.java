package Assignment1;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class FibonacciAssignment {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num: ");
		int num = sc.nextInt();

		int n1=0;
		int n2=1;
		int result=0;
		
		System.out.print(n1 +" "+ n2 + " ");
		for(int i=0;i<num;i++) {
			result = n1+n2;
			System.out.print(result + " ");
			n1 = n2;
			n2 = result;
		}
	}

}
