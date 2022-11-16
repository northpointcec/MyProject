package searching;

import java.util.Scanner;

public class LastOccurrence {
      //Using binary search
	public static void main(String[] args) {
		// Array must be sorted 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int[] arra = new int[] {1,2,2,2,3,4,5,6,6,6,8,9,10,11,12};
		System.out.println(lastOccu(arra ,n));
		
	}
	public static int lastOccu( int[] arr , int n) {
		int low = 0; 
		int high = arr.length-1;
		while(low<=high) {
			int mid = (low + high)/2;
			if(n>arr[mid]) {
				low = mid +	1;
			}else if(arr[mid]>n) {
				high = mid-1;
			}else {
				if((mid==(arr.length-1)) || arr[mid]!=arr[mid+1] ) {
					return mid;
				}else {
					low = mid +1;
				}
			}
		}
		return -1;
	}
}
// Time complexity O (logn)