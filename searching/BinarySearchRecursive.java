package searching;

import java.util.Scanner;

public class BinarySearchRecursive {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 //This method closes the Scanner
		 sc.close();
		 int[] arr = new int [] {1,2,3,4,5,6,7,8,9,10};
		 int low = 0; 
		 int high = arr.length-1;
		 System.out.println(binSearchRe(arr , low ,high ,n));
	}
	public static int binSearchRe(int[] arr , int low , int high , int n) {
		if(low>high) {
			return -1;
		}
		int mid = (low+high)/2;
		if(arr[mid]==n) {
			return mid;
		}else if(n>mid) {
			return binSearchRe(arr , mid+1, high , n);
					
		}else {
			return binSearchRe(arr , low , mid -1, n);
		}
	}
}
// it takes the time complexity of O(logn)
// Space complexity of O(logn)