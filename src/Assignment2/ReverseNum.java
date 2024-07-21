package Assignment2;

public class ReverseNum {

	public static void main(String[] args) {
		
		//  Reverse a number 123 
		
		int num=123,r,sum=0;
		int temp = num;
		
		while(num>0) {
			r = num%10;
			num = num/10;
			sum = sum * 10 + r;
		}
		
		System.out.println(temp + " Number is Reversed as : " + sum);
	}

}
