package Assignments;

import java.nio.file.spi.FileSystemProvider;
import java.util.Arrays;

public class SortArrayAscOrder {

	public static void main(String[] args) {
		char arr1[] = {'a','h','k','o','t','j'};
		
		System.out.println("Before sorting array: ");
		System.out.println(Arrays.toString(arr1));
		
		Arrays.sort(arr1);
		System.out.println("Arrays in asc order: " + Arrays.toString(arr1) );
		
		char a[] = arr1;
		System.out.println(Arrays.toString(a));
		
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+", ");
		}
		//System.out.println("Array in Desc order");
	}

}
