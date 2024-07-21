package Assignment2;

public class AvgOfNumberArray {

	public static void main(String[] args) {
		/* Java Program to Calculate average of numbers using Array
		Example:
			values [] = 1, 2,3 4, 5
			average = 3
		*/
		
		int arr[] = {20,30,40,50};
		int avg, sum=0;
		
		for(int i:arr) {
			sum = sum+i;
		}
		
		System.out.println("Sum of arr is: " + sum);
		avg = sum/4;
		System.out.println("Total average is: " + avg);
		

	}

}
