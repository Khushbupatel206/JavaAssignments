package Assignment1;

public class EvenNumberTillFifty {

	public static void main(String[] args) {
		System.out.println("Priting all even numbers from 1 to 50 -- >");
		
		for(int i=1; i<=50; i++) {
			if(i%2==0) {
				System.out.print(i + " ");
			}
		}
	}

}
