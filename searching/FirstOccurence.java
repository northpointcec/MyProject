package searching;

import java.util.Scanner;

public class FirstOccurence {
     //using binary search
	public static void main(String[] args) {
		//To find first occurrence array must be sorted
		Scanner sc = new Scanner(System.in);
		// Element to be find
		int n = sc.nextInt();
		sc.close();
		int[] arra = new int[] {1,2,2,2,3,4,5,6,6,6,8,9,10,11,12};
		System.out.println(firstOccu(arra , n));
		
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
}
//Time complexity O(logn)