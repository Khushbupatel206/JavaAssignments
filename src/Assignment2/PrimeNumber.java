package Assignment2;

public class PrimeNumber {

	public static void main(String[] args) {
		
		// Is 13 a prime number? 

		int num =7;
		int count = 0;
		
		for(int i=2; i<num;i++) {
			if(num%i==0) {
				count++;
				break;	
			}
		}
		
		if(count == 0) {
			System.out.println(num + " is a prime number ");
		}
		else {
			System.out.println(num + " is not a prime number ");
		}
	}

}
