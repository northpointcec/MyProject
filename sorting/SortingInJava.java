package sorting;

import java.util.Arrays;
import java.util.Collections;

public class SortingInJava {

	public static void main(String[] args) {
		// Sorting in increasing order 
		Integer[] arr  = {5,7,8,3,9,4,6,1,};
	     Arrays.sort(arr);
	     for(int i:arr) {
	    	 System.out.print(i+" ");
	     }
	     // Sorting in decreasing order
	     System.out.println();
	     Arrays.sort(arr , Collections.reverseOrder());
	     for(int i:arr) {
	    	 System.out.print(i+" ");
	     }
	}
}
