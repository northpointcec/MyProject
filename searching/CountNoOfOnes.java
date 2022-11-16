package searching;

import java.util.Arrays;

public class CountNoOfOnes {

	public static void main(String[] args) {
		int[] arr = {0,1,0,1,0,1,1,1,1,0,1,0,1,0,1,1,1,1,0};
		Arrays.sort(arr);
		System.out.println(count(arr));
	}
	public static int count(int[] arr) {
		int first = firstOccu(arr , 1);
		if(first==0) {
			return 0;
		}else {
			return lastOccu(arr ,1) -first +1;
		}
	}
	public static int firstOccu(int[] arr  , int n) {
		int low = 0; 
		int high = arr.length-1;
		while(low<=high) {
			int mid = (high +low)/2;
			if(n>arr[mid]) {
				low = mid +1;
			}else if(n<arr[mid]) {
				high = mid-1;
			}else {
				if(mid==0 || arr[mid-1]!=arr[mid]) {
					return mid;
				}else {
					high = mid-1;
				}
			}

		}
		return -1;
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
}//Time complexity O(logn)
