package Assignment1;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter base: ");
		int base = sc.nextInt();
		
		System.out.println("Enter height: ");
		int height = sc.nextInt();
		int area;
		
		area = (base * height) /2;
		
		System.out.println("Area of Triangle is " +area);

	}

}
