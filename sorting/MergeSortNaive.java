package sorting;

import java.util.Arrays;

public class MergeSortNaive {
	
	public static void main(String[] args) {
		int[] a = {2,5,7,8,9};
		int[] b = {3,4,6,10,11,12};
		mergeSort(a , b);
		
	}
	public static void mergeSort( int[] a , int[] b) {
		int[] c = new int[a.length+b.length];
		for( int i = 0; i<a.length; i++) {
			c[i] = a[i];
		}
		for( int i = 0; i<b.length; i++) {
			c[i+a.length] = b[i];
		}
		Arrays.sort(c);
		for( int i:c) {
			System.out.print(i+" ");
		}
	}

}
