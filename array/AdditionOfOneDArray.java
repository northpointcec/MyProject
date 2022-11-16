package array;

import java.util.Scanner;

public class AdditionOfOneDArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	    int[] arr = new int[n];
	    for( int i = 0; i<n; i++) {
	    	int x ;
	    	x = sc.nextInt();
	    	arr[i] = x;
	    	
	    }
	   AdditionOfOneDArray o = new AdditionOfOneDArray();
	    System.out.println(o.add(arr));
	    sc.close();
	    
	}
	public int add(int[] arr) {
		int sum = 0;
		for( int i =0; i<arr.length;i++) {
			sum = sum +arr[i];
		}
		return sum;
	}
}
