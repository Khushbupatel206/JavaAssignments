package Assignment2;

public class DuplicatesInArray {

	public static void main(String[] args) {
		// Find the duplicates in an array 12, 32, 12, 45, 65, 93, 0, 23, 45, 6
		
		int num[] = {12, 32, 12, 45, 65, 93, 0, 23, 45, 6};
		
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]==num[j]) {
					System.out.println("Duplicate Eelement in Array is " + num[i]);
				}
			}
		}
		

	}

}
