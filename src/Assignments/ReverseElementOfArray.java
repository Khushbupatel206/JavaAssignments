package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseElementOfArray {
	
	public static void swap(int arr[], int n) {
		
	int  k;
		for(int i=0; i<arr.length/2; i++) {
			int temp = arr[arr.length-1-i];
			arr[arr.length-1-i]= arr[i];
			arr[i]=temp;
		}
		
		 System.out.println("Reversed array is : \n");
	        for (k = 0; k < n; k++) {
	            System.out.println(arr[k]);
	        }
	}

	public static void main(String[] args) {
		
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a arr ");
		for(int i=0; i<5; i++) {
			arr[i] = sc.nextInt();
		}
		
		swap(arr,arr.length);
		sc.close();
		
		

	}

}
