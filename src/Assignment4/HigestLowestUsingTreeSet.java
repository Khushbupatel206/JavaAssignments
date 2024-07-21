package Assignment4;

import java.util.TreeSet;

public class HigestLowestUsingTreeSet {

	public static void main(String[] args) {
		//  Get highest and lowest value stored in TreeSet
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		ts.add(10);
		ts.add(1);
		ts.add(7);
		ts.add(4);
		ts.add(9);

		System.out.println(ts);
		System.out.println("Total elements: "+ts.size());
		
		for(int i:ts) {
			System.out.println(i);
	
		}
	}

}
