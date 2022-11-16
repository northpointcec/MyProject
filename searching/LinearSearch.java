package searching;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int[] arr = new int [] {4,2,8,78,5,4,7,9,5};
		// It will print the index of element if found on the array 
		// It will print -1 if the element is not fount on the array
		System.out.println(linSearch(arr , n));
		sc.close();
	}
	public static int linSearch(int[] a , int n) {
		for(int i = 0; i<a.length; i++) {
			if(a[i]==n) {
				return i;
			}
		}
		return -1;
	}
}
